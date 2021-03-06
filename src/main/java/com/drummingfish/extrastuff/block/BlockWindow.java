package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWindow extends BlockFenceGate {
	public static boolean disableValidation = false;
	
    public BlockWindow(Material par2Material) {
        super();
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return Blocks.glass.getBlockTextureFromSide(par1);
    }

    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
        return !par1World.getBlock(par2, par3, par4).isReplaceable(par1World, par2, par3, par4);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        int l = par1World.getBlockMetadata(par2, par3, par4);
        return isFenceGateOpen(l) ? null : (l != 2 && l != 0 ? AxisAlignedBB.getBoundingBox((double) ((float) par2 + 0.375F), (double) par3, (double) par4, (double) ((float) par2 + 0.625F), (double) ((float) par3 + 1.5F), (double) (par4 + 1)) : AxisAlignedBB.getBoundingBox((double) par2, (double) par3, (double) ((float) par4 + 0.375F), (double) (par2 + 1), (double) ((float) par3 + 1.5F), (double) ((float) par4 + 0.625F)));
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        int l = getDirection(par1IBlockAccess.getBlockMetadata(par2, par3, par4));

        if (l != 2 && l != 0) {
            this.setBlockBounds(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
        } else {
            this.setBlockBounds(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
        }
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        return isFenceGateOpen(par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public int getRenderType()
    {
        return 21;
    }

    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
        int l = (MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
        int i1 = par1World.getBlockMetadata(par2, par3, par4);

        if (isFenceGateOpen(i1)) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 & -5, 2);
        } else {
            int j1 = (MathHelper.floor_double((double)(par5EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
            int k1 = getDirection(i1);

            if (k1 == (j1 + 2) % 4) {
                i1 = j1;
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 | 4, 2);
        }

        par1World.playAuxSFXAtEntity(par5EntityPlayer, 1003, par2, par3, par4, 0);
        return true;
    }

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5) {
        if (!par1World.isRemote) {
            int i1 = par1World.getBlockMetadata(par2, par3, par4);
            boolean flag = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4);

            if (flag || par5.canProvidePower()) {
                if (flag && !isFenceGateOpen(i1)) {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 | 4, 2);
                    par1World.playAuxSFXAtEntity((EntityPlayer)null, 1003, par2, par3, par4, 0);
                } else if (!flag && isFenceGateOpen(i1)) {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 & -5, 2);
                    par1World.playAuxSFXAtEntity((EntityPlayer)null, 1003, par2, par3, par4, 0);
                }
            }
        }
    }

    public static boolean isFenceGateOpen(int par0) {
        return (par0 & 4) != 0;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {}
}
