package com.animcogn.sonicScrewdriverMod.crafting;

import com.animcogn.sonicScrewdriverMod.armor.ModArmor;
import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorCrafting {

	public static void initArmorCrafting() {
		//Time Traveler :P
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerHelmet), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.diamond_helmet);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerChestplate), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.diamond_chestplate);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerLeggings), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.diamond_leggings);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerBoots), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.diamond_boots);
		
		//Time Lord
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timelordHelmet),
				"ccc",
				"ctc",
				"ccc",
				'c', ModItems.timetravelerCluster,
				't', ModArmor.timetravelerHelmet);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timelordChestplate),
				"ccc",
				"ctc",
				"ccc",
				'c', ModItems.timetravelerCluster,
				't', ModArmor.timetravelerChestplate);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timelordLeggings),
				"ccc",
				"ctc",
				"ccc",
				'c', ModItems.timetravelerCluster,
				't', ModArmor.timetravelerLeggings);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timelordBoots),
				"ccc",
				"ctc",
				"ccc",
				'c', ModItems.timetravelerCluster,
				't', ModArmor.timetravelerBoots);
		
		//Tardis
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.tardisHelmet),
				"lll",
				"lul",
				"lll",
				'l', ModItems.unstableTimeEnergy,
				'u', ModArmor.timelordHelmet);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.tardisChestplate),
				"uuu",
				"ulu",
				"uuu",
				'u', ModItems.unstableTimeEnergy,
				'l', ModArmor.timelordChestplate);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.tardisLeggings),
				"uuu",
				"ulu",
				"uuu",
				'u', ModItems.unstableTimeEnergy,
				'l', ModArmor.timelordLeggings);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.tardisBoots),
				"uuu",
				"ulu",
				"uuu",
				'u', ModItems.unstableTimeEnergy,
				'l', ModArmor.timelordBoots);
		
		//Materials for Armor
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.timetravelerCluster), 
				new ItemStack(ModItems.timetravelerReminisce),
				new ItemStack(ModItems.timetravelerReminisce),
				new ItemStack(ModItems.timetravelerReminisce));

		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.unstableTimeEnergy), 
				new ItemStack(ModItems.stabalizedTimeEnergy),
				new ItemStack(ModItems.stabalizedTimeEnergy),
				new ItemStack(ModItems.stabalizedTimeEnergy));
	}
}
