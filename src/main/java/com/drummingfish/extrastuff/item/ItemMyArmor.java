package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMyArmor extends ItemArmor {

	public ItemMyArmor(ArmorMaterial armourMaterial, int par3, int par4) {
		super(armourMaterial, par3, par4);
		this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
	}
	
//	@Override
//	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
//    {
//		 player.fallDistance = 0.0F;
//    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		if (stack == Items.permaIceHelm || stack == Items.permaIceBody || stack == Items.permaIceBoots) {
			return "minecraft:textures/models/armor/permaice_1.png";
		}
		if (stack == Items.permaIceLegs) {
			return "minecraft:textures/models/armor/permaice_2.png";
		} else {
			return null;
		}

	}
			
	public void registerIcons(IIconRegister register) {
		if (this == Items.permaIceHelm) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_HELM_ICON);
		}
		if (this == Items.permaIceBody) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BODY_ICON);
		}
		if (this == Items.permaIceLegs) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_LEGS_ICON);
		}
		if (this == Items.permaIceBoots) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BOOTS_ICON);
		}
	}
}
