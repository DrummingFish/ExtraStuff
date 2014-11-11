package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDuctTape extends Item {
	
	public ItemDuctTape() {
		super();
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        if (par3World.getBlock(par4, par5, par6) != Blocks.snow) {
            if (par7 == 0) {
                --par5;
            }

            if (par7 == 1) {
                ++par5;
            }

            if (par7 == 2) {
                --par6;
            }

            if (par7 == 3) {
                ++par6;
            }

            if (par7 == 4) {
                --par4;
            }

            if (par7 == 5) {
                ++par4;
            }

            if (!par3World.isAirBlock(par4, par5, par6)) {
                return false;
            }
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
            return false;
        } else {
            if (BlocksES.ducttape.canPlaceBlockAt(par3World, par4, par5, par6)) {
                --par1ItemStack.stackSize;
                par3World.setBlock(par4, par5, par6, BlocksES.ducttape);
            }

            return true;
        }
    }
}
