package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

public class BlockIronTrapDoor extends BlockTrapDoor {

	protected BlockIronTrapDoor(Material par2Material) {
		super(par2Material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
	}
}
