package com.caske2000.medicine.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.caske2000.medicine.blocks.ModBlocks;
import com.caske2000.medicine.util.Reference;

public class BlockRenderRegister {

	public static void registerBlockRenderer() {
		register(ModBlocks.healthBlock);
	}

	public static void register(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(Item.getItemFromBlock(block), 0,
						new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
