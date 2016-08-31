package com.animcogn.sonicScrewdriverMod;

import com.animcogn.sonicScrewdriverMod.AOE.AOEDig;
import com.animcogn.sonicScrewdriverMod.AOE.AOEKeyBinding;
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
import com.animcogn.sonicScrewdriverMod.packets.AOEHandler;
import com.animcogn.sonicScrewdriverMod.packets.AOEVar;
import com.animcogn.sonicScrewdriverMod.packets.FilterHandler;
import com.animcogn.sonicScrewdriverMod.packets.FilterVar;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;
import com.animcogn.sonicScrewdriverMod.world.WorldGen;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {
	
	public static SimpleNetworkWrapper network;
	
	public static KeyBinding[] keyBindings;

	public void preInit(FMLPreInitializationEvent e) {
		network = NetworkRegistry.INSTANCE.newSimpleChannel("sonicChannel");
		network.registerMessage(AOEHandler.class, AOEVar.class, 0, Side.SERVER);
		network.registerMessage(FilterHandler.class, FilterVar.class, 1, Side.SERVER);
		
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
		MinecraftForge.EVENT_BUS.register(new AOEKeyBinding());
		MinecraftForge.EVENT_BUS.register(new AOEDig());
    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    	
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}