package com.drummingfish.extrastuff.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.items.ItemInfo;
import extrastuff.core.ExtraStuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIronNugget extends Item {

	public ItemIronNugget(int id) {
		super(id);
		setCreativeTab(ExtraStuff.extraStuffTab);
		setUnlocalizedName(ItemInfo.IRON_NUGGET_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.IRON_NUGGET_ICON);
	}
}
