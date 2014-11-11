package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.item.ItemSword;

public class ItemPermaIceSword extends ItemSword {

    protected ItemPermaIceSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }
}
