package com.drummingfish.extrastuff.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockIronTrapDoor extends BlockTrapDoor {
	
	private Icon trapDoorIcon;

	protected BlockIronTrapDoor(int id, Material par2Material) {
		super(id, par2Material);
		setUnlocalizedName(BlockInfo.TRAPDOOR_IRON_UNLOCALIZED_NAME);
		this.setCreativeTab(ExtraStuff.extraStuffTab);
		setHardness(5.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return trapDoorIcon;
    }
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register)
    {
        trapDoorIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.TRAPDOOR_IRON_ICON);
    }

}
