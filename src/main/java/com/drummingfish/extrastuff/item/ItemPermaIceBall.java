package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.entity.EntityPermaIceBall;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPermaIceBall extends Item {

    public ItemPermaIceBall() {
        this.maxStackSize = 16;
        this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
        setUnlocalizedName(ItemInfo.PERMAICE_BALL_UNLOCALIZED_NAME);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
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

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BALL_ICON);
    }
}
