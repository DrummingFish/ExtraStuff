package com.drummingfish.extrastuff.config;

import java.io.File;

import extrastuff.blocks.BlockInfo;
import extrastuff.items.ItemInfo;
import extrastuff.recipes.Recipes;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {

	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemInfo.CHAINMAIL_ID = config.getItem(ItemInfo.CHAINMAIL_KEY, ItemInfo.CHAINMAIL_DEFAULT).getInt() - 256;
		ItemInfo.IRON_NUGGET_ID = config.getItem(ItemInfo.IRON_NUGGET_KEY, ItemInfo.IRON_NUGGET_DEFAULT).getInt() - 256;
		ItemInfo.EXTRABED_ID = config.getItem(ItemInfo.EXTRABED_KEY, ItemInfo.EXTRABED_DEFAULT).getInt() - 256;
		ItemInfo.DOOR_GOLD_ID = config.getItem(ItemInfo.DOOR_GOLD_KEY, ItemInfo.DOOR_GOLD_DEFAULT).getInt() -256;
		ItemInfo.DOOR_DIAMOND_ID = config.getItem(ItemInfo.DOOR_DIAMOND_KEY, ItemInfo.DOOR_DIAMOND_DEFAULT).getInt() -256;
		ItemInfo.DOOR_EMERALD_ID = config.getItem(ItemInfo.DOOR_EMERALD_KEY, ItemInfo.DOOR_EMERALD_DEFAULT).getInt() -256;
		
		BlockInfo.BUTTON_IRON_ID = config.getBlock(BlockInfo.BUTTON_IRON_KEY, BlockInfo.BUTTON_IRON_DEFAULT).getInt();
		BlockInfo.BUTTON_GOLD_ID = config.getBlock(BlockInfo.BUTTON_GOLD_KEY, BlockInfo.BUTTON_GOLD_DEFAULT).getInt();
		BlockInfo.BUTTON_DIAMOND_ID = config.getBlock(BlockInfo.BUTTON_DIAMOND_KEY, BlockInfo.BUTTON_DIAMOND_DEFAULT).getInt();
		BlockInfo.BUTTON_EMERALD_ID = config.getBlock(BlockInfo.BUTTON_EMERALD_KEY, BlockInfo.BUTTON_EMERALD_DEFAULT).getInt();
		BlockInfo.BUTTON_OBSIDIAN_ID = config.getBlock(BlockInfo.BUTTON_OBSIDIAN_KEY, BlockInfo.BUTTON_OBSIDIAN_DEFAULT).getInt();
		
		BlockInfo.LEVER_IRON_ID = config.getBlock(BlockInfo.LEVER_IRON_KEY, BlockInfo.LEVER_IRON_DEFAULT).getInt();
		BlockInfo.LEVER_GOLD_ID = config.getBlock(BlockInfo.LEVER_GOLD_KEY, BlockInfo.LEVER_GOLD_DEFAULT).getInt();
		BlockInfo.LEVER_DIAMOND_ID = config.getBlock(BlockInfo.LEVER_DIAMOND_KEY, BlockInfo.LEVER_DIAMOND_DEFAULT).getInt();
		BlockInfo.LEVER_EMERALD_ID = config.getBlock(BlockInfo.LEVER_EMERALD_KEY, BlockInfo.LEVER_EMERALD_DEFAULT).getInt();
		BlockInfo.LEVER_OBSIDIAN_ID = config.getBlock(BlockInfo.LEVER_OBSIDIAN_KEY, BlockInfo.LEVER_OBSIDIAN_DEFAULT).getInt();
		
		BlockInfo.EXTRABED_ID = config.getBlock(BlockInfo.EXTRABED_KEY, BlockInfo.EXTRABED_DEFAULT).getInt();
		
		BlockInfo.TRAPDOOR_IRON_ID = config.getBlock(BlockInfo.TRAPDOOR_IRON_KEY, BlockInfo.TRAPDOOR_IRON_DEFAULT).getInt();
		
		BlockInfo.DOOR_GOLD_ID = config.getBlock(BlockInfo.DOOR_GOLD_KEY, BlockInfo.DOOR_GOLD_DEFAULT).getInt();
		BlockInfo.DOOR_DIAMOND_ID = config.getBlock(BlockInfo.DOOR_DIAMOND_KEY, BlockInfo.DOOR_DIAMOND_DEFAULT).getInt();
		BlockInfo.DOOR_EMERALD_ID = config.getBlock(BlockInfo.DOOR_EMERALD_KEY, BlockInfo.DOOR_EMERALD_DEFAULT).getInt();
		
		//Recipes.hardmodeRecipes = config.get("Hardmode Recipes", "hardmodeRecipesEnabled", false).getBoolean(false);
		
		config.save();
	}
}
