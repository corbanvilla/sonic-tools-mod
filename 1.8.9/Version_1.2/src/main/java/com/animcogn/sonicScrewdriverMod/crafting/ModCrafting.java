package com.animcogn.sonicScrewdriverMod.crafting;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {
	public static void initCrafting() {
		
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicScrewdriver),
			"pes",
			"dod",
			"hta",
			'p', ModItems.sonicPickaxe,
			'e', Items.emerald,
			's', ModItems.sonicSword,
			'd', Items.diamond,
			'o', Blocks.obsidian,
			'h', ModItems.sonicShovel,
			'a', ModItems.sonicAxe,
			't', ModItems.timelordFragment);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicSword),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.emerald,
			'd', Items.diamond,
			's', Items.diamond_sword);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicShovel),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.emerald,
			'd', Items.diamond,
			's', Items.diamond_shovel);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicPickaxe),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.emerald,
			'd', Items.diamond,
			's', Items.diamond_pickaxe);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicAxe),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.emerald,
			'd', Items.diamond,
			's', Items.diamond_axe);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerHelmet), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.diamond_helmet);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerChestplate), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.diamond_chestplate);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerLeggings), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.diamond_leggings);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerBoots), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.diamond_boots);
	}
}
