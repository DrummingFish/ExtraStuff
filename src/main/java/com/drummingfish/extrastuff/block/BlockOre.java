package com.drummingfish.extrastuff.block;

import java.util.Random;

import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOre extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon icon;
	
    public BlockOre() {
        super(Material.rock);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		icon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.PERMAICE_ORE_ICON);
	}
    
    @Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
			return icon;
	}

    @Override
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        	return ItemsES.permaIceShard;
    }

    @Override
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(1);
    }

    @Override
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, par2Random, par1))
        {
            int j = par2Random.nextInt(par1 + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(par2Random) * (j + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

    }

    private Random rand = new Random();

    @Override
    public int getExpDrop(IBlockAccess par1World, int par5, int par7)
    {
        if (this.getItemDropped(par5, rand, par7) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == BlocksES.orePermaIce)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }
            return j1;
        }

        return 0;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return 0;
    }
}