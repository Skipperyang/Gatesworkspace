
package net.mcreator.gates.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.gates.init.GatesModItems;

public class Tainted_crystalHoeItem extends HoeItem {
	public Tainted_crystalHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 14;
			}

			public int getEnchantmentValue() {
				return 98;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GatesModItems.TAINTED_CRYSTAL_DUST.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
