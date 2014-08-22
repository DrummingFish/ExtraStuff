package com.drummingfish.extrastuff.recipes;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.item.ItemsES;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	//public static boolean hardmodeRecipes;

	public static void registerRecipes() {

		ItemStack stoneBrickStack = new ItemStack(Blocks.stonebrick, 1, 0);
		ItemStack cobbleWallStack = new ItemStack(Blocks.cobblestone_wall, 1, 0);
		
		//if (OreDictionary.getOres("plateSteel").size() != 0) {
		//	  System.out.println("plateSteel OreDictionary value detected");
		//} else {
		//	  System.out.println("Cannot load plateSteel");
		//}
		
		// Chainmail recipes
		if (Loader.isModLoaded("gregtech_addon")) {
			return;
		} else {
			GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.chainmail, true,
					new Object[] { "X X", " X ", "X X", 'X', "nuggetIron"
								 }));
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet),
					new Object[] { "XXX", "X X", 'X', ItemsES.chainmail
								 });
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate),
					new Object[] { "X X", "XXX", "XXX", 'X', ItemsES.chainmail
								 });
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings),
					new Object[] { "XXX", "X X", "X X", 'X', ItemsES.chainmail
								 });
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots),
					new Object[] { "X X", "X X", 'X', ItemsES.chainmail
								 });
		}
		
		// Mossy Blocks
		if (Loader.isModLoaded("BiomesOPlenty") || Loader.isModLoaded("Forestry") || Loader.isModLoaded("ThermalExpansion")) {
			return;
		} else {
			GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone),
					new Object[] { "XXX", "XYX", "XXX", 'X', Blocks.vine, 'Y', Blocks.cobblestone
								 });
			GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 1, 1),
					new Object[] { "XXX", "XYX", "XXX", 'X', Blocks.vine, 'Y', stoneBrickStack
								 });
		}
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone_wall, 1, 1),
				new Object[] { "XXX", "XYX", "XXX", 'X', Blocks.vine, 'Y', cobbleWallStack
							 });
		
		// Iron Trapdoor
		GameRegistry.addRecipe(new ItemStack(BlocksES.trapDoorIron),
				new Object[] { " X ", "XYX", " X ", 'X', Items.iron_ingot, 'Y', Blocks.trapdoor
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
