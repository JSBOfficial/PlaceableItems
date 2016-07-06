package me.ferdz.placeableitems.tileentity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
	
public class TEGoldenApple extends TEEdible {

	private ItemStack apple;

	public TEGoldenApple() {
		apple = new ItemStack(Items.GOLDEN_APPLE);
	}

	public ItemStack getApple() {
		return this.apple;
	}

	public void setApple(ItemStack apple) {
		this.apple = apple;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		apple.readFromNBT(nbttagcompound.getCompoundTag("apple"));
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		NBTTagCompound nbt2 = apple.writeToNBT(new NBTTagCompound());
		nbttagcompound.setTag("apple", nbt2);
		return nbttagcompound;
	}
}