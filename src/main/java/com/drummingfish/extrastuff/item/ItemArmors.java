package com.drummingfish.extrastuff.item;

import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import com.drummingfish.extrastuff.utilities.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmors extends ItemArmor {

	public ItemArmors(ArmorMaterial armourMaterial, int par3, int par4) {
		super(armourMaterial, par3, par4);
		this.setCreativeTab(ExtraStuffTab.EXTRASTUFF_TAB);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player != null) {
            if (this == ItemsES.permaIceHelm) {
                player.capabilities.setPlayerWalkSpeed(0.05F);
            }
        } else {
            player.capabilities.setPlayerWalkSpeed(0.1F);
        }
    }

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

        if (this == ItemsES.flowerHelm) {
            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.FLOWER_HELM_ICON);
        }
	}
}
