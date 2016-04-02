package com.animcogn.sonicScrewdriverMod.items;

import com.animcogn.sonicScrewdriverMod.armor.TardisArmor;
import com.animcogn.sonicScrewdriverMod.armor.TimeTravelerArmor;
import com.animcogn.sonicScrewdriverMod.armor.TimelordArmor;
import com.animcogn.sonicScrewdriverMod.tools.SonicAxe;
import com.animcogn.sonicScrewdriverMod.tools.SonicPickaxe;
import com.animcogn.sonicScrewdriverMod.tools.SonicScrewdriver;
import com.animcogn.sonicScrewdriverMod.tools.SonicShovel;
import com.animcogn.sonicScrewdriverMod.tools.SonicSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Tools
	public static Item sonicScrewdriver;
	public static Item sonicPickaxe;
	public static Item sonicShovel;
	public static Item sonicAxe;
	public static Item sonicSword;
	
	//Items
	public static Item timetravelerReminisce;
	public static Item stabalizedTimeEnergy;
	public static Item timetravelerCluster;
	public static Item timelordFragment;
	public static Item unstableTimeEnergy;
	
	//Armor
		//Time Traveler
	public static Item timetravelerHelmet;
	public static Item timetravelerChestplate;
	public static Item timetravelerLeggings;
	public static Item timetravelerBoots;
		
		//Timelord
	public static Item timelordHelmet;
	public static Item timelordChestplate;
	public static Item timelordLeggings;
	public static Item timelordBoots;
	
		//Tardis
	public static Item tardisHelmet;
	public static Item tardisChestplate;
	public static Item tardisLeggings;
	public static Item tardisBoots;
	
	public static final CreativeTabs tabSonicToolsMod = new CreativeTabs("sonicToolsMod") {
		@Override public Item getTabIconItem() {
			return sonicScrewdriver;
		}
	};
	
	public static void createItems() {		  
		
	//Tool Materials
		ToolMaterial Pickaxe = EnumHelper.addToolMaterial("Pickaxe", 4, 3000, 10.0F, 6.0F, 30);
		ToolMaterial Shovel = EnumHelper.addToolMaterial("Shovel", 4, 3000, 10.0F, 6.0F, 30);
		ToolMaterial Axe = EnumHelper.addToolMaterial("Axe", 4, 3000, 7.5F, 10.0F, 30);
		ToolMaterial Sword = EnumHelper.addToolMaterial("Sword", 4, 3000, 2.0F, 10.0F, 30);
		ToolMaterial SonicScrewdriver = EnumHelper.addToolMaterial("SonicScrewdriver", 30, 10000, 30.0F, 40.0F, 100);
		
	//Armor Materials
		ArmorMaterial Timetraveler = EnumHelper.addArmorMaterial("Timetraveler", "sonic-tools-mod:timetraveler", 38, new int[] {4, 8, 6, 3}, 30, null);
		ArmorMaterial Timelord = EnumHelper.addArmorMaterial("Timelord", "sonic-tools-mod:timelord", 44, new int[] {5, 8, 6, 4}, 40, null);
		ArmorMaterial Tardis = EnumHelper.addArmorMaterial("Tardis", "sonic-tools-mod:tardis", 100, new int[] {5, 8, 6, 5}, 80, null);
		
		//Time Armor
		
		timetravelerHelmet = new TimeTravelerArmor("timetravelerHelmet", Timetraveler, 1, 0);
		GameRegistry.registerItem(timetravelerHelmet, "timetravelerHelmet");
		
		timetravelerChestplate = new TimeTravelerArmor("timetravelerChestplate", Timetraveler, 1, 1);
		GameRegistry.registerItem(timetravelerChestplate, "timetravelerChestplate");
		
		timetravelerLeggings = new TimeTravelerArmor("timetravelerLeggings", Timetraveler, 2, 2);
		GameRegistry.registerItem(timetravelerLeggings, "timetravelerLeggings");
		
		timetravelerBoots = new TimeTravelerArmor("timetravelerBoots", Timetraveler, 1, 3);
		GameRegistry.registerItem(timetravelerBoots, "timetravelerBoots");
		
		//Timelord Armor
		
		timelordHelmet = new TimelordArmor("timelordHelmet", Timelord, 1, 0);
		GameRegistry.registerItem(timelordHelmet, "timelordHelmet");
				
		timelordChestplate = new TimelordArmor("timelordChestplate", Timelord, 1, 1);
		GameRegistry.registerItem(timelordChestplate, "timelordChestplate");
		
		timelordLeggings = new TimelordArmor("timelordLeggings", Timelord, 2, 2);
		GameRegistry.registerItem(timelordLeggings, "timelordLeggings");
				
		timelordBoots = new TimelordArmor("timelordBoots", Timelord, 1, 3);
		GameRegistry.registerItem(timelordBoots, "timelordBoots");
		
		//Tardis Armor
		tardisHelmet = new TardisArmor("tardisHelmet", Tardis, 1, 0);
		GameRegistry.registerItem(tardisHelmet, "tardisHelmet");
		
		tardisChestplate = new TardisArmor("tardisChestplate", Tardis, 1, 1);
		GameRegistry.registerItem(tardisChestplate, "tardisChestplate");
		
		tardisLeggings = new TardisArmor("tardisLeggings", Tardis, 2, 2);
		GameRegistry.registerItem(tardisLeggings, "tardisLeggings");
		//Sonic Tools
		
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
		
		//Items
		
		timelordFragment = new TimelordFragment();
		GameRegistry.registerItem(timelordFragment, "timelordFragment");
		
		timetravelerReminisce = new TimeTravelerReminisce();
		GameRegistry.registerItem(timetravelerReminisce, "timetravelerReminisce");
		
		stabalizedTimeEnergy = new StabilizedTimeEnergy();
		GameRegistry.registerItem(stabalizedTimeEnergy, "stabalizedTimeEnergy");
		
		timetravelerCluster = new TimeTravelerCluster();
		GameRegistry.registerItem(timetravelerCluster, "timetravelerCluster");
		
		}
}