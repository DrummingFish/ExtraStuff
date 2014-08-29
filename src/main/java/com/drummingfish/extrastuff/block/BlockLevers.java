package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLever;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class BlockLevers extends BlockLever {

    public BlockLevers(String type) {
        super();
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);

        if (type == "iron") {
            this.setBlockName(BlockInfo.LEVER_IRON_UNLOCALIZED_NAME);
            this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_IRON_ICON);
            setHardness(2.0F);
            setResistance(10.0F);
        } else if (type == "gold") {
            this.setBlockName(BlockInfo.LEVER_GOLD_UNLOCALIZED_NAME);
            this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_GOLD_ICON);
            setHardness(1.0F);
            setResistance(10.0F);
        } else if (type == "diamond") {
            this.setBlockName(BlockInfo.LEVER_DIAMOND_UNLOCALIZED_NAME);
            this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_DIAMOND_ICON);
            setHardness(2.5F);
            setResistance(10.0F);
        } else if (type == "emerald") {
            this.setBlockName(BlockInfo.LEVER_EMERALD_UNLOCALIZED_NAME);
            this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_EMERALD_ICON);
            setHardness(2.5F);
            setResistance(10.0F);
        } else {
            this.setBlockName(BlockInfo.LEVER_OBSIDIAN_UNLOCALIZED_NAME);
            this.setBlockTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_OBSIDIAN_ICON);
            setHardness(5.0F);
            setResistance(2000.0F);
        }
    }
}
