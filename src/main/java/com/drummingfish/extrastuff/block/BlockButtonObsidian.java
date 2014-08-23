package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.ExtraStuff;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockButton;

public class BlockButtonObsidian extends BlockButton {

	protected BlockButtonObsidian() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_OBSIDIAN_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(5.0F);
		setResistance(2000.0F);
	}
}
