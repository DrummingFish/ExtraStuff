package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.item.ItemPickaxe;

public class ItemPermaIcePickaxe extends ItemPickaxe {

    protected ItemPermaIcePickaxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }
}
