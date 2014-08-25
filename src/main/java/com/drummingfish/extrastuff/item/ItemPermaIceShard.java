package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import mattsStuff.MattsStuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPermaIceShard extends Item {
	
	public ItemPermaIceShard() {
		super();
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setUnlocalizedName(ItemInfo.PERMAICE_SHARD_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_SHARD_ICON);
	}
}
