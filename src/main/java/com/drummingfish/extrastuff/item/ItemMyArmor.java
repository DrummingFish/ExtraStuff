package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
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
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String renderType) {
		if (this == ItemsES.permaIceHelm || this == ItemsES.permaIceBody ||this == ItemsES.permaIceLegs || this == ItemsES.permaIceBoots) {
            if (this.armorType == 2) {
                return "extrastuff:models/armour/permaice_2.png";
            } else {
                return "extrastuff:models/armour/permaice_1.png";
            }
        } else {
            return "";
        }
	}

    @Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {
        System.out.println(this.getUnlocalizedName());
		if (this == ItemsES.permaIceHelm) {
			itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_HELM_ICON);
		}
		if (this == ItemsES.permaIceBody) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BODY_ICON);
		}
		if (this == ItemsES.permaIceLegs) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_LEGS_ICON);
		}
		if (this == ItemsES.permaIceBoots) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.PERMAICE_BOOTS_ICON);
		}

        if (this == ItemsES.mummyHelm) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.MUMMY_HELM_ICON);
        }
        if (this == ItemsES.mummyBody) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.MUMMY_BODY_ICON);
        }
        if (this == ItemsES.mummyLegs) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.MUMMY_LEGS_ICON);
        }
        if (this == ItemsES.mummyBoots) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.MUMMY_BOOTS_ICON);
        }
	}
}
