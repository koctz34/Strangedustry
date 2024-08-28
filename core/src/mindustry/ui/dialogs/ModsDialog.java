package mindustry.ui.dialogs;

import arc.*;
import arc.files.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.Texture.*;
import arc.graphics.g2d.*;
import arc.input.*;
import arc.scene.style.*;
import arc.scene.ui.TextButton.*;
import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.*;
import arc.util.Http.*;
import arc.util.io.*;
import arc.util.serialization.*;
import arc.util.serialization.Jval.*;
import mindustry.*;
import mindustry.core.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.io.*;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import mindustry.ui.*;

import java.text.*;
import java.util.*;

import static mindustry.Vars.*;

public class ModsDialog extends BaseDialog{
    private ObjectMap<String, TextureRegion> textureCache = new ObjectMap<>();

    private float modImportProgress;
    private String searchtxt = "Okay, okay...";
    private @Nullable Seq<ModListing> modList;
    private boolean orderDate = true;
    private BaseDialog currentContent;

    private BaseDialog browser;
    private Table browserTable;
    private float scroll = 0f;

    public ModsDialog(){
        super("@mods");
        addCloseButton();

        browser = new BaseDialog("@mods.browser");
        browser.cont.add("OOoooppsss... i broke this. Yes.").row();
    }

    void modError(Throwable error){
        ui.loadfrag.hide();

        if(error instanceof NoSuchMethodError || Strings.getCauses(error).contains(t -> t.getMessage() != null && (t.getMessage().contains("trust anchor") || t.getMessage().contains("SSL") || t.getMessage().contains("protocol")))){
            ui.showErrorMessage("@feature.unsupported");
        }else if(error instanceof HttpStatusException st){
            ui.showErrorMessage(Core.bundle.format("connectfail", Strings.capitalize(st.status.toString().toLowerCase())));
        }else{
            ui.showException(error);
        }
    }

    void getModList(Cons<Seq<ModListing>> listener){
        if(modList == null){
            Http.get("https://raw.githubusercontent.com/Anuken/MindustryMods/master/mods.json", response -> {
                String strResult = response.getResultAsString();

                Core.app.post(() -> {
                    try{
                        modList = JsonIO.json.fromJson(Seq.class, ModListing.class, strResult);

                        var d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                        Func<String, Date> parser = text -> {
                            try{
                                return d.parse(text);
                            }catch(Exception e){
                                return new Date();
                            }
                        };

                        modList.sortComparing(m -> parser.get(m.lastUpdated)).reverse();
                        listener.get(modList);
                    }catch(Exception e){
                        e.printStackTrace();
                        ui.showException(e);
                    }
                });
            }, error -> Core.app.post(() -> modError(error)));
        }else{
            listener.get(modList);
        }
    }

    void setup(){
        float h = 110f;
        float w = Math.min(Core.graphics.getWidth() / Scl.scl(1.05f), 520f);

        cont.clear();
        cont.defaults().width(Math.min(Core.graphics.getWidth() / Scl.scl(1.05f), 556f)).pad(4);
        cont.add("@mod.reloadrequired").visible(mods::requiresReload).center().get().setAlignment(Align.center);
        cont.row();

        cont.row();
    }

    private @Nullable String getStateText(LoadedMod item){
        if(item.isOutdated()){
            return "@mod.incompatiblemod";
        }else if(item.isBlacklisted()){
            return "@mod.blacklisted";
        }else if(!item.isSupported()){
            return "@mod.incompatiblegame";
        }else if(item.state == ModState.circularDependencies){
            return "@mod.circulardependencies";
        }else if(item.state == ModState.incompleteDependencies){
            return "@mod.incompletedependencies";
        }else if(item.hasUnmetDependencies()){
            return "@mod.unmetdependencies";
        }else if(item.hasContentErrors()){
            return "@mod.erroredcontent";
        }else if(item.meta.hidden){
            return "@mod.multiplayer.compatible";
        }
        return null;
    }

    private @Nullable String getStateDetails(LoadedMod item){
        if(item.isOutdated()){
            return "@mod.outdatedv7.details";
        }else if(item.isBlacklisted()){
            return "@mod.blacklisted.details";
        }else if(!item.isSupported()){
            return Core.bundle.format("mod.requiresversion.details", item.meta.minGameVersion);
        }else if(item.state == ModState.circularDependencies){
            return "@mod.circulardependencies.details";
        }else if(item.state == ModState.incompleteDependencies){
            return Core.bundle.format("mod.incompletedependencies.details", item.missingDependencies.toString(", "));
        }else if(item.hasUnmetDependencies()){
            return Core.bundle.format("mod.missingdependencies.details", item.missingDependencies.toString(", "));
        }else if(item.hasContentErrors()){
            return "@mod.erroredcontent.details";
        }
        return null;
    }

    private void reload(){
        ui.showInfoOnHidden("@mods.reloadexit", () -> {
            Log.info("Exiting to reload mods.");
            Core.app.exit();
        });
    }

    private void showMod(LoadedMod mod){
        BaseDialog dialog = new BaseDialog(mod.meta.displayName);

        dialog.addCloseButton();

        dialog.cont.pane(desc -> {
            desc.center();
            desc.add("Oops.. i broke this..").padRight(10).color(Color.gray).padTop(0);
        }).width(400f);

        dialog.show();
    }

    private void handleMod(String repo, HttpResponse result){
        try{
            Fi file = tmpDirectory.child(repo.replace("/", "") + ".zip");
            long len = result.getContentLength();
            Floatc cons = len <= 0 ? f -> {} : p -> modImportProgress = p;

            try(var stream = file.write(false)){
                Streams.copyProgress(result.getResultAsStream(), stream, len, 4096, cons);
            }

            var mod = mods.importMod(file);
            mod.setRepo(repo);
            file.delete();
            Core.app.post(() -> {

                try{
                    setup();
                    ui.loadfrag.hide();
                }catch(Throwable e){
                    ui.showException(e);
                }
            });
        }catch(Throwable e){
            modError(e);
        }
    }

    private void importFail(Throwable t){
        Core.app.post(() -> modError(t));
    }
}
