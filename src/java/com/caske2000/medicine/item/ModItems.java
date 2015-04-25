package com.caske2000.medicine.item;

import net.minecraft.item.Item;

public final class ModItems {
	
	// Items
	public static Item painkiller;
	
	public static void createItems() {
		painkiller = new Painkiller();
    }
}
