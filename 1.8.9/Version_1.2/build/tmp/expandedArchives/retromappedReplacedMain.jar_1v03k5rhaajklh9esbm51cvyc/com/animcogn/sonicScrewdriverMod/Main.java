package com.animcogn.sonicScrewdriverMod;

import com.animcogn.sonicScrewdriverMod.world.WorldGen;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)

public class Main {
	
	public static final String MODID = "sonic-tools-mod";
	public static final String VERSION = "1.2";
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