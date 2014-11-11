package com.drummingfish.extrastuff.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

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
		buttonIron = new BlockButtons().setBlockName(BlockInfo.BUTTON_IRON_UNLOCALIZED_NAME).setHardness(2.0F).setResistance(10.0F);
		buttonGold = new BlockButtons().setBlockName(BlockInfo.BUTTON_GOLD_UNLOCALIZED_NAME).setHardness(1.0F).setResistance(10.0F);
		buttonDiamond = new BlockButtons().setBlockName(BlockInfo.BUTTON_DIAMOND_UNLOCALIZED_NAME).setHardness(2.5F).setResistance(10.0F);
		buttonEmerald = new BlockButtons().setBlockName(BlockInfo.BUTTON_EMERALD_UNLOCALIZED_NAME).setHardness(2.5F).setResistance(10.0F);
		buttonObsidian = new BlockButtons().setBlockName(BlockInfo.BUTTON_OBSIDIAN_UNLOCALIZED_NAME).setHardness(5.0F).setResistance(2000.0F);

		leverIron = new BlockLevers().setBlockName(BlockInfo.LEVER_IRON_UNLOCALIZED_NAME).setHardness(2.0F).setResistance(10.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.LEVER_IRON_ICON);
		leverGold = new BlockLevers().setBlockName(BlockInfo.LEVER_GOLD_UNLOCALIZED_NAME).setHardness(1.0F).setResistance(10.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.LEVER_GOLD_ICON);
		leverDiamond = new BlockLevers().setBlockName(BlockInfo.LEVER_DIAMOND_UNLOCALIZED_NAME).setHardness(2.5F).setResistance(10.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.LEVER_DIAMOND_ICON);
		leverEmerald = new BlockLevers().setBlockName(BlockInfo.LEVER_EMERALD_UNLOCALIZED_NAME).setHardness(2.5F).setResistance(10.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.LEVER_EMERALD_ICON);
		leverObsidian = new BlockLevers().setBlockName(BlockInfo.LEVER_OBSIDIAN_UNLOCALIZED_NAME).setHardness(5.0F).setResistance(2000.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.LEVER_OBSIDIAN_ICON);

		trapDoorIron = new BlockIronTrapDoor(Material.iron).setBlockName(BlockInfo.TRAPDOOR_IRON_UNLOCALIZED_NAME).setHardness(5.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.TRAPDOOR_IRON_ICON);

		window = new BlockWindow(Material.glass).setBlockName(BlockInfo.WINDOW_UNLOCALIZED_NAME);

		orePermaIce = new BlockOre().setBlockName(BlockInfo.PERMAICE_ORE_UNLOCALIZED_NAME).setHardness(4.0F).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.PERMAICE_ORE_ICON);
		blockPermaIce = new BlockPermaIce(Material.rock).setBlockTextureName(BlockInfo.TEXTURE_LOCATION + BlockInfo.PERMAICE_BLOCK_ICON);

		GameRegistry.registerBlock(buttonIron, BlockInfo.BUTTON_IRON_KEY);
		GameRegistry.registerBlock(buttonGold, BlockInfo.BUTTON_GOLD_KEY);
		GameRegistry.registerBlock(buttonDiamond, BlockInfo.BUTTON_DIAMOND_KEY);
		GameRegistry.registerBlock(buttonEmerald, BlockInfo.BUTTON_EMERALD_KEY);
		GameRegistry.registerBlock(buttonObsidian, BlockInfo.BUTTON_OBSIDIAN_KEY);

		GameRegistry.registerBlock(leverIron, BlockInfo.LEVER_IRON_KEY);
		GameRegistry.registerBlock(leverGold, BlockInfo.LEVER_GOLD_KEY);
		GameRegistry.registerBlock(leverDiamond, BlockInfo.LEVER_DIAMOND_KEY);
		GameRegistry.registerBlock(leverEmerald, BlockInfo.LEVER_EMERALD_KEY);
		GameRegistry.registerBlock(leverObsidian, BlockInfo.LEVER_OBSIDIAN_KEY);

		GameRegistry.registerBlock(trapDoorIron, BlockInfo.TRAPDOOR_IRON_KEY);

        GameRegistry.registerBlock(window, BlockInfo.WINDOW_KEY);

        GameRegistry.registerBlock(orePermaIce, BlockInfo.PERMAICE_ORE_KEY);
        GameRegistry.registerBlock(blockPermaIce, BlockInfo.PERMAICE_BLOCK_KEY);
	}

    public static void oreRegistration() {
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 1));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 2));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 3));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 4));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 5));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 6));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 7));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 8));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.red_flower, 1, 9));

        OreDictionary.registerOre("flower", new ItemStack(Blocks.double_plant));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.double_plant, 1, 1));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.double_plant, 1, 4));
        OreDictionary.registerOre("flower", new ItemStack(Blocks.double_plant, 1, 5));

        OreDictionary.registerOre("flower", new ItemStack(Blocks.yellow_flower));
    }
}
