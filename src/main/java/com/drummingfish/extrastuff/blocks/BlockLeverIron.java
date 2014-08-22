package com.drummingfish.extrastuff.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.util.Icon;

public class BlockLeverIron extends BlockLever {

	protected BlockLeverIron(int id) {
		super(id);
		setUnlocalizedName(BlockInfo.LEVER_IRON_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		this.setTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_IRON_ICON);
		setHardness(2.0F);
		setResistance(10.0F);
	}
}
