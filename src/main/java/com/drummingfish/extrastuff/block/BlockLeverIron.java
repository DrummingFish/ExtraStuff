package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockLever;

public class BlockLeverIron extends BlockLever {

	protected BlockLeverIron() {
		super();
		this.setBlockName(BlockInfo.LEVER_IRON_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_IRON_ICON);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
