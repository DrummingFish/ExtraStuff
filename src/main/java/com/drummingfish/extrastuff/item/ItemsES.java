package com.drummingfish.extrastuff.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemsES {

	public static Item chainmail;
	public static Item ironNugget;
	
	public static void init() {
		chainmail = new ItemChainmail();
		ironNugget = new ItemIronNugget();

        GameRegistry.registerItem(chainmail, ItemInfo.CHAINMAIL_KEY);
        GameRegistry.registerItem(ironNugget, ItemInfo.IRON_NUGGET_KEY);
    }
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(ItemsES.ironNugget));
	}
}
