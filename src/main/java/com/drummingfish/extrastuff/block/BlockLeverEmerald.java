package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockLever;

public class BlockLeverEmerald extends BlockLever {

	protected BlockLeverEmerald() {
		super();
		this.setBlockName(BlockInfo.LEVER_EMERALD_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_EMERALD_ICON);
		setHardness(2.5F);
		setResistance(10.0F);
	}
}
