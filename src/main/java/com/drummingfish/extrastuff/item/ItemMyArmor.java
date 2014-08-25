package com.drummingfish.extrastuff.item;

import mattsStuff.MattsStuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMyArmor extends ItemArmor {


	
	public ItemMyArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		setCreativeTab(MattsStuff.mattsStuffTab);
	}
	
	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
    {
		
		 player.fallDistance = 0.0F;
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (stack.itemID == Items.permaIceHelm.itemID || stack.itemID == Items.permaIceBody.itemID || stack.itemID == Items.permaIceBoots.itemID) {
			return "minecraft:textures/armor/permaice_1.png";
		}
		if (stack.itemID == Items.permaIceLegs.itemID) {
			return "minecraft:textures/armor/permaice_2.png";
		} else {
			return null;
		}

	}
			
	public void registerIcons(IconRegister register) {
		if (itemID == Items.permaIceHelm.itemID) {
			itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_HELM_ICON);
		}
		if (itemID == Items.permaIceBody.itemID) {
			itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BODY_ICON);
		}
		if (itemID == Items.permaIceLegs.itemID) {
			itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_LEGS_ICON);
		}
		if (itemID == Items.permaIceBoots.itemID) {
			itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BOOTS_ICON);
		}
	}
}
