package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.ExtraStuff;
import net.minecraft.block.BlockButton;

public class BlockButtonIron extends BlockButton {

	protected BlockButtonIron() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_IRON_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
