package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class ItemPermaIceSword extends ItemSword {

    protected ItemPermaIceSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
        this.setUnlocalizedName(ItemInfo.PERMAICE_SWORD_UNLOCALIZED_NAME);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_SWORD_ICON);
    }
}
