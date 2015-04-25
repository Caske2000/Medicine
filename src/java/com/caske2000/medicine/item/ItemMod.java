package com.caske2000.medicine.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.caske2000.medicine.Main;

public class ItemMod extends Item {

	public ItemMod() {
		super();
		setCreativeTab(Main.tabMedicine);
	}

	@Override
	public Item setUnlocalizedName(String unlocalizedName) {
		GameRegistry.registerItem(this, unlocalizedName);
		return super.setUnlocalizedName(unlocalizedName);
	}
}
