package com.animcogn.sonicScrewdriverMod;

import com.animcogn.sonicScrewdriverMod.armor.ModArmor;
import com.animcogn.sonicScrewdriverMod.blocks.ModBlocks;
import com.animcogn.sonicScrewdriverMod.crafting.ArmorCrafting;
import com.animcogn.sonicScrewdriverMod.crafting.ArmorSmelting;
import com.animcogn.sonicScrewdriverMod.crafting.ToolCrafting;
import com.animcogn.sonicScrewdriverMod.crafting.ToolSmelting;
import com.animcogn.sonicScrewdriverMod.events.AttackCountdown;
import com.animcogn.sonicScrewdriverMod.events.MobsDropTimelordFragments;
import com.animcogn.sonicScrewdriverMod.events.OnRightClick;
import com.animcogn.sonicScrewdriverMod.items.ModItems;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;
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
		ModArmor.createArmor();
		ModTools.createTools();
    }

    public void init(FMLInitializationEvent e) {
    	ArmorCrafting.initArmorCrafting();
    	ArmorSmelting.initArmorSmelting();
    	ToolCrafting.initToolCrafting();
    	ToolSmelting.initToolSmelting();
    	MinecraftForge.EVENT_BUS.register(new MobsDropTimelordFragments());
		MinecraftForge.EVENT_BUS.register(new OnRightClick());
		MinecraftForge.EVENT_BUS.register(new AttackCountdown());
    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}