package com.drummingfish.extrastuff.block;

import java.util.Random;

import com.drummingfish.extrastuff.item.ItemInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDuctTape extends BlockRedstoneWire {

	@SideOnly(Side.CLIENT)
    private static IIcon tapeCross;
    @SideOnly(Side.CLIENT)
    private static IIcon tapeLine;
    @SideOnly(Side.CLIENT)
    private static IIcon tapeCrossOverlay;
    @SideOnly(Side.CLIENT)
    private static IIcon tapeLineOverlay;
	
	public BlockDuctTape() {
		super();
		
		setCreativeTab(CreativeTabs.tabMisc);
		setHardness(1F);
		setStepSound(Block.soundTypeCloth);
		this.setBlockName(BlockInfo.DUCT_TAPE_UNLOCALIZED_NAME);
	}

	@SideOnly(Side.CLIENT)
    public void registerIcon(IIconRegister register) {
        register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.CHAINMAIL_ICON);
    }
	
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
    }
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Items.ducttape.itemID;
    }
	
	@Override
	public boolean canProvidePower()
    {
        return false;
    }
	
	@Override
	public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Items.ducttape.itemID;
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.tapeCross = par1IconRegister.registerIcon(this.getTextureName() + "_" + "cross");
        this.tapeLine = par1IconRegister.registerIcon(this.getTextureName() + "_" + "line");
        this.tapeCrossOverlay = par1IconRegister.registerIcon(this.getTextureName() + "_" + "cross_overlay");
        this.tapeLineOverlay = par1IconRegister.registerIcon(this.getTextureName() + "_" + "line_overlay");
        this.blockIcon = this.tapeCross;
    }
    
    public static boolean isPowerProviderOrWire(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

        if (i1 == Blocks.ducttape.blockID)
        {
            return true;
        }
        else if (i1 == 0)
        {
            return false;
        }
        else if (!Block.redstoneRepeaterIdle.func_94487_f(i1))
        {
            return (Block.blocksList[i1] != null && Block.blocksList[i1].canConnectRedstone(par0IBlockAccess, par1, par2, par3, par4));
        }
        else
        {
            int j1 = par0IBlockAccess.getBlockMetadata(par1, par2, par3);
            return par4 == (j1 & 3) || par4 == Direction.rotateOpposite[j1 & 3];
        }
    }
    
    @SideOnly(Side.CLIENT)
    public static Icon getTapeIcon(String par0Str)
    {
        return par0Str.equals("cross") ? tapeCross : (par0Str.equals("line") ? tapeLine : (par0Str.equals("cross_overlay") ? tapeCrossOverlay : (par0Str.equals("line_overlay") ? tapeLineOverlay : null)));
    }
}
