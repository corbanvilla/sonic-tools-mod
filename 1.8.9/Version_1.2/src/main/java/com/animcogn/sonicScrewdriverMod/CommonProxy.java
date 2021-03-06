package com.animcogn.sonicScrewdriverMod;

import com.animcogn.sonicScrewdriverMod.blocks.ModBlocks;
import com.animcogn.sonicScrewdriverMod.crafting.ModCrafting;
import com.animcogn.sonicScrewdriverMod.events.MobsDropTimelordFragments;
import com.animcogn.sonicScrewdriverMod.events.OnRightClick;
import com.animcogn.sonicScrewdriverMod.items.ModItems;
import com.animcogn.sonicScrewdriverMod.world.WorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {
    	ModCrafting.initCrafting();
    	MinecraftForge.EVENT_BUS.register(new MobsDropTimelordFragments());
		MinecraftForge.EVENT_BUS.register(new OnRightClick());
    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}