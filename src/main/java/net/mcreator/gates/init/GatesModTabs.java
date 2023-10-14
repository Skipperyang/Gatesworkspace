
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.gates.GatesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GatesMod.MODID);
	public static final RegistryObject<CreativeModeTab> GATES = REGISTRY.register("gates",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gates.gates")).icon(() -> new ItemStack(GatesModBlocks.CURSED_PORTALBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GatesModBlocks.CURSED_PORTALBLOCK.get().asItem());
				tabData.accept(GatesModItems.CURSEDSHARED.get());
				tabData.accept(GatesModItems.CURSEDCORE.get());
				tabData.accept(GatesModBlocks.CURSEDGRASS.get().asItem());
				tabData.accept(GatesModBlocks.CURSEDDIRT.get().asItem());
				tabData.accept(GatesModBlocks.CURSEDCOBBLESTONE.get().asItem());
				tabData.accept(GatesModItems.CURSEDARMOR_ARMOR_HELMET.get());
				tabData.accept(GatesModItems.CURSEDARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(GatesModItems.CURSEDARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(GatesModItems.CURSEDARMOR_ARMOR_BOOTS.get());
				tabData.accept(GatesModBlocks.CURSEDSTONE.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_ORE.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_BLOCK.get().asItem());
				tabData.accept(GatesModItems.CURSED_INGOT.get());
				tabData.accept(GatesModItems.CURSEDTOOLS_AXE.get());
				tabData.accept(GatesModItems.CURSEDTOOLS_PICKAXE.get());
				tabData.accept(GatesModItems.CURSEDTOOLS_SWORD.get());
				tabData.accept(GatesModItems.CURSEDTOOLS_SHOVEL.get());
				tabData.accept(GatesModItems.CURSEDTOOLS_HOE.get());
				tabData.accept(GatesModItems.CURSEDRAWORE.get());
				tabData.accept(GatesModBlocks.CURROPTED_ORE.get().asItem());
				tabData.accept(GatesModBlocks.CURROPTED_BLOCK.get().asItem());
				tabData.accept(GatesModItems.CURROPTED.get());
				tabData.accept(GatesModItems.CURROPTED_ARMOR_ARMOR_HELMET.get());
				tabData.accept(GatesModItems.CURROPTED_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(GatesModItems.CURROPTED_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(GatesModItems.CURROPTED_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(GatesModItems.CURROPTED_TOOLS_PICKAXE.get());
				tabData.accept(GatesModItems.CURROPTED_TOOLS_AXE.get());
				tabData.accept(GatesModItems.CURROPTED_TOOLS_SWORD.get());
				tabData.accept(GatesModItems.CURROPTED_TOOLS_SHOVEL.get());
				tabData.accept(GatesModItems.CURROPTED_TOOLS_HOE.get());
				tabData.accept(GatesModBlocks.CURSEDSAND.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_WOOD.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_LOG.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_PLANKS.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_STAIRS.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_SLAB.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_FENCE.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_FENCE_GATE.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_PRESSURE_PLATE.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_BUTTON.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_WOOD.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_LOG.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_PLANKS.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_LEAVES.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_STAIRS.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_SLAB.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_FENCE.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_OAK_BUTTON.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_WOOD.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_LOG.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_PLANKS.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_STAIRS.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_SLAB.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_FENCE.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_FENCE_GATE.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_PRESSURE_PLATE.get().asItem());
				tabData.accept(GatesModBlocks.SOULWOOD_TREE_BUTTON.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_WOOD.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_LOG.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_PLANKS.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_STAIRS.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_SLAB.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_FENCE.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_FENCE_GATE.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(GatesModBlocks.WRAITHWOOD_BUTTON.get().asItem());
				tabData.accept(GatesModBlocks.TAINTEDGRASS.get().asItem());
				tabData.accept(GatesModBlocks.TAINTEDDIRT.get().asItem());
				tabData.accept(GatesModBlocks.CURROPTEDDIRT.get().asItem());
				tabData.accept(GatesModBlocks.CURROPTEDGRASS.get().asItem());
				tabData.accept(GatesModBlocks.SHADOW_STONE_ORE.get().asItem());
				tabData.accept(GatesModBlocks.SHADOW_STONE_BLOCK.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_CRYSTAL_ORE.get().asItem());
				tabData.accept(GatesModBlocks.TAINTED_CRYSTAL_BLOCK.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_METAL_ORE.get().asItem());
				tabData.accept(GatesModBlocks.CURSED_METAL_BLOCK.get().asItem());
				tabData.accept(GatesModItems.SHADOW_STONE_INGOT.get());
				tabData.accept(GatesModItems.TAINTED_CRYSTAL_DUST.get());
				tabData.accept(GatesModItems.CURSED_METAL_INGOT.get());
				tabData.accept(GatesModBlocks.CURSEDDIORITE.get().asItem());
				tabData.accept(GatesModBlocks.CURSEDANDISITE.get().asItem());
				tabData.accept(GatesModBlocks.CURSEDGRANITE.get().asItem());
				tabData.accept(GatesModBlocks.BRINKSAND.get().asItem());
				tabData.accept(GatesModBlocks.BRINKPORTAL.get().asItem());
				tabData.accept(GatesModBlocks.BRINKPORTALBLOCK.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(GatesModBlocks.TAINTED_OAK_FENCE_GATE.get().asItem());
			tabData.accept(GatesModBlocks.TAINTED_OAK_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GatesModItems.SHADOW_STONE_ARMOR_HELMET.get());
			tabData.accept(GatesModItems.SHADOW_STONE_ARMOR_CHESTPLATE.get());
			tabData.accept(GatesModItems.SHADOW_STONE_ARMOR_LEGGINGS.get());
			tabData.accept(GatesModItems.SHADOW_STONE_ARMOR_BOOTS.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_ARMOR_HELMET.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_ARMOR_CHESTPLATE.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_ARMOR_LEGGINGS.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_ARMOR_BOOTS.get());
			tabData.accept(GatesModItems.CURSED_METAL_ARMOR_HELMET.get());
			tabData.accept(GatesModItems.CURSED_METAL_ARMOR_CHESTPLATE.get());
			tabData.accept(GatesModItems.CURSED_METAL_ARMOR_LEGGINGS.get());
			tabData.accept(GatesModItems.CURSED_METAL_ARMOR_BOOTS.get());
			tabData.accept(GatesModItems.SHADOW_STONE_SWORD.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_SWORD.get());
			tabData.accept(GatesModItems.CURSED_METAL_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(GatesModItems.CURSEDBEING_SPAWN_EGG.get());
			tabData.accept(GatesModItems.CURSEDWALKER_SPAWN_EGG.get());
			tabData.accept(GatesModItems.CURSEDSOUL_SPAWN_EGG.get());
			tabData.accept(GatesModItems.SHADOWMAN_SPAWN_EGG.get());
			tabData.accept(GatesModItems.TAINTEDWALKER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(GatesModBlocks.CURSED_LEAVES.get().asItem());
			tabData.accept(GatesModBlocks.SOULWOOD_TREE_LEAVES.get().asItem());
			tabData.accept(GatesModBlocks.WRAITHWOOD_LEAVES.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GatesModItems.CURSED_REALM.get());
			tabData.accept(GatesModItems.SHADOW_STONE_PICKAXE.get());
			tabData.accept(GatesModItems.SHADOW_STONE_AXE.get());
			tabData.accept(GatesModItems.SHADOW_STONE_SHOVEL.get());
			tabData.accept(GatesModItems.SHADOW_STONE_HOE.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_PICKAXE.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_AXE.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_SHOVEL.get());
			tabData.accept(GatesModItems.TAINTED_CRYSTAL_HOE.get());
			tabData.accept(GatesModItems.CURSED_METAL_PICKAXE.get());
			tabData.accept(GatesModItems.CURSED_METAL_AXE.get());
			tabData.accept(GatesModItems.CURSED_METAL_SHOVEL.get());
			tabData.accept(GatesModItems.CURSED_METAL_HOE.get());
			tabData.accept(GatesModItems.THE_BRINK.get());
		}
	}
}
