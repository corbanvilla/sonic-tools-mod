package com.animcogn.sonicScrewdriverMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)

public class Main {
	
	public static final String MODID = "sonic-tools-mod";
	public static final String VERSION = "2.0";
	public static final String NAME = "Sonic Tools Mod";
	
	
	@SidedProxy(clientSide="com.animcogn.sonicScrewdriverMod.ClientProxy", 
			serverSide="com.animcogn.sonicScrewdriverMod.ServerProxy")
	
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	    this.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		this.proxy.init(event);

	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	    this.proxy.postInit(event);
	    
	}
}