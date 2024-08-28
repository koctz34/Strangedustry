package mindustry.content;

import arc.struct.Seq;
import mindustry.game.Objectives;
import mindustry.game.Objectives.Research;
import mindustry.game.Objectives.SectorComplete;

import static mindustry.content.Blocks.*;
import static mindustry.content.SectorPresets.craters;
import static mindustry.content.SectorPresets.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;

public class AllTechTree {

    public static void load() {
        Planets.tantros.techTree = nodeRoot("ALL", coreAcropolis, () -> {

            node(conveyor, () -> {

                node(junction, () -> {
                    node(router, () -> {
                        node(launchPad, Seq.with(new SectorComplete(extractionOutpost)), () -> {
                            //no longer necessary to beat the campaign
                            //node(interplanetaryAccelerator, Seq.with(new SectorComplete(planetaryTerminal)), () -> {

                            //});
                        });

                        node(distributor);
                        node(sorter, () -> {
                            node(invertedSorter);
                            node(overflowGate, () -> {
                                node(underflowGate);
                            });
                        });
                        node(container, Seq.with(new SectorComplete(biomassFacility)), () -> {
                            node(unloader);
                            node(vault, Seq.with(new SectorComplete(stainedMountains)), () -> {

                            });
                        });

                        node(itemBridge, () -> {
                            node(titaniumConveyor, Seq.with(new SectorComplete(craters)), () -> {
                                node(phaseConveyor, () -> {
                                    node(massDriver, () -> {

                                    });
                                });

                                node(payloadConveyor, () -> {
                                    node(payloadRouter, () -> {

                                    });
                                });

                                node(armoredConveyor, () -> {
                                    node(plastaniumConveyor, () -> {

                                    });
                                });
                            });
                        });
                    });
                });
            });

            node(coreFoundation, () -> {
                node(coreNucleus, () -> {

                });
            });

            node(mechanicalDrill, () -> {

                node(mechanicalPump, () -> {
                    node(conduit, () -> {
                        node(liquidJunction, () -> {
                            node(liquidRouter, () -> {
                                node(liquidContainer, () -> {
                                    node(liquidTank);
                                });

                                node(bridgeConduit);

                                node(pulseConduit, Seq.with(new SectorComplete(windsweptIslands)), () -> {
                                    node(phaseConduit, () -> {

                                    });

                                    node(platedConduit, () -> {

                                    });

                                    node(rotaryPump, () -> {
                                        node(impulsePump, () -> {

                                        });
                                    });
                                });
                            });
                        });
                    });
                });

                node(graphitePress, () -> {
                    node(pneumaticDrill, Seq.with(new SectorComplete(frozenForest)), () -> {
                        node(cultivator, Seq.with(new SectorComplete(biomassFacility)), () -> {

                        });

                        node(laserDrill, () -> {
                            node(blastDrill, Seq.with(new SectorComplete(nuclearComplex)), () -> {

                            });

                            node(waterExtractor, Seq.with(new SectorComplete(saltFlats)), () -> {
                                node(oilExtractor, () -> {

                                });
                            });
                        });
                    });

                    node(pyratiteMixer, () -> {
                        node(blastMixer, () -> {

                        });
                    });

                    node(siliconSmelter, () -> {

                        node(sporePress, () -> {
                            node(coalCentrifuge, () -> {
                                node(multiPress, () -> {
                                    node(siliconCrucible, () -> {

                                    });
                                });
                            });

                            node(plastaniumCompressor, Seq.with(new SectorComplete(windsweptIslands)), () -> {
                                node(phaseWeaver, Seq.with(new SectorComplete(tarFields)), () -> {

                                });
                            });
                        });

                        node(kiln, Seq.with(new SectorComplete(craters)), () -> {
                            node(pulverizer, () -> {
                                node(incinerator, () -> {
                                    node(melter, () -> {
                                        node(surgeSmelter, () -> {

                                        });

                                        node(separator, () -> {
                                            node(disassembler, () -> {

                                            });
                                        });

                                        node(cryofluidMixer, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        //logic disabled until further notice
                        node(microProcessor, () -> {
                            node(switchBlock, () -> {
                                node(message, () -> {
                                    node(logicDisplay, () -> {
                                        node(largeLogicDisplay, () -> {

                                        });
                                    });

                                    node(memoryCell, () -> {
                                        node(memoryBank, () -> {

                                        });
                                    });
                                });

                                node(logicProcessor, () -> {
                                    node(hyperProcessor, () -> {

                                    });
                                });
                            });
                        });

                        node(illuminator, () -> {

                        });
                    });
                });


                node(combustionGenerator, Seq.with(new Research(Items.coal)), () -> {
                    node(powerNode, () -> {
                        node(powerNodeLarge, () -> {
                            node(diode, () -> {
                                node(surgeTower, () -> {

                                });
                            });
                        });

                        node(battery, () -> {
                            node(batteryLarge, () -> {

                            });
                        });

                        node(mender, () -> {
                            node(mendProjector, () -> {
                                node(forceProjector, Seq.with(new SectorComplete(impact0078)), () -> {
                                    node(overdriveProjector, Seq.with(new SectorComplete(impact0078)), () -> {
                                        node(overdriveDome, Seq.with(new SectorComplete(impact0078)), () -> {

                                        });
                                    });
                                });

                                node(repairPoint, () -> {
                                    node(repairTurret, () -> {

                                    });
                                });
                            });
                        });

                        node(steamGenerator, Seq.with(new SectorComplete(craters)), () -> {
                            node(thermalGenerator, () -> {
                                node(differentialGenerator, () -> {
                                    node(thoriumReactor, Seq.with(new Research(Liquids.cryofluid)), () -> {
                                        node(impactReactor, () -> {

                                        });

                                        node(rtgGenerator, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        node(solarPanel, () -> {
                            node(largeSolarPanel, () -> {

                            });
                        });
                    });
                });
            });

            node(duo, () -> {
                node(copperWall, () -> {
                    node(copperWallLarge, () -> {
                        node(titaniumWall, () -> {
                            node(titaniumWallLarge);

                            node(door, () -> {
                                node(doorLarge);
                            });
                            node(plastaniumWall, () -> {
                                node(plastaniumWallLarge, () -> {

                                });
                            });
                            node(thoriumWall, () -> {
                                node(thoriumWallLarge);
                                node(surgeWall, () -> {
                                    node(surgeWallLarge);
                                    node(phaseWall, () -> {
                                        node(phaseWallLarge);
                                    });
                                });
                            });
                        });
                    });
                });

                node(scatter, () -> {
                    node(hail, Seq.with(new SectorComplete(craters)), () -> {
                        node(salvo, () -> {
                            node(swarmer, () -> {
                                node(cyclone, () -> {
                                    node(spectre, Seq.with(new SectorComplete(nuclearComplex)), () -> {

                                    });
                                });
                            });

                            node(ripple, () -> {
                                node(fuse, () -> {

                                });
                            });
                        });
                    });
                });

                node(scorch, () -> {
                    node(arc, () -> {
                        node(wave, () -> {
                            node(parallax, () -> {
                                node(segment, () -> {

                                });
                            });

                            node(tsunami, () -> {

                            });
                        });

                        node(lancer, () -> {
                            node(meltdown, () -> {
                                node(foreshadow, () -> {

                                });
                            });

                            node(shockMine, () -> {

                            });
                        });
                    });
                });
            });

            node(groundZero, () -> {
                node(frozenForest, Seq.with(
                        new SectorComplete(groundZero),
                        new Research(junction),
                        new Research(router)
                ), () -> {
                    node(craters, Seq.with(
                            new SectorComplete(frozenForest),
                            new Research(mender),
                            new Research(combustionGenerator)
                    ), () -> {
                        node(ruinousShores, Seq.with(
                                new SectorComplete(craters),
                                new Research(graphitePress),
                                new Research(kiln),
                                new Research(mechanicalPump)
                        ), () -> {
                            node(windsweptIslands, Seq.with(
                                    new SectorComplete(ruinousShores),
                                    new Research(pneumaticDrill),
                                    new Research(hail),
                                    new Research(siliconSmelter),
                                    new Research(steamGenerator)
                            ), () -> {
                                node(tarFields, Seq.with(
                                        new SectorComplete(windsweptIslands),
                                        new Research(coalCentrifuge),
                                        new Research(conduit),
                                        new Research(wave)
                                ), () -> {
                                    node(impact0078, Seq.with(
                                            new SectorComplete(tarFields),
                                            new Research(Items.thorium),
                                            new Research(lancer),
                                            new Research(salvo),
                                            new Research(coreFoundation)
                                    ), () -> {
                                        node(desolateRift, Seq.with(
                                                new SectorComplete(impact0078),
                                                new Research(thermalGenerator),
                                                new Research(thoriumReactor),
                                                new Research(coreNucleus)
                                        ), () -> {
                                            node(planetaryTerminal, Seq.with(
                                                    new SectorComplete(desolateRift),
                                                    new SectorComplete(nuclearComplex),
                                                    new SectorComplete(overgrowth),
                                                    new SectorComplete(extractionOutpost),
                                                    new SectorComplete(saltFlats),
                                                    new Research(risso),
                                                    new Research(minke),
                                                    new Research(bryde),
                                                    new Research(spectre),
                                                    new Research(launchPad),
                                                    new Research(massDriver),
                                                    new Research(impactReactor),
                                                    new Research(additiveReconstructor),
                                                    new Research(exponentialReconstructor)
                                            ), () -> {

                                            });
                                        });
                                    });
                                });

                                node(extractionOutpost, Seq.with(
                                        new SectorComplete(stainedMountains),
                                        new SectorComplete(windsweptIslands),
                                        new Research(groundFactory),
                                        new Research(nova),
                                        new Research(airFactory),
                                        new Research(mono)
                                ), () -> {

                                });

                                node(saltFlats, Seq.with(
                                        new SectorComplete(windsweptIslands),
                                        new Research(groundFactory),
                                        new Research(additiveReconstructor),
                                        new Research(airFactory),
                                        new Research(door)
                                ), () -> {
                                    node(coastline, Seq.with(
                                            new SectorComplete(windsweptIslands),
                                            new SectorComplete(saltFlats),
                                            new Research(navalFactory),
                                            new Research(payloadConveyor)
                                    ), () -> {
                                        node(navalFortress, Seq.with(
                                                new SectorComplete(coastline),
                                                new SectorComplete(extractionOutpost),
                                                new Research(oxynoe),
                                                new Research(minke),
                                                new Research(cyclone),
                                                new Research(ripple)
                                        ), () -> {

                                        });
                                    });
                                });
                            });
                        });

                        node(overgrowth, Seq.with(
                                new SectorComplete(craters),
                                new SectorComplete(fungalPass),
                                new Research(cultivator),
                                new Research(sporePress),
                                new Research(additiveReconstructor),
                                new Research(UnitTypes.mace),
                                new Research(UnitTypes.flare)
                        ), () -> {

                        });
                    });

                    node(biomassFacility, Seq.with(
                            new SectorComplete(frozenForest),
                            new Research(powerNode),
                            new Research(steamGenerator),
                            new Research(scatter),
                            new Research(graphitePress)
                    ), () -> {
                        node(stainedMountains, Seq.with(
                                new SectorComplete(biomassFacility),
                                new Research(pneumaticDrill),
                                new Research(siliconSmelter)
                        ), () -> {
                            node(fungalPass, Seq.with(
                                    new SectorComplete(stainedMountains),
                                    new Research(groundFactory),
                                    new Research(door)
                            ), () -> {
                                node(nuclearComplex, Seq.with(
                                        new SectorComplete(fungalPass),
                                        new Research(thermalGenerator),
                                        new Research(laserDrill),
                                        new Research(Items.plastanium),
                                        new Research(swarmer)
                                ), () -> {

                                });
                            });
                        });
                    });
                });
            });

            nodeProduce(Items.copper, () -> {
                nodeProduce(Liquids.water, () -> {

                });

                nodeProduce(Items.lead, () -> {
                    nodeProduce(Items.titanium, () -> {
                        nodeProduce(Liquids.cryofluid, () -> {

                        });

                        nodeProduce(Items.thorium, () -> {
                            nodeProduce(Items.surgeAlloy, () -> {

                            });

                            nodeProduce(Items.phaseFabric, () -> {

                            });
                        });
                    });

                    nodeProduce(Items.metaglass, () -> {

                    });
                });

                nodeProduce(Items.sand, () -> {
                    nodeProduce(Items.scrap, () -> {
                        nodeProduce(Liquids.slag, () -> {

                        });
                    });

                    nodeProduce(Items.coal, () -> {
                        nodeProduce(Items.graphite, () -> {
                            nodeProduce(Items.silicon, () -> {

                            });
                        });

                        nodeProduce(Items.pyratite, () -> {
                            nodeProduce(Items.blastCompound, () -> {

                            });
                        });

                        nodeProduce(Items.sporePod, () -> {

                        });

                        nodeProduce(Liquids.oil, () -> {
                            nodeProduce(Items.plastanium, () -> {

                            });
                        });
                    });
                });
            });
        });

        node(duct, () -> {
            node(ductRouter, () -> {
                node(ductBridge, () -> {
                    node(armoredDuct, () -> {
                        node(surgeConveyor, () -> {
                            node(surgeRouter);
                        });
                    });

                    node(unitCargoLoader, () -> {
                        node(unitCargoUnloadPoint, () -> {

                        });
                    });
                });

                node(overflowDuct, Seq.with(new Objectives.OnSector(aegis)), () -> {
                    node(underflowDuct);
                    node(reinforcedContainer, () -> {
                        node(ductUnloader, () -> {

                        });

                        node(reinforcedVault, () -> {

                        });
                    });
                });

                node(reinforcedMessage, Seq.with(new Objectives.OnSector(aegis)), () -> {
                    node(canvas);
                });
            });

            node(reinforcedPayloadConveyor, Seq.with(new Objectives.OnSector(atlas)), () -> {
                //TODO should only be unlocked in unit sector
                node(payloadMassDriver, Seq.with(new Research(siliconArcFurnace), new Objectives.OnSector(split)), () -> {
                    //TODO further limitations
                    node(payloadLoader, () -> {
                        node(payloadUnloader, () -> {
                            node(largePayloadMassDriver, () -> {

                            });
                        });
                    });

                    node(constructor, Seq.with(new Objectives.OnSector(split)), () -> {
                        node(smallDeconstructor, Seq.with(new Objectives.OnSector(peaks)), () -> {
                            node(largeConstructor, Seq.with(new Objectives.OnSector(siege)), () -> {

                            });

                            node(deconstructor, Seq.with(new Objectives.OnSector(siege)), () -> {

                            });
                        });
                    });
                });

                node(reinforcedPayloadRouter, () -> {

                });
            });
        });

        //TODO move into turbine condenser?
        node(plasmaBore, () -> {
            node(impactDrill, Seq.with(new Objectives.OnSector(aegis)), () -> {
                node(largePlasmaBore, Seq.with(new Objectives.OnSector(caldera)), () -> {
                    node(eruptionDrill, Seq.with(new Objectives.OnSector(stronghold)), () -> {

                    });
                });
            });
        });

        node(turbineCondenser, () -> {
            node(beamNode, () -> {
                node(ventCondenser, Seq.with(new Objectives.OnSector(aegis)), () -> {
                    node(chemicalCombustionChamber, Seq.with(new Objectives.OnSector(basin)), () -> {
                        node(pyrolysisGenerator, Seq.with(new Objectives.OnSector(crevice)), () -> {
                            node(fluxReactor, Seq.with(new Objectives.OnSector(crossroads), new Research(cyanogenSynthesizer)), () -> {
                                node(neoplasiaReactor, Seq.with(new Objectives.OnSector(karst)), () -> {

                                });
                            });
                        });
                    });
                });

                node(beamTower, Seq.with(new Objectives.OnSector(peaks)), () -> {

                });


                node(regenProjector, Seq.with(new Objectives.OnSector(peaks)), () -> {
                    //TODO more tiers of build tower or "support" structures like overdrive projectors
                    node(buildTower, Seq.with(new Objectives.OnSector(stronghold)), () -> {
                        node(shockwaveTower, Seq.with(new Objectives.OnSector(siege)), () -> {

                        });
                    });
                });
            });

            node(reinforcedConduit, Seq.with(new Objectives.OnSector(aegis)), () -> {
                //TODO maybe should be even later
                node(reinforcedPump, Seq.with(new Objectives.OnSector(basin)), () -> {
                    //TODO T2 pump, consume cyanogen or similar
                });

                node(reinforcedLiquidJunction, () -> {
                    node(reinforcedBridgeConduit, () -> {

                    });

                    node(reinforcedLiquidRouter, () -> {
                        node(reinforcedLiquidContainer, () -> {
                            node(reinforcedLiquidTank, Seq.with(new SectorComplete(intersect)), () -> {

                            });
                        });
                    });
                });
            });

            node(cliffCrusher, () -> {
                node(siliconArcFurnace, () -> {
                    node(electrolyzer, Seq.with(new Objectives.OnSector(atlas)), () -> {
                        node(oxidationChamber, Seq.with(new Research(tankRefabricator), new Objectives.OnSector(marsh)), () -> {

                            node(surgeCrucible, Seq.with(new Objectives.OnSector(ravine)), () -> {

                            });
                            node(heatRedirector, Seq.with(new Objectives.OnSector(ravine)), () -> {
                                node(electricHeater, Seq.with(new Objectives.OnSector(ravine), new Research(afflict)), () -> {
                                    node(slagHeater, Seq.with(new Objectives.OnSector(caldera)), () -> {

                                    });

                                    node(atmosphericConcentrator, Seq.with(new Objectives.OnSector(caldera)), () -> {
                                        node(cyanogenSynthesizer, Seq.with(new Objectives.OnSector(siege)), () -> {

                                        });
                                    });

                                    node(carbideCrucible, Seq.with(new Objectives.OnSector(crevice)), () -> {
                                        node(phaseSynthesizer, Seq.with(new Objectives.OnSector(karst)), () -> {
                                            node(phaseHeater, Seq.with(new Research(phaseSynthesizer)), () -> {

                                            });
                                        });
                                    });

                                    node(heatRouter, () -> {

                                    });
                                });
                            });
                        });

                        node(slagIncinerator, Seq.with(new Objectives.OnSector(basin)), () -> {

                            //TODO these are unused.
                            //node(slagCentrifuge, () -> {});
                            //node(heatReactor, () -> {});
                        });
                    });
                });
            });
        });


        node(breach, Seq.with(new Research(siliconArcFurnace), new Research(tankFabricator)), () -> {
            node(berylliumWall, () -> {
                node(berylliumWallLarge, () -> {

                });

                node(tungstenWall, () -> {
                    node(tungstenWallLarge, () -> {
                        node(blastDoor, () -> {

                        });
                    });

                    node(reinforcedSurgeWall, () -> {
                        node(reinforcedSurgeWallLarge, () -> {
                            node(shieldedWall, () -> {

                            });
                        });
                    });

                    node(carbideWall, () -> {
                        node(carbideWallLarge, () -> {

                        });
                    });
                });
            });

            node(diffuse, Seq.with(new Objectives.OnSector(lake)), () -> {
                node(sublimate, Seq.with(new Objectives.OnSector(marsh)), () -> {
                    node(afflict, Seq.with(new Objectives.OnSector(ravine)), () -> {
                        node(titan, Seq.with(new Objectives.OnSector(stronghold)), () -> {
                            node(lustre, Seq.with(new Objectives.OnSector(crevice)), () -> {
                                node(smite, Seq.with(new Objectives.OnSector(karst)), () -> {

                                });
                            });
                        });
                    });
                });

                node(disperse, Seq.with(new Objectives.OnSector(stronghold)), () -> {
                    node(scathe, Seq.with(new Objectives.OnSector(siege)), () -> {
                        node(malign, Seq.with(new SectorComplete(karst)), () -> {

                        });
                    });
                });
            });


            node(radar, Seq.with(new Research(beamNode), new Research(turbineCondenser), new Research(tankFabricator), new Objectives.OnSector(SectorPresets.aegis)), () -> {

            });
        });

        node(coreCitadel, Seq.with(new SectorComplete(peaks)), () -> {
            node(coreAcropolis, Seq.with(new SectorComplete(siege)), () -> {

            });
        });

        node(tankFabricator, Seq.with(new Research(siliconArcFurnace), new Research(plasmaBore), new Research(turbineCondenser)), () -> {
            node(UnitTypes.stell);

            node(unitRepairTower, Seq.with(new Objectives.OnSector(ravine), new Research(mechRefabricator)), () -> {

            });

            node(shipFabricator, Seq.with(new Objectives.OnSector(lake)), () -> {
                node(UnitTypes.elude);

                node(mechFabricator, Seq.with(new Objectives.OnSector(intersect)), () -> {
                    node(UnitTypes.merui);

                    node(tankRefabricator, Seq.with(new Objectives.OnSector(atlas)), () -> {
                        node(UnitTypes.locus);

                        node(mechRefabricator, Seq.with(new Objectives.OnSector(basin)), () -> {
                            node(UnitTypes.cleroi);

                            node(shipRefabricator, Seq.with(new Objectives.OnSector(peaks)), () -> {
                                node(UnitTypes.avert);

                                //TODO
                                node(primeRefabricator, Seq.with(new Objectives.OnSector(stronghold)), () -> {
                                    node(UnitTypes.precept);
                                    node(UnitTypes.anthicus);
                                    node(UnitTypes.obviate);
                                });

                                node(tankAssembler, Seq.with(new Objectives.OnSector(siege), new Research(constructor), new Research(atmosphericConcentrator)), () -> {

                                    node(UnitTypes.vanquish, () -> {
                                        node(UnitTypes.conquer, Seq.with(new Objectives.OnSector(karst)), () -> {

                                        });
                                    });

                                    node(shipAssembler, Seq.with(new Objectives.OnSector(crossroads)), () -> {
                                        node(UnitTypes.quell, () -> {
                                            node(UnitTypes.disrupt, Seq.with(new Objectives.OnSector(karst)), () -> {

                                            });
                                        });
                                    });

                                    node(mechAssembler, Seq.with(new Objectives.OnSector(crossroads)), () -> {
                                        node(UnitTypes.tecta, () -> {
                                            node(UnitTypes.collaris, Seq.with(new Objectives.OnSector(karst)), () -> {

                                            });
                                        });
                                    });

                                    node(basicAssemblerModule, Seq.with(new SectorComplete(karst)), () -> {

                                    });
                                });
                            });
                        });
                    });
                });
            });
        });

        node(onset, () -> {
            node(aegis, Seq.with(new SectorComplete(onset), new Research(ductRouter), new Research(ductBridge)), () -> {
                node(lake, Seq.with(new SectorComplete(aegis)), () -> {

                });

                node(intersect, Seq.with(new SectorComplete(aegis), new SectorComplete(lake), new Research(ventCondenser), new Research(shipFabricator)), () -> {
                    node(atlas, Seq.with(new SectorComplete(intersect), new Research(mechFabricator)), () -> {
                        node(split, Seq.with(new SectorComplete(atlas), new Research(reinforcedPayloadConveyor), new Research(reinforcedContainer)), () -> {

                        });

                        node(basin, Seq.with(new SectorComplete(atlas)), () -> {
                            node(marsh, Seq.with(new SectorComplete(basin)), () -> {
                                node(ravine, Seq.with(new SectorComplete(marsh), new Research(Liquids.slag)), () -> {
                                    node(caldera, Seq.with(new SectorComplete(peaks), new Research(heatRedirector)), () -> {
                                        node(stronghold, Seq.with(new SectorComplete(caldera), new Research(coreCitadel)), () -> {
                                            node(crevice, Seq.with(new SectorComplete(stronghold)), () -> {
                                                node(siege, Seq.with(new SectorComplete(crevice)), () -> {
                                                    node(crossroads, Seq.with(new SectorComplete(siege)), () -> {
                                                        node(karst, Seq.with(new SectorComplete(crossroads), new Research(coreAcropolis)), () -> {
                                                            node(origin, Seq.with(new SectorComplete(karst), new Research(coreAcropolis), new Research(UnitTypes.vanquish), new Research(UnitTypes.disrupt), new Research(UnitTypes.collaris), new Research(malign), new Research(basicAssemblerModule), new Research(neoplasiaReactor)), () -> {

                                                            });
                                                        });
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });

                                node(peaks, Seq.with(new SectorComplete(marsh), new SectorComplete(split)), () -> {

                                });
                            });
                        });
                    });
                });
            });
        });

        nodeProduce(Items.beryllium, () -> {
            nodeProduce(Items.sand, () -> {
                nodeProduce(Items.silicon, () -> {
                    nodeProduce(Items.oxide, () -> {
                        //nodeProduce(Items.fissileMatter, () -> {});
                    });
                });
            });

            nodeProduce(Liquids.water, () -> {
                nodeProduce(Liquids.ozone, () -> {
                    nodeProduce(Liquids.hydrogen, () -> {
                        nodeProduce(Liquids.nitrogen, () -> {

                        });

                        nodeProduce(Liquids.cyanogen, () -> {
                            nodeProduce(Liquids.neoplasm, () -> {

                            });
                        });
                    });
                });
            });

            nodeProduce(Items.graphite, () -> {
                nodeProduce(Items.tungsten, () -> {
                    nodeProduce(Liquids.slag, () -> {

                    });

                    nodeProduce(Liquids.arkycite, () -> {

                    });

                    nodeProduce(Items.thorium, () -> {
                        nodeProduce(Items.carbide, () -> {

                            //nodeProduce(Liquids.gallium, () -> {});
                        });
                    });

                    nodeProduce(Items.surgeAlloy, () -> {
                        nodeProduce(Items.phaseFabric, () -> {

                        });
                    });
                });
            });
        });
    }
}

