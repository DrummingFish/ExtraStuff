package com.drummingfish.extrastuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;

public class BlockButtonObsidian extends BlockButton {

	protected BlockButtonObsidian(int id) {
		super(id, false);
		setUnlocalizedName(BlockInfo.BUTTON_OBSIDIAN_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(5.0F);
		setResistance(2000.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return Block.obsidian.getBlockTextureFromSide(1);
    }
}
