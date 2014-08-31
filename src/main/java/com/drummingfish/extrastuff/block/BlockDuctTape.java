package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.item.ItemInfo;
import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

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

        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
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
        return true;
    }
	
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return ItemsES.ducttape;
    }
	
	@Override
	public boolean canProvidePower()
    {
        return false;
    }
	
	@Override
	public Item getItem(World par1World, int par2, int par3, int par4)
    {
        return ItemsES.ducttape;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.tapeCross = par1IconRegister.registerIcon(this.getTextureName() + "_" + "cross");
        this.tapeLine = par1IconRegister.registerIcon(this.getTextureName() + "_" + "line");
        this.tapeCrossOverlay = par1IconRegister.registerIcon(this.getTextureName() + "_" + "cross_overlay");
        this.tapeLineOverlay = par1IconRegister.registerIcon(this.getTextureName() + "_" + "line_overlay");
        this.blockIcon = this.tapeCross;
    }
    
    public static boolean isPowerProviderOrWire(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4) {
        Block block = par0IBlockAccess.getBlock(par1, par2, par3);

        if (block == BlocksES.ducttape) {
            return true;
        } else if (!Blocks.unpowered_repeater.func_149907_e(block)) {
            return block.canConnectRedstone(par0IBlockAccess, par1, par2, par3, par4);
        } else {
            int blockMeta = par0IBlockAccess.getBlockMetadata(par1, par2, par3);
            return par4 == (blockMeta & 3) || par4 == Direction.rotateOpposite[blockMeta & 3];
        }
    }

    @SideOnly(Side.CLIENT)
    public static IIcon getTapeIcon(String par0Str) {
        return par0Str.equals("cross") ? tapeCross : (par0Str.equals("line") ? tapeLine : (par0Str.equals("cross_overlay") ? tapeCrossOverlay : (par0Str.equals("line_overlay") ? tapeLineOverlay : null)));
    }
}
