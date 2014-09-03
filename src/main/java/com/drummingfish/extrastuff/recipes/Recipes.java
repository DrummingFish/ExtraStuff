package com.drummingfish.extrastuff.recipes;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.item.ItemsES;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

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
			GameRegistry.addRecipe(new ItemStack(Items.saddle),
					new Object[] { "XXX", "XZ ", " Y ", 'X', Items.leather, 'Y', Items.iron_ingot, 'Z', Items.string
								 });
		}
		
		// Horse Armour
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor),
				new Object[] { "  X", "XYX", "X X", 'X', Items.iron_ingot, 'Y', Blocks.wool
							 });
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor),
				new Object[] { "  X", "XYX", "X X", 'X', Items.gold_ingot, 'Y', Blocks.wool
							 });
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor),
				new Object[] { "  X", "XYX", "X X", 'X', Items.diamond, 'Y', Blocks.wool
							 });
		
		// 9 Iron Nugget <-> Iron
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsES.ironNugget, 9),
				new Object[] { Items.iron_ingot
							 });
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.iron_ingot,
				new Object[] { "XXX", "XXX", "XXX", 'X', "nuggetIron"
							 }));
		
		// Buttons
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonIron),
				new Object[] { Items.iron_ingot, Blocks.stone_button
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonGold),
				new Object[] { Items.gold_ingot, Blocks.stone_button
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonDiamond),
				new Object[] { Items.diamond, Blocks.stone_button
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonEmerald),
				new Object[] { Items.emerald, Blocks.stone_button
							 });
		
		// Levers
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverIron),
				new Object[] { Items.iron_ingot, Blocks.lever
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverGold),
				new Object[] { Items.gold_ingot, Blocks.lever
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverDiamond),
				new Object[] { Items.diamond, Blocks.lever
							 });
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverEmerald),
				new Object[] { Items.emerald, Blocks.lever
							 });

        // Perma-Ice Armour
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceHelm),
                new Object[] { "XXX", "X X", 'X', ItemsES.permaIceShard,
                });
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceBody),
                new Object[] { "X X", "XXX", "XXX", 'X', ItemsES.permaIceShard,
                });
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceLegs),
                new Object[] { "XXX", "X X", "X X", 'X', ItemsES.permaIceShard,
                });
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceBoots),
                new Object[] { "X X", "X X", 'X', ItemsES.permaIceShard,
                });

        // Perma-Ice Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceAxe,
                new Object[] { "XX ", "XY ", " Y ", 'X', ItemsES.permaIceShard, 'Y', "stickWood"
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceHoe,
                new Object[] { "XX ", " Y ", " Y ", 'X', ItemsES.permaIceShard, 'Y', "stickWood"
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIcePickaxe,
                new Object[] { "XXX", " Y ", " Y ", 'X', ItemsES.permaIceShard, 'Y', "stickWood"
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceShovel,
                new Object[] { " X ", " Y ", " Y ", 'X', ItemsES.permaIceShard, 'Y', "stickWood"
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceSword,
                new Object[] { " X ", " X ", " Y ", 'X', ItemsES.permaIceShard, 'Y', "stickWood"
                }));

        // Floral Armour
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerHelm,
                new Object[] { "XXX", "YYY", 'X', "flower", 'Y', Items.string
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerBody,
                new Object[] { "XYX", "YXY", "XYX", 'X', "flower", 'Y', Items.string
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerLegs,
                new Object[] { "XXX", "XYX", "Y Y", 'X', "flower", 'Y', Items.string
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerBoots,
                new Object[] { "XYX", "ZYZ", 'X', "flower", 'Y', Items.string, 'Z', Items.leather
                }));
        // Encrusted Floral Armour

        // Duct Tape
        GameRegistry.addRecipe(new ItemStack(ItemsES.ducttape),
                new Object[] { "XXX", "XYX", "XXX", 'X', Items.paper, 'Y', Items.slime_ball
                });

        // Toilet Roll

        // Perma-Ice Block <-> 9 Perma-Ice Shard

        //
	}
}
