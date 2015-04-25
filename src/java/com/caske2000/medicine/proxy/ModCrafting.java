package com.caske2000.medicine.proxy;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.caske2000.medicine.item.ModItems;

public final class ModCrafting {

	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModItems.painkiller, 1), new Object[] { "#", '#', Items.golden_apple });
	}
}
