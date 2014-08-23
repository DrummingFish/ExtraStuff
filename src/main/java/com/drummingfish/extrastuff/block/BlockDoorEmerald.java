package com.drummingfish.extrastuff.block;

import java.util.Random;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import extrastuff.core.ExtraStuff;
import extrastuff.items.Items;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockDoorEmerald extends BlockDoor {

	@SideOnly(Side.CLIENT)
    private Icon[] field_111044_a;
    @SideOnly(Side.CLIENT)
    private Icon[] field_111043_b;
	
	protected BlockDoorEmerald(int id, Material par2Material) {
		super(id, par2Material);
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
        setUnlocalizedName(BlockInfo.DOOR_EMERALD_UNLOCALIZED_NAME);
	}
	

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
    {
        return field_111043_b[0];
    }
	

	@SideOnly(Side.CLIENT)
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 != 1 && par5 != 0)
        {
            int i1 = getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int j1 = i1 & 3;
            boolean flag = (i1 & 4) != 0;
            boolean flag1 = false;
            boolean flag2 = (i1 & 8) != 0;

            if (flag)
            {
                if (j1 == 0 && par5 == 2)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && par5 == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && par5 == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && par5 == 4)
                {
                    flag1 = !flag1;
                }
            }
            else
            {
                if (j1 == 0 && par5 == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && par5 == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && par5 == 4)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && par5 == 2)
                {
                    flag1 = !flag1;
                }

                if ((i1 & 16) != 0)
                {
                    flag1 = !flag1;
                }
            }

            return flag2 ? field_111044_a[flag1 ? 1 : 0] : field_111043_b[flag1 ? 1 : 0];
        }
        else
        {
            return field_111043_b[0];
        }
    }
	

	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        field_111044_a = new Icon[2];
        field_111043_b = new Icon[2];
        
        field_111044_a[0] = par1IconRegister.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DOOR_EMERALD_ICON_UPPER);
        field_111043_b[0] = par1IconRegister.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DOOR_EMERALD_ICON_LOWER);
        field_111044_a[1] = new IconFlipped(field_111044_a[0], true, false);
        field_111043_b[1] = new IconFlipped(field_111043_b[0], true, false);
    }
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Items.emeraldDoor.itemID;
    }
}
