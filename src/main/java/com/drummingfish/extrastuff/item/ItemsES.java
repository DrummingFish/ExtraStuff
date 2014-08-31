package com.drummingfish.extrastuff.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ItemsES {

    static ItemArmor.ArmorMaterial armourPERMAICE = EnumHelper.addArmorMaterial("PERMAICE", 20, new int[]{2, 7, 5, 3}, 11);
    static ItemTool.ToolMaterial toolPERMAICE = EnumHelper.addToolMaterial("PERMAICE", 2, 500, 7F, 3, 9);

    static ItemArmor.ArmorMaterial armourMUMMY = EnumHelper.addArmorMaterial("MUMMY", 20, new int[]{1, 2, 2, 1}, 17);

    static ItemArmor.ArmorMaterial armourFLOWER = EnumHelper.addArmorMaterial("FLOWER", 4, new int[]{0, 0, 0, 0}, 0);

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

    public static Item permaIceAxe;
    public static Item permaIceHoe;
    public static Item permaIcePickaxe;
    public static Item permaIceShovel;
    public static Item permaIceSword;

    public static Item permaIceBall;

    public static void init() {
		chainmail = new ItemChainmail();

		ironNugget = new ItemIronNugget();

        ducttape = new ItemDuctTape(null);

        permaIceShard = new ItemPermaIceShard();

        permaIceHelm = new ItemArmors(armourPERMAICE, 5, 0).setUnlocalizedName(ItemInfo.PERMAICE_HELM_UNLOCALIZED_NAME);
        permaIceBody = new ItemArmors(armourPERMAICE, 5, 1).setUnlocalizedName(ItemInfo.PERMAICE_BODY_UNLOCALIZED_NAME);
        permaIceLegs = new ItemArmors(armourPERMAICE, 5, 2).setUnlocalizedName(ItemInfo.PERMAICE_LEGS_UNLOCALIZED_NAME);
        permaIceBoots = new ItemArmors(armourPERMAICE, 5, 3).setUnlocalizedName(ItemInfo.PERMAICE_BOOTS_UNLOCALIZED_NAME);

        mummyHelm = new ItemArmors(armourMUMMY, 6, 0).setUnlocalizedName(ItemInfo.MUMMY_HELM_UNLOCALIZED_NAME);
        mummyBody = new ItemArmors(armourMUMMY, 6, 1).setUnlocalizedName(ItemInfo.MUMMY_BODY_UNLOCALIZED_NAME);
        mummyLegs = new ItemArmors(armourMUMMY, 6, 2).setUnlocalizedName(ItemInfo.MUMMY_LEGS_UNLOCALIZED_NAME);
        mummyBoots = new ItemArmors(armourMUMMY, 6, 3).setUnlocalizedName(ItemInfo.MUMMY_BOOTS_UNLOCALIZED_NAME);

        flowerHelm = new ItemArmors(armourFLOWER, 7, 0).setUnlocalizedName(ItemInfo.FLOWER_HELM_UNLOCALIZED_NAME);
        flowerBody = new ItemArmors(armourFLOWER, 7, 1).setUnlocalizedName(ItemInfo.FLOWER_BODY_UNLOCALIZED_NAME);
        flowerLegs = new ItemArmors(armourFLOWER, 7, 2).setUnlocalizedName(ItemInfo.FLOWER_LEGS_UNLOCALIZED_NAME);
        flowerBoots = new ItemArmors(armourFLOWER, 7, 3).setUnlocalizedName(ItemInfo.FLOWER_BOOTS_UNLOCALIZED_NAME);

        permaIceAxe = new ItemPermaIceAxe(toolPERMAICE);
        permaIceHoe = new ItemPermaIceHoe(toolPERMAICE);
        permaIcePickaxe = new ItemPermaIcePickaxe(toolPERMAICE);
        permaIceShovel = new ItemPermaIceShovel(toolPERMAICE);
        permaIceSword = new ItemPermaIceSword(toolPERMAICE);

        permaIceBall = new ItemPermaIceBall();

        GameRegistry.registerItem(chainmail, ItemInfo.CHAINMAIL_KEY);

        GameRegistry.registerItem(ironNugget, ItemInfo.IRON_NUGGET_KEY);

        GameRegistry.registerItem(ducttape, ItemInfo.DUCT_TAPE_KEY);

        GameRegistry.registerItem(permaIceShard, ItemInfo.PERMAICE_SHARD_KEY);

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

        GameRegistry.registerItem(permaIceAxe, ItemInfo.PERMAICE_AXE_KEY);
        GameRegistry.registerItem(permaIceHoe, ItemInfo.PERMAICE_HOE_KEY);
        GameRegistry.registerItem(permaIcePickaxe, ItemInfo.PERMAICE_PICKAXE_KEY);
        GameRegistry.registerItem(permaIceShovel, ItemInfo.PERMAICE_SHOVEL_KEY);
        GameRegistry.registerItem(permaIceSword, ItemInfo.PERMAICE_SWORD_KEY);

        GameRegistry.registerItem(permaIceBall, ItemInfo.PERMAICE_BALL_KEY);
    }
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(ItemsES.ironNugget));
	}
}
