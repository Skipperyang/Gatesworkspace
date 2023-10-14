
package net.mcreator.gates.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CurroptedItem extends Item {
	public CurroptedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
