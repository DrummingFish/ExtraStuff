package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class ItemPermaIceHoe extends ItemHoe {

    protected ItemPermaIceHoe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
        this.setUnlocalizedName(ItemInfo.PERMAICE_HOE_UNLOCALIZED_NAME);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_HOE_ICON);
    }
}
