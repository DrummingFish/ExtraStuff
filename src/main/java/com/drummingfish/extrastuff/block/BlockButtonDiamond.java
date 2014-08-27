package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockButton;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockButtonDiamond extends BlockButton {

	public BlockButtonDiamond() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_DIAMOND_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(2.5F);
		setResistance(10.0F);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return Blocks.diamond_block.getBlockTextureFromSide(1);
    }
}
