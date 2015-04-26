package com.caske2000.medicine.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityHealthBlock extends TileEntity {

	int tick = 0;

	public static final String publicName = "tileEntityHealthBlock";
	private String name = "tileEntityHealthBlock";

	public String getName() {

		return name;
	}
}
