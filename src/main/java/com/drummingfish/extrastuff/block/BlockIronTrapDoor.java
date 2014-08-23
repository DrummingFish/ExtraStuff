package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockIronTrapDoor extends BlockTrapDoor {
	
	private IIcon trapDoorIcon;

	protected BlockIronTrapDoor(Material par2Material) {
		super(par2Material);
		this.setBlockName(BlockInfo.TRAPDOOR_IRON_UNLOCALIZED_NAME);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
		setHardness(5.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return trapDoorIcon;
    }
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
        trapDoorIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.TRAPDOOR_IRON_ICON);
    }

}
