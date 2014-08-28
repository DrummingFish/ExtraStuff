package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPermaIce extends Block {

    public BlockPermaIce(Material material) {
        super(material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
        this.setBlockName(BlockInfo.PERMAICE_BLOCK_UNLOCALIZED_NAME);
    }
}
