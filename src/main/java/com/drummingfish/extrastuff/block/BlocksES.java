package com.drummingfish.extrastuff.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksES {
	
	public static Block buttonGold;
	public static Block buttonDiamond;
	public static Block buttonEmerald;
	public static Block buttonIron;
	public static Block buttonObsidian;
	
	public static Block leverGold;
	public static Block leverDiamond;
	public static Block leverEmerald;
	public static Block leverIron;
	public static Block leverObsidian;
	
	public static Block extraBed;
	
	public static Block trapDoorIron;
	
	public static Block doorGold;
	public static Block doorDiamond;
	public static Block doorEmerald;

	public static void init() {
		buttonIron = new BlockButtonIron().setBlockTextureName("iron_block");
		GameRegistry.registerBlock(buttonIron, BlockInfo.BUTTON_IRON_KEY);
		
		buttonGold = new BlockButtonGold().setBlockTextureName("gold_block");
		GameRegistry.registerBlock(buttonGold, BlockInfo.BUTTON_GOLD_KEY);
		
		buttonDiamond = new BlockButtonDiamond().setBlockTextureName("diamond_block");
		GameRegistry.registerBlock(buttonDiamond, BlockInfo.BUTTON_DIAMOND_KEY);
		
		buttonEmerald = new BlockButtonEmerald().setBlockTextureName("emerald_block");
		GameRegistry.registerBlock(buttonEmerald, BlockInfo.BUTTON_EMERALD_KEY);
		
		buttonObsidian = new BlockButtonObsidian().setBlockTextureName("obsidian");
		GameRegistry.registerBlock(buttonObsidian, BlockInfo.BUTTON_OBSIDIAN_KEY);
		
		leverIron = new BlockLeverIron(BlockInfo.LEVER_IRON_ID);
		GameRegistry.registerBlock(leverIron, BlockInfo.LEVER_IRON_KEY);
		
		leverGold = new BlockLeverGold(BlockInfo.LEVER_GOLD_ID);
		GameRegistry.registerBlock(leverGold, BlockInfo.LEVER_GOLD_KEY);
		
		leverDiamond = new BlockLeverDiamond(BlockInfo.LEVER_DIAMOND_ID);
		GameRegistry.registerBlock(leverDiamond, BlockInfo.LEVER_DIAMOND_KEY);
		
		leverEmerald = new BlockLeverEmerald(BlockInfo.LEVER_EMERALD_ID);
		GameRegistry.registerBlock(leverEmerald, BlockInfo.LEVER_EMERALD_KEY);
		
		leverObsidian = new BlockLeverObsidian(BlockInfo.LEVER_OBSIDIAN_ID);
		GameRegistry.registerBlock(leverObsidian, BlockInfo.LEVER_OBSIDIAN_KEY);
		
		//extraBed = new BlockExtraBed(BlockInfo.EXTRABED_ID);
		//GameRegistry.registerBlock(extraBed, BlockInfo.EXTRABED_KEY);
		
		trapDoorIron = new BlockIronTrapDoor(BlockInfo.TRAPDOOR_IRON_ID, Material.iron);
		GameRegistry.registerBlock(trapDoorIron, BlockInfo.TRAPDOOR_IRON_KEY);

		//doorGold = new BlockDoorGold(BlockInfo.DOOR_GOLD_ID, Material.iron);
		//GameRegistry.registerBlock(doorGold, BlockInfo.DOOR_GOLD_KEY);
		
		//doorDiamond = new BlockDoorDiamond(BlockInfo.DOOR_DIAMOND_ID, Material.iron);
		//GameRegistry.registerBlock(doorDiamond, BlockInfo.DOOR_DIAMOND_KEY);
		
		//doorEmerald = new BlockDoorEmerald(BlockInfo.DOOR_EMERALD_ID, Material.iron);
		//GameRegistry.registerBlock(doorEmerald, BlockInfo.DOOR_EMERALD_KEY);
	}
	
	public static void addNames() {
        buttonIron.setBlockName(BlockInfo.BUTTON_IRON_NAME);
		buttonGold.setBlockName(BlockInfo.BUTTON_GOLD_NAME);
		buttonDiamond.setBlockName(BlockInfo.BUTTON_DIAMOND_NAME);
		buttonEmerald.setBlockName(BlockInfo.BUTTON_EMERALD_NAME);
		buttonObsidian.setBlockName(BlockInfo.BUTTON_OBSIDIAN_NAME);
		
		leverIron.setBlockName(BlockInfo.LEVER_IRON_NAME);
		leverGold.setBlockName(BlockInfo.LEVER_GOLD_NAME);
		leverDiamond.setBlockName(BlockInfo.LEVER_DIAMOND_NAME);
		leverEmerald.setBlockName(BlockInfo.LEVER_EMERALD_NAME);
		leverObsidian.setBlockName(BlockInfo.LEVER_OBSIDIAN_NAME);
		
		//LanguageRegistry.addName(extraBed, BlockInfo.EXTRABED_NAME);
		
		trapDoorIron.setBlockName(BlockInfo.TRAPDOOR_IRON_NAME);
		
		//LanguageRegistry.addName(doorGold, BlockInfo.DOOR_GOLD_NAME);
		//LanguageRegistry.addName(doorDiamond, BlockInfo.DOOR_DIAMOND_NAME);
		//LanguageRegistry.addName(doorEmerald, BlockInfo.DOOR_EMERALD_NAME);
	}
}
