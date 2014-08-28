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
	
	public static Block trapDoorIron;

    public static Block ducttape;

    public static Block window;

    public static Block orePermaIce;

    public static Block blockPermaIce;

	public static void init() {
		buttonIron = new BlockButtonIron();
		GameRegistry.registerBlock(buttonIron, BlockInfo.BUTTON_IRON_KEY);
		
		buttonGold = new BlockButtonGold();
		GameRegistry.registerBlock(buttonGold, BlockInfo.BUTTON_GOLD_KEY);
		
		buttonDiamond = new BlockButtonDiamond();
		GameRegistry.registerBlock(buttonDiamond, BlockInfo.BUTTON_DIAMOND_KEY);
		
		buttonEmerald = new BlockButtonEmerald();
		GameRegistry.registerBlock(buttonEmerald, BlockInfo.BUTTON_EMERALD_KEY);
		
		buttonObsidian = new BlockButtonObsidian();
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
		
		trapDoorIron = new BlockIronTrapDoor(Material.iron);
		GameRegistry.registerBlock(trapDoorIron, BlockInfo.TRAPDOOR_IRON_KEY);

        window = new BlockWindow(Material.glass);
        GameRegistry.registerBlock(window, BlockInfo.WINDOW_KEY);

        orePermaIce = new BlockOre("permaIceOre");
        GameRegistry.registerBlock(orePermaIce, BlockInfo.PERMAICE_ORE_KEY);

        blockPermaIce = new BlockPermaIce(Material.rock);
        GameRegistry.registerBlock(blockPermaIce, BlockInfo.PERMAICE_BLOCK_KEY);
	}
}
