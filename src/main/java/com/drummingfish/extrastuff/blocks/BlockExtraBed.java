package com.drummingfish.extrastuff.blocks;

import java.util.Iterator;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumStatus;
import net.minecraft.item.Item;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BlockExtraBed extends BlockDirectional {

	public static final int[][] footBlockToHeadBlockMap = new int[][] {{0, 1}, { -1, 0}, {0, -1}, {1, 0}};
    @SideOnly(Side.CLIENT)
    private Icon[] field_94472_b0;
    @SideOnly(Side.CLIENT)
    private Icon[] bedSideIcons0;
    @SideOnly(Side.CLIENT)
    private Icon[] bedTopIcons0;
    
    @SideOnly(Side.CLIENT)
    private Icon[] field_94472_b1;
    @SideOnly(Side.CLIENT)
    private Icon[] bedSideIcons1;
    @SideOnly(Side.CLIENT)
    private Icon[] bedTopIcons1;
    
    int clickCount;
	
	public BlockExtraBed(int id) {
		super(id, Material.cloth);
		this.setBounds();
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int par2)
    {
        if (side == 0)
        {
            return Block.planks.getBlockTextureFromSide(side);
        }
        else
        {
            int k = getDirection(par2);
            int l = Direction.bedDirection[k][side];
            int i1 = isBlockHeadOfBed(par2) ? 1 : 0;
            if (clickCount == 0) {
            	return (i1 != 1 || l != 2) && (i1 != 0 || l != 3) ? (l != 5 && l != 4 ? this.bedTopIcons0[i1] : this.bedSideIcons0[i1]) : this.field_94472_b0[i1];
            } else {
            	return (i1 != 1 || l != 2) && (i1 != 0 || l != 3) ? (l != 5 && l != 4 ? this.bedTopIcons1[i1] : this.bedSideIcons1[i1]) : this.field_94472_b1[i1];
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        bedTopIcons0 = new Icon[] {par1IconRegister.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.EXTRABED_FEETTOP0), par1IconRegister.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.EXTRABED_HEADTOP0)};
        field_94472_b0 = new Icon[] {par1IconRegister.registerIcon(this.getTextureName() + "_feet_end0"), par1IconRegister.registerIcon(this.getTextureName() + "_head_end0")};
        bedSideIcons0 = new Icon[] {par1IconRegister.registerIcon(this.getTextureName() + "_feet_side0"), par1IconRegister.registerIcon(this.getTextureName() + "_head_side0")};
        
        bedTopIcons1 = new Icon[] {par1IconRegister.registerIcon(this.getTextureName() + "_feet_top1"), par1IconRegister.registerIcon(this.getTextureName() + "_head_top1")};
        field_94472_b1 = new Icon[] {par1IconRegister.registerIcon(this.getTextureName() + "_feet_end1"), par1IconRegister.registerIcon(this.getTextureName() + "_head_end1")};
        bedSideIcons1 = new Icon[] {par1IconRegister.registerIcon(this.getTextureName() + "_feet_side1"), par1IconRegister.registerIcon(this.getTextureName() + "_head_side1")};
    }
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
        	if (!par1World.isRemote) {
				if (clickCount < 1) {
        			clickCount++;
        			getIcon(1, clickCount);
        			par1World.setBlockMetadataWithNotify(par2, par3, par4, clickCount, 3);
        			return true;
        		} else {
        			clickCount = 0;
        			getIcon(1, clickCount);
        			par1World.setBlockMetadataWithNotify(par2, par3, par4, clickCount, 3);
        			return true;
        		}
        	}
        }
		
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            int i1 = par1World.getBlockMetadata(par2, par3, par4);

            if (!isBlockHeadOfBed(i1))
            {
                int j1 = getDirection(i1);
                par2 += footBlockToHeadBlockMap[j1][0];
                par4 += footBlockToHeadBlockMap[j1][1];

                if (par1World.getBlockId(par2, par3, par4) != this.blockID)
                {
                    return true;
                }

                i1 = par1World.getBlockMetadata(par2, par3, par4);
            }

            if (par1World.provider.canRespawnHere() && par1World.getBiomeGenForCoords(par2, par4) != BiomeGenBase.hell)
            {
                if (isBedOccupied(i1))
                {
                    EntityPlayer entityplayer1 = null;
                    Iterator iterator = par1World.playerEntities.iterator();

                    while (iterator.hasNext())
                    {
                        EntityPlayer entityplayer2 = (EntityPlayer)iterator.next();

                        if (entityplayer2.isPlayerSleeping())
                        {
                            ChunkCoordinates chunkcoordinates = entityplayer2.playerLocation;

                            if (chunkcoordinates.posX == par2 && chunkcoordinates.posY == par3 && chunkcoordinates.posZ == par4)
                            {
                                entityplayer1 = entityplayer2;
                            }
                        }
                    }

                    if (entityplayer1 != null)
                    {
                        par5EntityPlayer.addChatMessage("tile.bed.occupied");
                        return true;
                    }

                    setBedOccupied(par1World, par2, par3, par4, false);
                }

                EnumStatus enumstatus = par5EntityPlayer.sleepInBedAt(par2, par3, par4);

                if (enumstatus == EnumStatus.OK)
                {
                    setBedOccupied(par1World, par2, par3, par4, true);
                    return true;
                }
                else
                {
                    if (enumstatus == EnumStatus.NOT_POSSIBLE_NOW)
                    {
                        par5EntityPlayer.addChatMessage("tile.bed.noSleep");
                    }
                    else if (enumstatus == EnumStatus.NOT_SAFE)
                    {
                        par5EntityPlayer.addChatMessage("tile.bed.notSafe");
                    }

                    return true;
                }
            }
            else
            {
                double d0 = (double)par2 + 0.5D;
                double d1 = (double)par3 + 0.5D;
                double d2 = (double)par4 + 0.5D;
                par1World.setBlockToAir(par2, par3, par4);
                int k1 = getDirection(i1);
                par2 += footBlockToHeadBlockMap[k1][0];
                par4 += footBlockToHeadBlockMap[k1][1];

                if (par1World.getBlockId(par2, par3, par4) == this.blockID)
                {
                    par1World.setBlockToAir(par2, par3, par4);
                    d0 = (d0 + (double)par2 + 0.5D) / 2.0D;
                    d1 = (d1 + (double)par3 + 0.5D) / 2.0D;
                    d2 = (d2 + (double)par4 + 0.5D) / 2.0D;
                }

                par1World.newExplosion((Entity)null, (double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), 5.0F, true, true);
                return true;
            }
        }
    }
	
	public int getRenderType()
    {
        return 14;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        this.setBounds();
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        int i1 = par1World.getBlockMetadata(par2, par3, par4);
        int j1 = getDirection(i1);

        if (isBlockHeadOfBed(i1))
        {
            if (par1World.getBlockId(par2 - footBlockToHeadBlockMap[j1][0], par3, par4 - footBlockToHeadBlockMap[j1][1]) != this.blockID)
            {
                par1World.setBlockToAir(par2, par3, par4);
            }
        }
        else if (par1World.getBlockId(par2 + footBlockToHeadBlockMap[j1][0], par3, par4 + footBlockToHeadBlockMap[j1][1]) != this.blockID)
        {
            par1World.setBlockToAir(par2, par3, par4);

            if (!par1World.isRemote)
            {
                this.dropBlockAsItem(par1World, par2, par3, par4, i1, 0);
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return isBlockHeadOfBed(par1) ? 0 : Item.bed.itemID;
    }

    /**
     * Set the bounds of the bed block.
     */
    private void setBounds()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
    }

    /**
     * Returns whether or not this bed block is the head of the bed.
     */
    public static boolean isBlockHeadOfBed(int par0)
    {
        return (par0 & 8) != 0;
    }

    /**
     * Return whether or not the bed is occupied.
     */
    public static boolean isBedOccupied(int par0)
    {
        return (par0 & 4) != 0;
    }

    /**
     * Sets whether or not the bed is occupied.
     */
    public static void setBedOccupied(World par0World, int par1, int par2, int par3, boolean par4)
    {
        int l = par0World.getBlockMetadata(par1, par2, par3);

        if (par4)
        {
            l |= 4;
        }
        else
        {
            l &= -5;
        }

        par0World.setBlockMetadataWithNotify(par1, par2, par3, l, 4);
    }

    /**
     * Gets the nearest empty chunk coordinates for the player to wake up from a bed into.
     */
    public static ChunkCoordinates getNearestEmptyChunkCoordinates(World par0World, int par1, int par2, int par3, int par4)
    {
        int i1 = par0World.getBlockMetadata(par1, par2, par3);
        int j1 = BlockDirectional.getDirection(i1);

        for (int k1 = 0; k1 <= 1; ++k1)
        {
            int l1 = par1 - footBlockToHeadBlockMap[j1][0] * k1 - 1;
            int i2 = par3 - footBlockToHeadBlockMap[j1][1] * k1 - 1;
            int j2 = l1 + 2;
            int k2 = i2 + 2;

            for (int l2 = l1; l2 <= j2; ++l2)
            {
                for (int i3 = i2; i3 <= k2; ++i3)
                {
                    if (par0World.doesBlockHaveSolidTopSurface(l2, par2 - 1, i3) && !par0World.getBlockMaterial(l2, par2, i3).isOpaque() && !par0World.getBlockMaterial(l2, par2 + 1, i3).isOpaque())
                    {
                        if (par4 <= 0)
                        {
                            return new ChunkCoordinates(l2, par2, i3);
                        }

                        --par4;
                    }
                }
            }
        }

        return null;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!isBlockHeadOfBed(par5))
        {
            super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
        }
    }

    /**
     * Returns the mobility information of the block, 0 = free, 1 = can't push but can move over, 2 = total immobility
     * and stop pistons
     */
    public int getMobilityFlag()
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Item.bed.itemID;
    }

    /**
     * Called when the block is attempted to be harvested
     */
    public void onBlockHarvested(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer)
    {
        if (par6EntityPlayer.capabilities.isCreativeMode && isBlockHeadOfBed(par5))
        {
            int i1 = getDirection(par5);
            par2 -= footBlockToHeadBlockMap[i1][0];
            par4 -= footBlockToHeadBlockMap[i1][1];

            if (par1World.getBlockId(par2, par3, par4) == this.blockID)
            {
                par1World.setBlockToAir(par2, par3, par4);
            }
        }
    }

}
