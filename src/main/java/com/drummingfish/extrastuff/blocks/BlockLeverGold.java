package com.drummingfish.extrastuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;
import extrastuff.items.ItemInfo;

public class BlockLeverGold extends BlockLever {

	protected BlockLeverGold(int id) {
		super(id);
		setUnlocalizedName(BlockInfo.LEVER_GOLD_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		this.setTextureName(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.LEVER_GOLD_ICON);
		setHardness(1.0F);
		setResistance(10.0F);
	}
}
