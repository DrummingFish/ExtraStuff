package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockLever;

public class BlockLeverGold extends BlockLever {

	protected BlockLeverGold() {
		super();
		this.setBlockName(BlockInfo.LEVER_GOLD_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_GOLD_ICON);
		setHardness(1.0F);
		setResistance(10.0F);
	}
}
