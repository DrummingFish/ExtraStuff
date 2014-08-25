package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

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

    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String renderType) {
		if (this.armorType == 2) {
			return "minecraft:textures/models/armor/permaice_1.png";
		}
		else {
            return "minecraft:textures/models/armor/permaice_2.png";
        }
	}
			
	public void registerIcons(IIconRegister register) {
		if (this == ItemsES.permaIceHelm) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_HELM_ICON);
		}
		if (this == ItemsES.permaIceBody) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BODY_ICON);
		}
		if (this == ItemsES.permaIceLegs) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_LEGS_ICON);
		}
		if (this == ItemsES.permaIceBoots) {
			register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BOOTS_ICON);
		}
	}
}
