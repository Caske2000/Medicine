package com.caske2000.medicine.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class Painkiller extends ItemMod {

	public Painkiller() {
		setUnlocalizedName("painkiller_item");
		setMaxStackSize(1);
	}	
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		// PotionEffect(id, duration in TICKS, amplifier)
		playerIn.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 3));
		if (!playerIn.capabilities.isCreativeMode) {
			
                return new ItemStack(Items.glass_bottle);
                
        }
        return itemStackIn;
    }
}
