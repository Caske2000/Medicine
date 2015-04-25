package com.caske2000.medicine;

import com.caske2000.medicine.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MedicineTab extends CreativeTabs {

	public MedicineTab(String label) {
		super(label);
		setBackgroundImageName("medicine.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.painkiller;
	}
	
}
