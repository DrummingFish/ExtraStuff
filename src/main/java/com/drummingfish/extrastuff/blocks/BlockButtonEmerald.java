package com.drummingfish.extrastuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;

public class BlockButtonEmerald extends BlockButton {

	protected BlockButtonEmerald(int id) {
		super(id, false);
		setUnlocalizedName(BlockInfo.BUTTON_EMERALD_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(2.5F);
		setResistance(10.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return Block.blockEmerald.getBlockTextureFromSide(1);
    }
}
