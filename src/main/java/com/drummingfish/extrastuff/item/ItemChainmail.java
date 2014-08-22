package com.drummingfish.extrastuff.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.items.ItemInfo;
import extrastuff.core.ExtraStuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemChainmail extends Item {

	public ItemChainmail(int id) {
		super(id);
		setCreativeTab(ExtraStuff.extraStuffTab);
		setUnlocalizedName(ItemInfo.CHAINMAIL_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.CHAINMAIL_ICON);
	}
}
