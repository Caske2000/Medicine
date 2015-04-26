package com.caske2000.medicine.blocks;

import java.util.Random;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.caske2000.medicine.Main;
import com.caske2000.medicine.tileentity.TileEntityHealthBlock;

public class HealthBlock extends BlockMod implements ITileEntityProvider {

	protected HealthBlock() {
		super();
		setUnlocalizedName("healthBlock_block");
		setCreativeTab(Main.tabMedicine);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.94F, 1.0F);
	}

	public enum GUIs {
		HEALTHBLOCK
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.healthBlock);
	}

	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos) {
		return Item.getItemFromBlock(ModBlocks.healthBlock);
	}

	public int getRenderType() {
		return 3;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean isFullCube() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityHealthBlock();
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		worldIn.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, pos.getX(), pos.getY(), pos.getZ(), 1.0D, 1.0D, 1.0D, new int[0]);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY,
			float hitZ) {
		if (worldIn.isRemote) {
			if (worldIn.getTileEntity(pos) != null)
				playerIn.openGui(Main.instance, GUIs.HEALTHBLOCK.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
			return true;
		}
		return true;
	}
}
