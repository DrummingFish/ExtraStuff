package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockButton;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockButtons extends BlockButton {

    public BlockButtons() {
        super(false);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (this == BlocksES.buttonIron) {
            return Blocks.iron_block.getBlockTextureFromSide(1);
        } else if (this == BlocksES.buttonGold) {
            return Blocks.gold_block.getBlockTextureFromSide(1);
        } else if (this == BlocksES.buttonDiamond) {
            return Blocks.diamond_block.getBlockTextureFromSide(1);
        } else if (this == BlocksES.buttonEmerald) {
            return Blocks.emerald_block.getBlockTextureFromSide(1);
        } else {
            return Blocks.obsidian.getBlockTextureFromSide(1);
        }
    }
}
