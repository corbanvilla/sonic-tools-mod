package com.animcogn.sonicScrewdriverMod.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
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
	
	public static void createItems() {
		
		ToolMaterial Pickaxe = EnumHelper.addToolMaterial("Pickaxe", 4, 3000, 10.0F, 6.0F, 30);
		ToolMaterial Shovel = EnumHelper.addToolMaterial("Shovel", 4, 3000, 10.0F, 6.0F, 30);
		ToolMaterial Axe = EnumHelper.addToolMaterial("Axe", 4, 3000, 7.5F, 10.0F, 30);
		ToolMaterial Sword = EnumHelper.addToolMaterial("Sword", 4, 3000, 2.0F, 10.0F, 30);
		ToolMaterial SonicScrewdriver = EnumHelper.addToolMaterial("SonicScrewdriver", 30, 10000, 30.0F, 40.0F, 100);
		ArmorMaterial Timetraveler = EnumHelper.addArmorMaterial("Timetraveler", "sonic-tools-mod:timetraveler", 38, new int[] {4, 8, 6, 3}, 30);
		
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
	}
}
