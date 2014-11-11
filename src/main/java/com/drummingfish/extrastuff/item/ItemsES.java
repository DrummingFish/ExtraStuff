package com.drummingfish.extrastuff.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ItemsES {

    static ItemArmor.ArmorMaterial armourPERMAICE = EnumHelper.addArmorMaterial("PERMAICE", 20, new int[]{2, 7, 5, 3}, 11);
    static ItemArmor.ArmorMaterial armourMUMMY = EnumHelper.addArmorMaterial("MUMMY", 20, new int[]{1, 2, 2, 1}, 17);
    static ItemArmor.ArmorMaterial armourFLOWER = EnumHelper.addArmorMaterial("FLOWER", 4, new int[]{0, 0, 0, 0}, 0);
    static ItemArmor.ArmorMaterial armourDIAMONDFLOWER = EnumHelper.addArmorMaterial("DIAMONDFLOWER", 25, new int[]{3, 7, 5, 3}, 12);

    static ItemTool.ToolMaterial toolPERMAICE = EnumHelper.addToolMaterial("PERMAICE", 2, 500, 7F, 3, 9);

    public static Item chainmail;

    public static Item ironNugget;

    public static Item ducttape;

    public static Item permaIceShard;

    public static Item toiletRoll;

    public static Item permaIceHelm;
    public static Item permaIceBody;
    public static Item permaIceLegs;
    public static Item permaIceBoots;

    public static Item mummyHelm;
    public static Item mummyBody;
    public static Item mummyLegs;
    public static Item mummyBoots;

    public static Item flowerHelm;
    public static Item flowerBody;
    public static Item flowerLegs;
    public static Item flowerBoots;

    public static Item diamondFlowerHelm;
    public static Item diamondFlowerBody;
    public static Item diamondFlowerLegs;
    public static Item diamondFlowerBoots;

    public static Item permaIceAxe;
    public static Item permaIceHoe;
    public static Item permaIcePickaxe;
    public static Item permaIceShovel;
    public static Item permaIceSword;

    public static Item permaIceBall;

    public static Item encrustedFlower;

    public static Item reinforcedString;

    public static Item hardenedLeather;

    public static Item waterSoakedLeather;

    public static void init() {
		chainmail = new ItemBasic().setUnlocalizedName(ItemInfo.CHAINMAIL_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.CHAINMAIL_ICON);

		ironNugget = new ItemBasic().setUnlocalizedName(ItemInfo.IRON_NUGGET_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.IRON_NUGGET_ICON);

        ducttape = new ItemDuctTape().setUnlocalizedName(ItemInfo.DUCT_TAPE_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.DUCT_TAPE_ICON);

        permaIceShard = new ItemPermaIceShard().setUnlocalizedName(ItemInfo.PERMAICE_SHARD_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_SHARD_ICON);

        toiletRoll = new ItemToiletRoll().setUnlocalizedName(ItemInfo.TOILET_ROLL_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.TOILET_ROLL_ICON);

        permaIceHelm = new ItemArmors(armourPERMAICE, 5, 0).setUnlocalizedName(ItemInfo.PERMAICE_HELM_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_HELM_ICON);
        permaIceBody = new ItemArmors(armourPERMAICE, 5, 1).setUnlocalizedName(ItemInfo.PERMAICE_BODY_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_BODY_ICON);
        permaIceLegs = new ItemArmors(armourPERMAICE, 5, 2).setUnlocalizedName(ItemInfo.PERMAICE_LEGS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_LEGS_ICON);
        permaIceBoots = new ItemArmors(armourPERMAICE, 5, 3).setUnlocalizedName(ItemInfo.PERMAICE_BOOTS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_BOOTS_ICON);

        mummyHelm = new ItemArmors(armourMUMMY, 6, 0).setUnlocalizedName(ItemInfo.MUMMY_HELM_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.MUMMY_HELM_ICON);
        mummyBody = new ItemArmors(armourMUMMY, 6, 1).setUnlocalizedName(ItemInfo.MUMMY_BODY_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.MUMMY_BODY_ICON);
        mummyLegs = new ItemArmors(armourMUMMY, 6, 2).setUnlocalizedName(ItemInfo.MUMMY_LEGS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.MUMMY_LEGS_ICON);
        mummyBoots = new ItemArmors(armourMUMMY, 6, 3).setUnlocalizedName(ItemInfo.MUMMY_BOOTS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.MUMMY_BOOTS_ICON);

        flowerHelm = new ItemArmors(armourFLOWER, 7, 0).setUnlocalizedName(ItemInfo.FLOWER_HELM_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.FLOWER_HELM_ICON);
        flowerBody = new ItemArmors(armourFLOWER, 7, 1).setUnlocalizedName(ItemInfo.FLOWER_BODY_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.FLOWER_BODY_ICON);
        flowerLegs = new ItemArmors(armourFLOWER, 7, 2).setUnlocalizedName(ItemInfo.FLOWER_LEGS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.FLOWER_LEGS_ICON);
        flowerBoots = new ItemArmors(armourFLOWER, 7, 3).setUnlocalizedName(ItemInfo.FLOWER_BOOTS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.FLOWER_BOOTS_ICON);

        diamondFlowerHelm = new ItemArmors(armourDIAMONDFLOWER, 8, 0).setUnlocalizedName(ItemInfo.DIAMOND_FLOWER_HELM_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.DIAMOND_FLOWER_HELM_ICON);
        diamondFlowerBody = new ItemArmors(armourDIAMONDFLOWER, 8, 1).setUnlocalizedName(ItemInfo.DIAMOND_FLOWER_BODY_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.DIAMOND_FLOWER_BODY_ICON);
        diamondFlowerLegs = new ItemArmors(armourDIAMONDFLOWER, 8, 2).setUnlocalizedName(ItemInfo.DIAMOND_FLOWER_LEGS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.DIAMOND_FLOWER_LEGS_ICON);
        diamondFlowerBoots = new ItemArmors(armourDIAMONDFLOWER, 8, 3).setUnlocalizedName(ItemInfo.DIAMOND_FLOWER_BOOTS_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.DIAMOND_FLOWER_BOOTS_ICON);

        permaIceAxe = new ItemPermaIceAxe(toolPERMAICE).setUnlocalizedName(ItemInfo.PERMAICE_AXE_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_AXE_ICON);
        permaIceHoe = new ItemPermaIceHoe(toolPERMAICE).setUnlocalizedName(ItemInfo.PERMAICE_HOE_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_HOE_ICON);
        permaIcePickaxe = new ItemPermaIcePickaxe(toolPERMAICE).setUnlocalizedName(ItemInfo.PERMAICE_PICKAXE_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_PICKAXE_ICON);
        permaIceShovel = new ItemPermaIceShovel(toolPERMAICE).setUnlocalizedName(ItemInfo.PERMAICE_SHOVEL_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_SHOVEL_ICON);
        permaIceSword = new ItemPermaIceSword(toolPERMAICE).setUnlocalizedName(ItemInfo.PERMAICE_SWORD_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_SWORD_ICON);

        permaIceBall = new ItemPermaIceBall().setUnlocalizedName(ItemInfo.PERMAICE_BALL_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.PERMAICE_BALL_ICON);

        encrustedFlower = new ItemBasic().setUnlocalizedName(ItemInfo.ENCRUSTED_FLOWER_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.ENCRUSTED_FLOWER_ICON);

        reinforcedString = new ItemBasic().setUnlocalizedName(ItemInfo.REINFORCED_STRING_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.REINFORCED_STRING_ICON);

        hardenedLeather = new ItemBasic().setUnlocalizedName(ItemInfo.HARDENED_LEATHER_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.HARDENED_LEATHER_ICON);

        waterSoakedLeather = new ItemBasic().setUnlocalizedName(ItemInfo.WATER_SOAKED_LEATHER_UNLOCALIZED_NAME).setTextureName(ItemInfo.TEXTURE_LOCATION + ItemInfo.WATER_SOAKED_LEATHER_ICON);

        GameRegistry.registerItem(chainmail, ItemInfo.CHAINMAIL_KEY);

        GameRegistry.registerItem(ironNugget, ItemInfo.IRON_NUGGET_KEY);

        GameRegistry.registerItem(ducttape, ItemInfo.DUCT_TAPE_KEY);

        GameRegistry.registerItem(permaIceShard, ItemInfo.PERMAICE_SHARD_KEY);

        GameRegistry.registerItem(toiletRoll, ItemInfo.TOILET_ROLL_KEY);

        GameRegistry.registerItem(permaIceHelm, ItemInfo.PERMAICE_HELM_KEY);
        GameRegistry.registerItem(permaIceBody, ItemInfo.PERMAICE_BODY_KEY);
        GameRegistry.registerItem(permaIceLegs, ItemInfo.PERMAICE_LEGS_KEY);
        GameRegistry.registerItem(permaIceBoots, ItemInfo.PERMAICE_BOOTS_KEY);

        GameRegistry.registerItem(mummyHelm, ItemInfo.MUMMY_HELM_KEY);
        GameRegistry.registerItem(mummyBody, ItemInfo.MUMMY_BODY_KEY);
        GameRegistry.registerItem(mummyLegs, ItemInfo.MUMMY_LEGS_KEY);
        GameRegistry.registerItem(mummyBoots, ItemInfo.MUMMY_BOOTS_KEY);

        GameRegistry.registerItem(flowerHelm, ItemInfo.FLOWER_HELM_KEY);
        GameRegistry.registerItem(flowerBody, ItemInfo.FLOWER_BODY_KEY);
        GameRegistry.registerItem(flowerLegs, ItemInfo.FLOWER_LEGS_KEY);
        GameRegistry.registerItem(flowerBoots, ItemInfo.FLOWER_BOOTS_KEY);

        GameRegistry.registerItem(diamondFlowerHelm, ItemInfo.DIAMOND_FLOWER_HELM_KEY);
        GameRegistry.registerItem(diamondFlowerBody, ItemInfo.DIAMOND_FLOWER_BODY_KEY);
        GameRegistry.registerItem(diamondFlowerLegs, ItemInfo.DIAMOND_FLOWER_LEGS_KEY);
        GameRegistry.registerItem(diamondFlowerBoots, ItemInfo.DIAMOND_FLOWER_BOOTS_KEY);

        GameRegistry.registerItem(permaIceAxe, ItemInfo.PERMAICE_AXE_KEY);
        GameRegistry.registerItem(permaIceHoe, ItemInfo.PERMAICE_HOE_KEY);
        GameRegistry.registerItem(permaIcePickaxe, ItemInfo.PERMAICE_PICKAXE_KEY);
        GameRegistry.registerItem(permaIceShovel, ItemInfo.PERMAICE_SHOVEL_KEY);
        GameRegistry.registerItem(permaIceSword, ItemInfo.PERMAICE_SWORD_KEY);

        GameRegistry.registerItem(permaIceBall, ItemInfo.PERMAICE_BALL_KEY);

        GameRegistry.registerItem(encrustedFlower, ItemInfo.ENCRUSTED_FLOWER_KEY);

        GameRegistry.registerItem(reinforcedString, ItemInfo.REINFORCED_STRING_KEY);

        GameRegistry.registerItem(hardenedLeather, ItemInfo.HARDENED_LEATHER_KEY);

        GameRegistry.registerItem(waterSoakedLeather, ItemInfo.WATER_SOAKED_LEATHER_KEY);
    }
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(ItemsES.ironNugget));
        OreDictionary.registerOre("stickWood", new ItemStack(Items.stick));
        OreDictionary.registerOre("bucketWater", new ItemStack(Items.water_bucket));
    }
}
