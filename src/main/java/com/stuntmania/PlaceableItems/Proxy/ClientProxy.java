package com.stuntmania.PlaceableItems.Proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.stuntmania.PlaceableItems.Init.ModBlocks;
import com.stuntmania.PlaceableItems.Renderers.*;
import com.stuntmania.PlaceableItems.TileEntities.*;

import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy {

	TESRIngot ingotBlockRenderer;
	TESRBowl bowlBlockRenderer;
	TESRBrick brickBlockRenderer;
	TESRSaddleStand saddleStandBlockRenderer;
	TESRHorseArmorStand horseArmorStandRenderer;
	
	TESRSteak steakBlockRenderer;
	TESRApple appleBlockRenderer;
	TESRFish fishBlockRenderer;
	TESRMelon melonBlockRenderer;
	TESREgg eggBlockRenderer;
	TESRPumpkinPie pumpkinPieRenderer;
	
	TESREnderPearl enderPearlBlockRenderer;
	TESREnderEye enderEyeBlockRenderer;
	
	TESRGunpowder gunpowderBlockRenderer;
	
	TESRBucket bucketBlockRenderer;
	
	@Override
	public void registerRenderers() {
		ingotBlockRenderer = new TESRIngot();
		bowlBlockRenderer = new TESRBowl();
		brickBlockRenderer = new TESRBrick();
		saddleStandBlockRenderer = new TESRSaddleStand();
		horseArmorStandRenderer = new TESRHorseArmorStand();

		steakBlockRenderer = new TESRSteak();
		appleBlockRenderer = new TESRApple();
		fishBlockRenderer = new TESRFish();
		melonBlockRenderer = new TESRMelon();
		eggBlockRenderer = new TESREgg();
		pumpkinPieRenderer = new TESRPumpkinPie();
		
		enderPearlBlockRenderer = new TESREnderPearl();
		enderEyeBlockRenderer = new TESREnderEye();
		
		gunpowderBlockRenderer = new TESRGunpowder();
		
		bucketBlockRenderer = new TESRBucket();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TEIngot.class, ingotBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBowl.class, bowlBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBrick.class, brickBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TESaddleStand.class, saddleStandBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHorseArmorStand.class, horseArmorStandRenderer);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TESteak.class, steakBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEApple.class, appleBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEFish.class, fishBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMelon.class, melonBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEEgg.class, eggBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPumpkinPie.class, pumpkinPieRenderer);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TEEnderPearl.class, enderPearlBlockRenderer);
		ClientRegistry.bindTileEntitySpecialRenderer(TEEnderEye.class, enderEyeBlockRenderer);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TEGunpowder.class, gunpowderBlockRenderer);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TEBucket.class, bucketBlockRenderer);
		
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.saddle), saddleStandBlockRenderer);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.horse_armor_stand), horseArmorStandRenderer);
	}
}
