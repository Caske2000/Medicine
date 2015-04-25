package com.caske2000.medicine.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.caske2000.medicine.item.ModItems;
import com.caske2000.medicine.util.Reference;

public class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		register(ModItems.painkiller);
    }
	
	public static void register(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
