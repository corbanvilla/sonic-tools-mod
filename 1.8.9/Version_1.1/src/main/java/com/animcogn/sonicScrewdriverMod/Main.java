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
	public static final String VERSION = "1.1";
	public static final String NAME = "Sonic Tools Mod";
	
	
	@SidedProxy(clientSide="com.animcogn.sonicScrewdriverMod.ClientProxy", 
			serverSide="com.animcogn.sonicScrewdriverMod.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	    this.proxy.preInit(event);
	}
	
	//Items

		public static Item sonicScrewdriver;
		public static Item sonicPickaxe;
		public static Item sonicShovel;
		public static Item sonicAxe;
		public static Item sonicSword;
		public static Item timelordFragment;
		public static Item timetravelerHelmet;
		public static Item timetravelerChestplate;
		public static Item timetravelerLeggings;
		public static Item timetravelerBoots;
		public static Item timetravelerReminisce;
		
	//Blocks
		public static Block timeTravelerBlock;
		public static Block pegh;
	
	//Materials
		public static ToolMaterial Pickaxe = EnumHelper.addToolMaterial("Pickaxe", 4, 3000, 10.0F, 6.0F, 30);
		public static ToolMaterial Shovel = EnumHelper.addToolMaterial("Shovel", 4, 3000, 10.0F, 6.0F, 30);
		public static ToolMaterial Axe = EnumHelper.addToolMaterial("Axe", 4, 3000, 7.5F, 10.0F, 30);
		public static ToolMaterial Sword = EnumHelper.addToolMaterial("Sword", 4, 3000, 2.0F, 10.0F, 30);
		public static ToolMaterial SonicScrewdriver = EnumHelper.addToolMaterial("SonicScrewdriver", 30, 10000, 30.0F, 40.0F, 100);
		public static ArmorMaterial Timetraveler = EnumHelper.addArmorMaterial("Timetraveler", "sonic-tools-mod:timetraveler", 38, new int[] {4, 8, 6, 3}, 30);
		
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	this.proxy.init(event);
		
	//Importing Events
		MinecraftForge.EVENT_BUS.register(new MobsDropTimelordFragments());
		MinecraftForge.EVENT_BUS.register(new OnRightClick());
		
//		System.out.println("Hey! You found the EASIEST EASTER EGG EVER!!!! Can you find the rest? PM me and i'll give you a shout-out in my next version :)");	
//		If you found this, good for you! I don't want to enable this quite yet, but in a later version I will. I still need to work on some organization stuffs		
	//Items
		timetravelerHelmet = new TimeTravelerArmor("timetravelerHelmet", Timetraveler, 1, 0);
		GameRegistry.registerItem(timetravelerHelmet, "timetravelerHelmet");
		
		timetravelerChestplate = new TimeTravelerArmor("timetravelerChestplate", Timetraveler, 1, 1);
		GameRegistry.registerItem(timetravelerChestplate, "timetravelerChestplate");
		
		timetravelerLeggings = new TimeTravelerArmor("timetravelerLeggings", Timetraveler, 2, 2);
		GameRegistry.registerItem(timetravelerLeggings, "timetravelerLeggings");
		
		timetravelerBoots = new TimeTravelerArmor("timetravelerBoots", Timetraveler, 1, 3);
		GameRegistry.registerItem(timetravelerBoots, "timetravelerBoots");
		
		sonicScrewdriver = new SonicScrewdriver(SonicScrewdriver);
		GameRegistry.registerItem(sonicScrewdriver, "sonicScrewdriver");
			
		sonicPickaxe = new SonicPickaxe(Pickaxe);
		GameRegistry.registerItem(sonicPickaxe, "sonicPic");
			
		sonicShovel = new SonicShovel(Shovel);
		GameRegistry.registerItem(sonicShovel, "sonicShovel");
			
		sonicSword = new SonicSword(Sword);
		GameRegistry.registerItem(sonicSword, "sonicSword");
			
		sonicAxe = new SonicAxe(Axe);
		GameRegistry.registerItem(sonicAxe, "sonicAxe");
		
		timelordFragment = new TimelordFragment();
		GameRegistry.registerItem(timelordFragment, "timelordFragment");
		
		timetravelerReminisce = new TimeTravelerReminisce();
		GameRegistry.registerItem(timetravelerReminisce, "timetravelerReminisce");
		
	//Blocks	
		
		timeTravelerBlock = new TimeTravelerBlock();
		GameRegistry.registerBlock(timeTravelerBlock, "timeTravelerBlock");
		

    	GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    	
		
	//Ores																													
