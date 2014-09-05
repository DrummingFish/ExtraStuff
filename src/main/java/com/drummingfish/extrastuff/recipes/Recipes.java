package com.drummingfish.extrastuff.recipes;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.item.ItemsES;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
	
	//public static boolean hardmodeRecipes;

	public static void registerRecipes() {

		ItemStack stoneBrickStack = new ItemStack(Blocks.stonebrick, 1, 0);
		ItemStack cobbleWallStack = new ItemStack(Blocks.cobblestone_wall, 1, 0);

        ItemStack stringStack = new ItemStack(Items.string);
        ItemStack leatherStack = new ItemStack(Items.leather);
        ItemStack permaIceShardStack = new ItemStack(ItemsES.permaIceShard);
        ItemStack toiletRollStack = new ItemStack(ItemsES.toiletRoll);

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
					"XXX", "X X", 'X', ItemsES.chainmail);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate),
					"X X", "XXX", "XXX", 'X', ItemsES.chainmail);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings),
					"XXX", "X X", "X X", 'X', ItemsES.chainmail);
			GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots),
					"X X", "X X", 'X', ItemsES.chainmail);
		}
		
		// Mossy Blocks
		if (Loader.isModLoaded("BiomesOPlenty") || Loader.isModLoaded("Forestry") || Loader.isModLoaded("ThermalExpansion")) {
			return;
		} else {
			GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone),
					"XXX", "XYX", "XXX", 'X', Blocks.vine, 'Y', Blocks.cobblestone);
			GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 1, 1),
					"XXX", "XYX", "XXX", 'X', Blocks.vine, 'Y', stoneBrickStack);
		}
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone_wall, 1, 1),
		        "XXX", "XYX", "XXX", 'X', Blocks.vine, 'Y', cobbleWallStack);
		
		// Iron Trapdoor
		GameRegistry.addRecipe(new ItemStack(BlocksES.trapDoorIron),
				" X ", "XYX", " X ", 'X', Items.iron_ingot, 'Y', Blocks.trapdoor);
		
		// Saddle
		if (Loader.isModLoaded("DartCraft")) {
			return;
		} else {
			GameRegistry.addRecipe(new ItemStack(Items.saddle),
					"XXX", "XZ ", " Y ", 'X', leatherStack, 'Y', Items.iron_ingot, 'Z', stringStack);
		}
		
		// Horse Armour
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor),
				"  X", "XYX", "X X", 'X', Items.iron_ingot, 'Y', Blocks.wool);
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor),
				"  X", "XYX", "X X", 'X', Items.gold_ingot, 'Y', Blocks.wool);
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor),
				"  X", "XYX", "X X", 'X', Items.diamond, 'Y', Blocks.wool);
		
		// 9 Iron Nugget <-> Iron
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsES.ironNugget, 9),
				Items.iron_ingot);
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.iron_ingot,
				"XXX", "XXX", "XXX", 'X', "nuggetIron"));
		
		// Buttons
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonIron),
				Items.iron_ingot, Blocks.stone_button);
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonGold),
				Items.gold_ingot, Blocks.stone_button);
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonDiamond),
				Items.diamond, Blocks.stone_button);
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.buttonEmerald),
				Items.emerald, Blocks.stone_button);
		
		// Levers
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverIron),
				Items.iron_ingot, Blocks.lever);
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverGold),
				Items.gold_ingot, Blocks.lever);
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverDiamond),
				Items.diamond, Blocks.lever);
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksES.leverEmerald),
				Items.emerald, Blocks.lever);

        // Mummy Outfit
        GameRegistry.addRecipe(new ItemStack(ItemsES.mummyHelm),
                "XXX", "X X", 'X', toiletRollStack);
        GameRegistry.addRecipe(new ItemStack(ItemsES.mummyBody),
                "X X", "XXX", "XXX", 'X', toiletRollStack);
        GameRegistry.addRecipe(new ItemStack(ItemsES.mummyLegs),
                "XXX", "X X", "X X", 'X', toiletRollStack);
        GameRegistry.addRecipe(new ItemStack(ItemsES.mummyBoots),
                "X X", "X X", 'X', toiletRollStack);

        // Perma-Ice Armour
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceHelm),
                "XXX", "X X", 'X', permaIceShardStack);
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceBody),
                "X X", "XXX", "XXX", 'X', permaIceShardStack);
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceLegs),
                "XXX", "X X", "X X", 'X', permaIceShardStack);
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceBoots),
                "X X", "X X", 'X', permaIceShardStack);

        // Perma-Ice Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceAxe,
                "XX ", "XY ", " Y ", 'X', permaIceShardStack, 'Y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceHoe,
                "XX ", " Y ", " Y ", 'X', permaIceShardStack, 'Y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIcePickaxe,
                "XXX", " Y ", " Y ", 'X', permaIceShardStack, 'Y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceShovel,
                " X ", " Y ", " Y ", 'X', permaIceShardStack, 'Y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.permaIceSword,
                " X ", " X ", " Y ", 'X', permaIceShardStack, 'Y', "stickWood"));

        // Floral Armour
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerHelm,
                "XXX", "YYY", 'X', "flower", 'Y', stringStack));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerBody,
                "XYX", "YXY", "XYX", 'X', "flower", 'Y', stringStack));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerLegs,
                "XXX", "XYX", "Y Y", 'X', "flower", 'Y', stringStack));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.flowerBoots,
                "XYX", "ZYZ", 'X', "flower", 'Y', stringStack, 'Z', leatherStack));

        // Encrusted Floral Armour
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerHelm,
                "XXX", "YYY", 'X', ItemsES.encrustedFlower, 'Y', ItemsES.reinforcedString));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerBody,
                "XYX", "YXY", "XYX", 'X', ItemsES.encrustedFlower, 'Y', ItemsES.reinforcedString));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerLegs,
                "XXX", "XYX", "Y Y", 'X', ItemsES.encrustedFlower, 'Y', ItemsES.reinforcedString));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerBoots,
                "XYX", "ZYZ", 'X', ItemsES.encrustedFlower, 'Y', ItemsES.reinforcedString, 'Z', ItemsES.hardenedLeather));

        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerHelm,
                " Y ", "YXY", 'X', ItemsES.flowerHelm, 'Y', Items.diamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerBody,
                "YYY", " X ", "Y Y", 'X', ItemsES.flowerBody, 'Y', Items.diamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerLegs,
                "YYY", "YXY", 'X', ItemsES.flowerLegs, 'Y', Items.diamond));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemsES.diamondFlowerBoots,
                "YXY", 'X', ItemsES.flowerBoots, 'Y', Items.diamond));

        // Duct Tape
        GameRegistry.addRecipe(new ItemStack(ItemsES.ducttape),
                "XXX", "XYX", "XXX", 'X', Items.paper, 'Y', Items.slime_ball);

        // Toilet Roll
        GameRegistry.addRecipe(new ShapedOreRecipe(toiletRollStack,
                "XXX", "XYX", "XXX", 'X', Items.paper, 'Y', "stickWood"));

        // Perma-Ice Block <-> 9 Perma-Ice Shard
        GameRegistry.addShapelessRecipe(new ItemStack(ItemsES.permaIceShard, 9),
                BlocksES.blockPermaIce);
        GameRegistry.addRecipe(new ItemStack(BlocksES.blockPermaIce),
                "XXX", "XXX", "XXX", 'X', permaIceShardStack);

        // Perma-Ice Ball
        GameRegistry.addRecipe(new ItemStack(ItemsES.permaIceBall),
                "XX ", "XX ", 'X', permaIceShardStack);

        // Encrusted Flower
        GameRegistry.addRecipe(new ShapelessOreRecipe(ItemsES.encrustedFlower,
                "flower", Items.diamond));

        // Reinforced String
        GameRegistry.addShapelessRecipe(new ItemStack(ItemsES.reinforcedString),
                stringStack, stringStack, stringStack);

        // Hardened Leather
        GameRegistry.addRecipe(new ShapelessOreRecipe(ItemsES.waterSoakedLeather,
                "bucketWater", leatherStack));
        GameRegistry.addSmelting(ItemsES.waterSoakedLeather, new ItemStack(ItemsES.hardenedLeather), 0f);
	}
}
