
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.gates.world.features.ores.Tainted_crystalOreFeature;
import net.mcreator.gates.world.features.ores.Shadow_stoneOreFeature;
import net.mcreator.gates.world.features.ores.CursedstoneFeature;
import net.mcreator.gates.world.features.ores.CursedgraniteFeature;
import net.mcreator.gates.world.features.ores.CurseddioriteFeature;
import net.mcreator.gates.world.features.ores.CursedcobblestoneFeature;
import net.mcreator.gates.world.features.ores.CursedandisiteFeature;
import net.mcreator.gates.world.features.ores.Cursed_metalOreFeature;
import net.mcreator.gates.world.features.ores.CursedOreFeature;
import net.mcreator.gates.world.features.ores.CurroptedgrassFeature;
import net.mcreator.gates.world.features.ores.CurropteddirtFeature;
import net.mcreator.gates.world.features.ores.CurroptedOreFeature;
import net.mcreator.gates.GatesMod;

@Mod.EventBusSubscriber
public class GatesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GatesMod.MODID);
	public static final RegistryObject<Feature<?>> CURSEDCOBBLESTONE = REGISTRY.register("cursedcobblestone", CursedcobblestoneFeature::new);
	public static final RegistryObject<Feature<?>> CURSEDSTONE = REGISTRY.register("cursedstone", CursedstoneFeature::new);
	public static final RegistryObject<Feature<?>> CURSED_ORE = REGISTRY.register("cursed_ore", CursedOreFeature::new);
	public static final RegistryObject<Feature<?>> CURROPTED_ORE = REGISTRY.register("curropted_ore", CurroptedOreFeature::new);
	public static final RegistryObject<Feature<?>> CURROPTEDDIRT = REGISTRY.register("curropteddirt", CurropteddirtFeature::new);
	public static final RegistryObject<Feature<?>> CURROPTEDGRASS = REGISTRY.register("curroptedgrass", CurroptedgrassFeature::new);
	public static final RegistryObject<Feature<?>> SHADOW_STONE_ORE = REGISTRY.register("shadow_stone_ore", Shadow_stoneOreFeature::new);
	public static final RegistryObject<Feature<?>> TAINTED_CRYSTAL_ORE = REGISTRY.register("tainted_crystal_ore", Tainted_crystalOreFeature::new);
	public static final RegistryObject<Feature<?>> CURSED_METAL_ORE = REGISTRY.register("cursed_metal_ore", Cursed_metalOreFeature::new);
	public static final RegistryObject<Feature<?>> CURSEDDIORITE = REGISTRY.register("curseddiorite", CurseddioriteFeature::new);
	public static final RegistryObject<Feature<?>> CURSEDANDISITE = REGISTRY.register("cursedandisite", CursedandisiteFeature::new);
	public static final RegistryObject<Feature<?>> CURSEDGRANITE = REGISTRY.register("cursedgranite", CursedgraniteFeature::new);
}
