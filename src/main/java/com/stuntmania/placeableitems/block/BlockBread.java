package com.stuntmania.placeableitems.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.stuntmania.placeableitems.PlaceableItems;
import com.stuntmania.placeableitems.tileentity.TEBread;

public class BlockBread extends BlockPlaceableItems {
	
	public BlockBread() {
		super(Material.sponge);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.4F, 1F);
		this.setBlockTextureName(PlaceableItems.MODID + ":destroy/bread");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		return new TEBread();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		((TEBread)world.getTileEntity(x, y, z)).bite(6, 0.6F, player, world, x, y, z);
		return true;
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Items.bread;
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return new ItemStack(Items.bread);
	}
}
