package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.item.ItemAxe;

public class ItemPermaIceAxe extends ItemAxe {

    protected ItemPermaIceAxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }
}
