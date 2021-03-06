package com.caske2000.medicine.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.caske2000.medicine.blocks.ModBlocks;
import com.caske2000.medicine.item.ModItems;
import com.caske2000.medicine.tileentity.TileEntityHealthBlock;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
		ModCrafting.init();
	}

	public void init(FMLInitializationEvent e) {
		registerTileEntities();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}

	public void registerTileEntities() {

		GameRegistry.registerTileEntity(TileEntityHealthBlock.class, TileEntityHealthBlock.publicName);
	}
}
