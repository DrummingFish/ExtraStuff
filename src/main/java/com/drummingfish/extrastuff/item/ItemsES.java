package com.drummingfish.extrastuff.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemsES {

	public static Item chainmail;
	public static Item ironNugget;
	
	public static void init() {
		chainmail = new ItemChainmail(ItemInfo.CHAINMAIL_ID);
		ironNugget = new ItemIronNugget(ItemInfo.IRON_NUGGET_ID);
	}
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(ItemsES.ironNugget));
	}
}
