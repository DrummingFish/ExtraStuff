package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockLever;

public class BlockLeverDiamond extends BlockLever {

	protected BlockLeverDiamond() {
		super();
		this.setBlockName(BlockInfo.LEVER_DIAMOND_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_DIAMOND_ICON);
		setHardness(2.5F);
		setResistance(10.0F);
	}
}
