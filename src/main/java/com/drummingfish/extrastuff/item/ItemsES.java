package com.drummingfish.extrastuff.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemsES {

	public static Item chainmail;
	public static Item ironNugget;
	public static Item extraBed;
	public static Item goldDoor;
	public static Item diamondDoor;
	public static Item emeraldDoor;
	
	public static void init() {
		chainmail = new ItemChainmail(ItemInfo.CHAINMAIL_ID);
		ironNugget = new ItemIronNugget(ItemInfo.IRON_NUGGET_ID);
		//extraBed = new ItemExtraBed(ItemInfo.EXTRABED_ID);
		//goldDoor = new ItemDoorGold(ItemInfo.DOOR_GOLD_ID, Material.iron);
		//diamondDoor = new ItemDoorDiamond(ItemInfo.DOOR_DIAMOND_ID, Material.iron);
		//emeraldDoor = new ItemDoorEmerald(ItemInfo.DOOR_EMERALD_ID, Material.iron);
	}
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(ItemsES.ironNugget));
	}
}
