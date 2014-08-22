package com.drummingfish.extrastuff.items;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import extrastuff.items.ItemInfo;
import extrastuff.items.ItemChainmail;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

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
	
	public static void addNames() {
		LanguageRegistry.addName(chainmail, ItemInfo.CHAINMAIL_NAME);
		LanguageRegistry.addName(ironNugget, ItemInfo.IRON_NUGGET_NAME);
		//LanguageRegistry.addName(extraBed, ItemInfo.EXTRABED_NAME);
		//LanguageRegistry.addName(goldDoor, ItemInfo.DOOR_GOLD_NAME);
		//LanguageRegistry.addName(diamondDoor, ItemInfo.DOOR_DIAMOND_NAME);
		//LanguageRegistry.addName(emeraldDoor, ItemInfo.DOOR_EMERALD_NAME);
	}
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(Items.ironNugget));
	}
}
