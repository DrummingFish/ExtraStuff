package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockButton;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockButtonGold extends BlockButton {

	protected BlockButtonGold() {
		super(false);
		this.setBlockName(BlockInfo.BUTTON_GOLD_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(1.0F);
		setResistance(10.0F);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return Blocks.gold_block.getBlockTextureFromSide(1);
    }
}
