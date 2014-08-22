package com.drummingfish.extrastuff.block;

import net.minecraft.block.BlockLever;
import net.minecraft.util.Icon;
import extrastuff.core.ExtraStuff;

public class BlockLeverObsidian extends BlockLever {

	protected BlockLeverObsidian(int id) {
		super(id);
		setUnlocalizedName(BlockInfo.LEVER_OBSIDIAN_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		this.setTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_OBSIDIAN_ICON);
		setHardness(5.0F);
		setResistance(2000.0F);
	}
}
