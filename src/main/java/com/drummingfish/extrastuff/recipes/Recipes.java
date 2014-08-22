package com.drummingfish.extrastuff.recipes;

import extrastuff.blocks.Blocks;
import extrastuff.config.ConfigHandler;
import extrastuff.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	//public static boolean hardmodeRecipes;

	public static void registerRecipes() {
		
		ItemStack ingotIronStack = new ItemStack(Item.ingotIron);
		ItemStack chainmailStack = new ItemStack(Items.chainmail);
		ItemStack buttonStoneStack = new ItemStack(Block.stoneButton);
		ItemStack ingotGoldStack = new ItemStack(Item.ingotGold);
		ItemStack diamondStack = new ItemStack(Item.diamond);
		ItemStack emeraldStack = new ItemStack(Item.emerald);
		ItemStack leverStack = new ItemStack(Block.lever);
		ItemStack leatherStack = new ItemStack(Item.leather);
		ItemStack stringStack = new ItemStack(Item.silk);
		ItemStack trapdoorStack = new ItemStack(Block.trapdoor);
		ItemStack cobbleStack = new ItemStack(Block.cobblestone);
		ItemStack vineStack = new ItemStack(Block.vine);
		ItemStack stoneBrickStack = new ItemStack(Block.stoneBrick, 1, 0);
		ItemStack cobbleWallStack = new ItemStack(Block.cobblestoneWall, 1, 0);
		
		//if (OreDictionary.getOres("plateSteel").size() != 0) {
		//	  System.out.println("plateSteel OreDictionary value detected");
		//} else {
		//	  System.out.println("Cannot load plateSteel");
		//}
		
		// Chainmail recipes
		if (Loader.isModLoaded("gregtech_addon")) {
			return;
		} else {
			GameRegistry.addRecipe(new ShapedOreRecipe(Items.chainmail, true,
					new Object[] { "X X", " X ", "X X", 'X', "nuggetIron"
								 }));
			GameRegistry.addRecipe(new ItemStack(Item.helmetChain),
					new Object[] { "XXX", "X X", 'X', chainmailStack
								 });
			GameRegistry.addRecipe(new ItemStack(Item.plateChain),
					new Object[] { "X X", "XXX", "XXX", 'X', chainmailStack
								 });
			GameRegistry.addRecipe(new ItemStack(Item.legsChain),
					new Object[] { "XXX", "X X", "X X", 'X', chainmailStack
								 });
			GameRegistry.addRecipe(new ItemStack(Item.bootsChain),
					new Object[] { "X X", "X X", 'X', chainmailStack
								 });
		}
		
		// Mossy Blocks
		if (Loader.isModLoaded("BiomesOPlenty") || Loader.isModLoaded("Forestry") || Loader.isModLoaded("ThermalExpansion")) {
			return;
		} else {
			GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy),
					new Object[] { "XXX", "XYX", "XXX", 'X', vineStack, 'Y', cobbleStack
								 });
			GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 1, 1),
					new Object[] { "XXX", "XYX", "XXX", 'X', vineStack, 'Y', stoneBrickStack
								 });
		}
		GameRegistry.addRecipe(new ItemStack(Block.cobblestoneWall, 1, 1),
				new Object[] { "XXX", "XYX", "XXX", 'X', vineStack, 'Y', cobbleWallStack
							 });
		
		// Iron Trapdoor
		GameRegistry.addRecipe(new ItemStack(Blocks.trapDoorIron),
				new Object[] { " X ", "XYX", " X ", 'X', ingotIronStack, 'Y', trapdoorStack
							 });
		
		// Saddle
		if (Loader.isModLoaded("DartCraft")) {
			return;
		} else {
			GameRegistry.addRecipe(new ItemStack(Item.saddle),
					new Object[] { "XXX", "XZ ", " Y ", 'X', leatherStack, 'Y', ingotIronStack, 'Z', stringStack
								 });
		}
		
		// Horse Armour
		GameRegistry.addRecipe(new ItemStack(Item.horseArmorIron),
				new Object[] { "  X", "XYX", "X X", 'X', ingotIronStack, 'Y', Block.cloth
							 });
		GameRegistry.addRecipe(new ItemStack(Item.horseArmorGold),
				new Object[] { "  X", "XYX", "X X", 'X', ingotGoldStack, 'Y', Block.cloth
							 });
		GameRegistry.addRecipe(new ItemStack(Item.horseArmorDiamond),
				new Object[] { "  X", "XYX", "X X", 'X', diamondStack, 'Y', Block.cloth
							 });
		
		// 9 Iron Nugget <-> Iron
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ironNugget, 9),
				new Object[] { ingotIronStack
							 });
		GameRegistry.addRecipe(new ShapedOreRecipe(ingotIronStack,
				new Object[] { "XXX", "XXX", "XXX", 'X', "nuggetIron"
							 }));
		
		// Buttons
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.buttonIron),
				new Object[] { ingotIronStack, buttonStoneStack
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.buttonGold),
				new Object[] { ingotGoldStack, buttonStoneStack
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.buttonDiamond),
				new Object[] { diamondStack, buttonStoneStack
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.buttonEmerald),
				new Object[] { emeraldStack, buttonStoneStack
							 });
		
		// Levers
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.leverIron),
				new Object[] { ingotIronStack, leverStack
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.leverGold),
				new Object[] { ingotGoldStack, leverStack
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.leverDiamond),
				new Object[] { diamondStack, leverStack
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.leverEmerald),
				new Object[] { emeraldStack, leverStack
							 });
	}
}
