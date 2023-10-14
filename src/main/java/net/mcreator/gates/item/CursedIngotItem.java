
package net.mcreator.gates.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CursedIngotItem extends Item {
	public CursedIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