//		timeTravelerBlock = new TimeBlocks("timetravelerReminisce", Material.rock, Main.timeTravelerReminisce, 2, 4);
			
	//Shaped Recipes																																																																																																																																																																																																																																																																																																																																																																																																																																									pegh = new Pegh(); //Haha, lol. Whoopsies :P
		GameRegistry.addRecipe(
				new ItemStack(sonicScrewdriver),
				"pes",
				"dod",
				"hta",
				'p', sonicPickaxe,
				'e', Items.emerald,
				's', sonicSword,
				'd', Items.diamond,
				'o', Blocks.obsidian,
				'h', sonicShovel,
				'a', sonicAxe,
				't', timelordFragment);
		GameRegistry.addRecipe(
				new ItemStack(sonicSword),
				"oeo",
				"dsd",
				"ddd",
				'o', timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_sword);
		GameRegistry.addRecipe(
				new ItemStack(sonicShovel),
				"oeo",
				"dsd",
				"ddd",
				'o', timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_shovel);
		GameRegistry.addRecipe(
				new ItemStack(sonicPickaxe),
				"oeo",
				"dsd",
				"ddd",
				'o', timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_pickaxe);
		GameRegistry.addRecipe(
				new ItemStack(sonicAxe),
				"oeo",
				"dsd",
				"ddd",
				'o', timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_axe);
		GameRegistry.addRecipe(
				new ItemStack(timetravelerHelmet), 
				"ttt",
				"tdt",
				"ttt",
				't', timetravelerReminisce,
				'd', Items.diamond_helmet);
		GameRegistry.addRecipe(
				new ItemStack(timetravelerChestplate), 
				"ttt",
				"tdt",
				"ttt",
				't', timetravelerReminisce,
				'd', Items.diamond_chestplate);
		GameRegistry.addRecipe(
				new ItemStack(timetravelerLeggings), 
				"ttt",
				"tdt",
				"ttt",
				't', timetravelerReminisce,
				'd', Items.diamond_leggings);
		GameRegistry.addRecipe(
				new ItemStack(timetravelerBoots), 
				"ttt",
				"tdt",
				"ttt",
				't', timetravelerReminisce,
				'd', Items.diamond_boots);
		
		//Textures																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						GameRegistry.registerBlock(pegh, "pegh");
		Item sonicScrewdriverItem = GameRegistry.findItem("sonic-tools-mod", "sonicScrewdriver");	
		ModelResourceLocation sonicScrewdriverModel = 
			new ModelResourceLocation("sonic-tools-mod:sonicScrewdriver", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(sonicScrewdriverItem, 0, sonicScrewdriverModel);

		
		Item sonicSwordItem = GameRegistry.findItem("sonic-tools-mod", "sonicSword");
		ModelResourceLocation sonicSwordModel = 
			new ModelResourceLocation("sonic-tools-mod:sonicSword", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(sonicSwordItem, 0, sonicSwordModel);

		Item sonicPickaxeItem = GameRegistry.findItem("sonic-tools-mod", "sonicPic");
		ModelResourceLocation sonicPickaxeModel = 
			new ModelResourceLocation("sonic-tools-mod:sonicPic", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(sonicPickaxeItem, 0, sonicPickaxeModel);
		
		Item sonicAxeItem = GameRegistry.findItem("sonic-tools-mod", "sonicAxe");
		ModelResourceLocation sonicAxeModel = 
			new ModelResourceLocation("sonic-tools-mod:sonicAxe", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(sonicAxeItem, 0, sonicAxeModel);
		
		Item sonicShovelItem = GameRegistry.findItem("sonic-tools-mod", "sonicShovel");
		ModelResourceLocation sonicShovelModel = 
			new ModelResourceLocation("sonic-tools-mod:sonicShovel", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(sonicShovelItem, 0, sonicShovelModel);

		Item peghItem = GameRegistry.findItem("sonic-tools-mod", "pegh");
		ModelResourceLocation peghModel = 
			new ModelResourceLocation("sonic-tools-mod:pegh", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(peghItem, 0, peghModel);
		
		Item timelordFragmentItem = GameRegistry.findItem("sonic-tools-mod", "timelordFragment");
		ModelResourceLocation timelordFragmentModel = 
			new ModelResourceLocation("sonic-tools-mod:timelordFragment", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(timelordFragmentItem, 0, timelordFragmentModel);
		
		Item timetravelerHelmetItem = GameRegistry.findItem("sonic-tools-mod", "timetravelerHelmet");
		ModelResourceLocation timetravelerHelmetModel = 
			new ModelResourceLocation("sonic-tools-mod:timetravelerHelmet", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(timetravelerHelmetItem, 0, timetravelerHelmetModel);
		
		Item timetravelerChestplateItem = GameRegistry.findItem("sonic-tools-mod", "timetravelerChestplate");
		ModelResourceLocation timetravelerChestplateModel = 
			new ModelResourceLocation("sonic-tools-mod:timetravelerChestplate", "inventory");
		Minecraft.getMinecraft().getRenderItem()./*EasterEgg*/getItemModelMesher()
			.register(timetravelerChestplateItem, 0, timetravelerChestplateModel);
		
		Item timetravelerLeggingsItem = GameRegistry.findItem("sonic-tools-mod", "timetravelerLeggings");
		ModelResourceLocation timetravelerLeggingsModel = 
			new ModelResourceLocation("sonic-tools-mod:timetravelerLeggings", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(timetravelerLeggingsItem, 0, timetravelerLeggingsModel);
		
		Item timetravelerBootsItem = GameRegistry.findItem("sonic-tools-mod", "timetravelerBoots");
		ModelResourceLocation timetravelerBootsModel = 
			new ModelResourceLocation("sonic-tools-mod:timetravelerBoots", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(timetravelerBootsItem, 0, timetravelerBootsModel);
		
		Item timeTravelerBlockItem = GameRegistry.findItem("sonic-tools-mod", "timeTravelerBlock");
		ModelResourceLocation timeTravelerBlockModel = 
			new ModelResourceLocation("sonic-tools-mod:timeTravelerBlock", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(timeTravelerBlockItem, 0, timeTravelerBlockModel);
		
		Item timetravelerReminisceItem = GameRegistry.findItem("sonic-tools-mod", "timetravelerReminisce");
		ModelResourceLocation timetravelerReminisceModel = 
			new ModelResourceLocation("sonic-tools-mod:timetravelerReminisce", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(timetravelerReminisceItem, 0, timetravelerReminisceModel);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	    this.proxy.postInit(event);
	}
	
}