package com.drummingfish.extrastuff.tab;

import extrastuff.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class ExtraStuffTab extends CreativeTabs {

	public ExtraStuffTab(int id, String name) {
		super(name);
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Items.chainmail.itemID;
		
	}
}
