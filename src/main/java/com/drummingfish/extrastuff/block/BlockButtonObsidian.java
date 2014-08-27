package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockButton;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockButtonObsidian extends BlockButton {

	protected BlockButtonObsidian() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_OBSIDIAN_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(5.0F);
		setResistance(2000.0F);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return Blocks.obsidian.getBlockTextureFromSide(1);
    }
}
