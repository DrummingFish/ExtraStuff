package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.ExtraStuff;
import net.minecraft.block.BlockButton;

public class BlockButtonObsidian extends BlockButton {

	protected BlockButtonObsidian() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_OBSIDIAN_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(5.0F);
		setResistance(2000.0F);
	}
}
