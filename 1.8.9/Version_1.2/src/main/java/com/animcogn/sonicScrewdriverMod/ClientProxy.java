package com.animcogn.sonicScrewdriverMod;

import com.animcogn.sonicScrewdriverMod.client.render.blocks.BlockRenderRegister;
import com.animcogn.sonicScrewdriverMod.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		
		ItemRenderRegister.preInit();
		BlockRenderRegister.preInit();
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);

		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
		
//		System.out.println("Hey! You found the EASIEST EASTER EGG EVER!!!! Can you find the rest? PM me and i'll give you a shout-out in my next version :)");	
//		If you found this, good for you! I don't want to enable this quite yet, but in a later version I will. I still need to work on some organization stuffs	
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}