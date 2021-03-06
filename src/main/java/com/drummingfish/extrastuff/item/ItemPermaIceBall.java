package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.entity.EntityPermaIceBall;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPermaIceBall extends Item {

    public ItemPermaIceBall() {
        this.maxStackSize = 16;
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            --item.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote) {
            world.spawnEntityInWorld(new EntityPermaIceBall(world, player));
        }

        return item;
    }
}
