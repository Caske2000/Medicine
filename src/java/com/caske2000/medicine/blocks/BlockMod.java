package com.caske2000.medicine.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.caske2000.medicine.Main;

public class BlockMod extends Block {

	public BlockMod(Material material, float hardness, float resistance) {
		super(material);
		setCreativeTab(Main.tabMedicine);
		setHardness(hardness);
		setResistance(resistance);
	}

	public BlockMod(float hardness, float resistance) {
		this(Material.rock, hardness, resistance);
	}

	public BlockMod() {
		this(2.0f, 10.0f);
	}

	@Override
	public Block setUnlocalizedName(String unlocalizedName) {
		GameRegistry.registerBlock(this, unlocalizedName);
		return super.setUnlocalizedName(unlocalizedName);
	}
}
