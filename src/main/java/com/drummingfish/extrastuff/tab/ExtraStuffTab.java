package com.drummingfish.extrastuff.tab;

import com.drummingfish.extrastuff.ModInfo;
import com.drummingfish.extrastuff.item.ItemsES;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraStuffTab {

    public static final CreativeTabs EXTRASTUFF_TAB = new CreativeTabs(ModInfo.ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ItemsES.chainmail;

        }
    };
}
