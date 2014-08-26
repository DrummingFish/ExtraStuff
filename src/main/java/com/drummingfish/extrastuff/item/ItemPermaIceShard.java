package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemPermaIceShard extends Item {
	
	public ItemPermaIceShard() {
		super();
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setUnlocalizedName(ItemInfo.PERMAICE_SHARD_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_SHARD_ICON);
	}
}
