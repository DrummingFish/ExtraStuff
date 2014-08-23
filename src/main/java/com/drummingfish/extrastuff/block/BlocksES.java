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
		
		leverIron = new BlockLeverIron();
		GameRegistry.registerBlock(leverIron, BlockInfo.LEVER_IRON_KEY);
		
		leverGold = new BlockLeverGold();
		GameRegistry.registerBlock(leverGold, BlockInfo.LEVER_GOLD_KEY);
		
		leverDiamond = new BlockLeverDiamond();
		GameRegistry.registerBlock(leverDiamond, BlockInfo.LEVER_DIAMOND_KEY);
		
		leverEmerald = new BlockLeverEmerald();
		GameRegistry.registerBlock(leverEmerald, BlockInfo.LEVER_EMERALD_KEY);
		
		leverObsidian = new BlockLeverObsidian();
		GameRegistry.registerBlock(leverObsidian, BlockInfo.LEVER_OBSIDIAN_KEY);
		
		//extraBed = new BlockExtraBed(BlockInfo.EXTRABED_ID);
		//GameRegistry.registerBlock(extraBed, BlockInfo.EXTRABED_KEY);
		
		trapDoorIron = new BlockIronTrapDoor(Material.iron);
		GameRegistry.registerBlock(trapDoorIron, BlockInfo.TRAPDOOR_IRON_KEY);

		//doorGold = new BlockDoorGold(BlockInfo.DOOR_GOLD_ID, Material.iron);
		//GameRegistry.registerBlock(doorGold, BlockInfo.DOOR_GOLD_KEY);
		
		//doorDiamond = new BlockDoorDiamond(BlockInfo.DOOR_DIAMOND_ID, Material.iron);
		//GameRegistry.registerBlock(doorDiamond, BlockInfo.DOOR_DIAMOND_KEY);
		
		//doorEmerald = new BlockDoorEmerald(BlockInfo.DOOR_EMERALD_ID, Material.iron);
		//GameRegistry.registerBlock(doorEmerald, BlockInfo.DOOR_EMERALD_KEY);
	}
}
