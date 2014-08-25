package com.drummingfish.extrastuff.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public class ItemsES {

    static ItemArmor.ArmorMaterial PERMAICE = new EnumHelper().addArmorMaterial("PERMAICE", 20, new int[] {2, 7, 5, 3}, 11);

	public static Item chainmail;
	public static Item ironNugget;
    public static Item ducttape;
    public static Item permaIceShard;
    public static Item permaIceHelm;
    public static Item permaIceBody;
    public static Item permaIceLegs;
    public static Item permaIceBoots;
	
	public static void init() {
		chainmail = new ItemChainmail();
		ironNugget = new ItemIronNugget();

        ducttape = new ItemDuctTape(null);
        permaIceShard = new ItemPermaIceShard();
        permaIceHelm = new ItemMyArmor(PERMAICE, 5, 0).setUnlocalizedName(ItemInfo.PERMAICE_HELM_UNLOCALIZED_NAME);
        permaIceBody = new ItemMyArmor(PERMAICE, 5, 1).setUnlocalizedName(ItemInfo.PERMAICE_BODY_UNLOCALIZED_NAME);
        permaIceLegs = new ItemMyArmor(PERMAICE, 5, 2).setUnlocalizedName(ItemInfo.PERMAICE_LEGS_UNLOCALIZED_NAME);
        permaIceBoots = new ItemMyArmor(PERMAICE, 5, 3).setUnlocalizedName(ItemInfo.PERMAICE_BOOTS_UNLOCALIZED_NAME);

        GameRegistry.registerItem(chainmail, "chainmail");
        GameRegistry.registerItem(ironNugget, ItemInfo.IRON_NUGGET_KEY);
    }
	
	public static void oreRegistration() {
		OreDictionary.registerOre("nuggetIron", new ItemStack(ItemsES.ironNugget));
	}
}
