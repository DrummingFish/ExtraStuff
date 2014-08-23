package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockButton;

public class BlockButtonEmerald extends BlockButton {

	protected BlockButtonEmerald() {
		super(false);
        this.setBlockName(BlockInfo.BUTTON_EMERALD_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(2.5F);
		setResistance(10.0F);
	}
}
