package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockButton;

public class BlockButtonIron extends BlockButton {

	protected BlockButtonIron() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_IRON_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
