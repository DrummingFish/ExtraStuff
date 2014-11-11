package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.item.ItemSpade;

public class ItemPermaIceShovel extends ItemSpade {

    protected ItemPermaIceShovel(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }
}
