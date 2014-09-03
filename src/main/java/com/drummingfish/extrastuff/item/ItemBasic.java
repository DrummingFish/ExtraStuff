package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic() {
        super();
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        if (this == ItemsES.ironNugget) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.IRON_NUGGET_ICON);
        } else if (this == ItemsES.encrustedFlower) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.ENCRUSTED_FLOWER_ICON);
        } else if (this == ItemsES.reinforcedString) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.REINFORCED_STRING_ICON);
        } else if (this == ItemsES.chainmail) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.CHAINMAIL_ICON);
        }
    }
}
