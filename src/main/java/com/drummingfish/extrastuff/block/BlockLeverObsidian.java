package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockLever;

public class BlockLeverObsidian extends BlockLever {

	protected BlockLeverObsidian() {
		super();
		this.setBlockName(BlockInfo.LEVER_OBSIDIAN_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_OBSIDIAN_ICON);
		setHardness(5.0F);
		setResistance(2000.0F);
	}
}
