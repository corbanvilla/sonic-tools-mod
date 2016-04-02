package com.animcogn.sonicScrewdriverMod.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {

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

	public static void createArmor() {

		//Armor Materials
		ArmorMaterial Timetraveler = EnumHelper.addArmorMaterial("Timetraveler", "sonic-tools-mod:timetraveler", 38, new int[] {4, 8, 6, 3}, 30);
		ArmorMaterial Timelord = EnumHelper.addArmorMaterial("Timelord", "sonic-tools-mod:timelord", 44, new int[] {5, 8, 6, 4}, 40);
		ArmorMaterial Tardis = EnumHelper.addArmorMaterial("Tardis", "sonic-tools-mod:tardis", 100, new int[] {5, 8, 6, 5}, 80);

		//Armor
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
		
		tardisBoots = new TardisArmor("tardisBoots", Tardis, 1, 3);
		GameRegistry.registerItem(tardisBoots, "tardisBoots");
	}
}
