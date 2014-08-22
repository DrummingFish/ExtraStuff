package com.drummingfish.extrastuff.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;
import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.util.Icon;

public class BlockButtonGold extends BlockButton {

	protected BlockButtonGold(int id) {
		super(id, false);
		setUnlocalizedName(BlockInfo.BUTTON_GOLD_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(1.0F);
		setResistance(10.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return Block.blockGold.getBlockTextureFromSide(1);
    }

}
