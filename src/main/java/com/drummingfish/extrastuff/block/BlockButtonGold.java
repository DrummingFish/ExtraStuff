package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockButton;

public class BlockButtonGold extends BlockButton {

	protected BlockButtonGold() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_GOLD_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(1.0F);
		setResistance(10.0F);
	}
}
