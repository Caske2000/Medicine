package com.caske2000.medicine.item;

import com.caske2000.medicine.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMod extends Item {
	
	public ItemMod() {
		super();
		setCreativeTab(Main.tabMedicine);
	}

	@Override
	public Item setUnlocalizedName(String name) {
		GameRegistry.registerItem(this, name);
		return super.setUnlocalizedName(name);
	}
}
