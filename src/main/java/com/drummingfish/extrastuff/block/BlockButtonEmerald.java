package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.ExtraStuff;
import net.minecraft.block.BlockButton;

public class BlockButtonEmerald extends BlockButton {

	protected BlockButtonEmerald() {
		super(false);
        this.setBlockName(BlockInfo.BUTTON_EMERALD_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(2.5F);
		setResistance(10.0F);
	}
}
