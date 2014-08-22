package com.drummingfish.extrastuff.block;

import net.minecraft.block.BlockLever;
import net.minecraft.util.Icon;
import extrastuff.core.ExtraStuff;

public class BlockLeverEmerald extends BlockLever {

	protected BlockLeverEmerald(int id) {
		super(id);
		setUnlocalizedName(BlockInfo.LEVER_EMERALD_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		this.setTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_EMERALD_ICON);
		setHardness(2.5F);
		setResistance(10.0F);
	}
}
