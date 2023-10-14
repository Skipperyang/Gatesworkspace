
package net.mcreator.gates.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.gates.init.GatesModItems;

public abstract class Tainted_crystalArmorItem extends ArmorItem {
	public Tainted_crystalArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 105;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{14, 42, 35, 14}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 63;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GatesModItems.TAINTED_CRYSTAL_DUST.get()));
			}

			@Override
			public String getName() {
				return "tainted_crystal_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends Tainted_crystalArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gates:textures/models/armor/tainted_crystal_layer_1.png";
		}
	}

	public static class Chestplate extends Tainted_crystalArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gates:textures/models/armor/tainted_crystal_layer_1.png";
		}
	}

	public static class Leggings extends Tainted_crystalArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gates:textures/models/armor/tainted_crystal_layer_2.png";
		}
	}

	public static class Boots extends Tainted_crystalArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "gates:textures/models/armor/tainted_crystal_layer_1.png";
		}
	}
}
