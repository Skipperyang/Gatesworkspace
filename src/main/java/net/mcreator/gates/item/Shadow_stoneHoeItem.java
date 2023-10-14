
package net.mcreator.gates.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.gates.init.GatesModItems;

public class Shadow_stoneHoeItem extends HoeItem {
	public Shadow_stoneHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5419;
			}

			public float getSpeed() {
				return 22f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 18;
			}

			public int getEnchantmentValue() {
				return 126;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GatesModItems.SHADOW_STONE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
