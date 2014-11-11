package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.item.ItemHoe;

public class ItemPermaIceHoe extends ItemHoe {

    protected ItemPermaIceHoe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }
}
