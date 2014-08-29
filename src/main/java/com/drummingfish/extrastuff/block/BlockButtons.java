package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockButton;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockButtons extends BlockButton {

    public BlockButtons(String type) {
        super(false);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);

        if (type == "iron") {
            this.setBlockName(BlockInfo.BUTTON_IRON_UNLOCALIZED_NAME);
            setHardness(2.0F);
            setResistance(10.0F);
        } else if (type == "gold") {
            this.setBlockName(BlockInfo.BUTTON_GOLD_UNLOCALIZED_NAME);
            setHardness(1.0F);
            setResistance(10.0F);
        } else if (type == "diamond") {
            this.setBlockName(BlockInfo.BUTTON_DIAMOND_UNLOCALIZED_NAME);
            setHardness(2.5F);
            setResistance(10.0F);
        } else if (type == "emerald") {
            this.setBlockName(BlockInfo.BUTTON_EMERALD_UNLOCALIZED_NAME);
            setHardness(2.5F);
            setResistance(10.0F);
        } else {
            this.setBlockName(BlockInfo.BUTTON_OBSIDIAN_UNLOCALIZED_NAME);
            setHardness(5.0F);
            setResistance(2000.0F);
        }
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
