package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockButton;

public class BlockButtonDiamond extends BlockButton {

	public BlockButtonDiamond() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_DIAMOND_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(2.5F);
		setResistance(10.0F);
	}
}
