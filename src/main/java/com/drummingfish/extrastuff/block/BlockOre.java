package com.drummingfish.extrastuff.block;

import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOre extends Block {

    public BlockOre(String type) {
        super(Material.rock);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
        if (type == "permaIceOre") {
            setBlockName(BlockInfo.PERMAICE_ORE_UNLOCALIZED_NAME);
            setHardness(4.0F);
        } else {
            setBlockName("Unknown Ore!");
        }
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.PERMAICE_ORE_ICON);
	}

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        	return ItemsES.permaIceShard;
    }

    @Override
    public int quantityDropped(Random par1Random)
    {
        return (int)(Math.random() * 2 + 1);
    }

    @Override
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random) {
        if (par1 > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, par2Random, par1)) {
            int j = par2Random.nextInt(par1 + 2) - 1;

            if (j < 0) {
                j = 0;
            }

            return this.quantityDropped(par2Random) * (j + 1);
        } else {
            return this.quantityDropped(par2Random);
        }
    }

    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
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

    public int damageDropped(int par1)
    {
        return 0;
    }
}
