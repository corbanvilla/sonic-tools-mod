package com.animcogn.sonicScrewdriverMod.crafting;

import com.animcogn.sonicScrewdriverMod.items.ModItems;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolCrafting {

	public static void initToolCrafting() {
		//Sonic Tools		
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicScrewdriver),
				"pes",
				"dod",
				"hta",
				'p', ModTools.sonicPickaxe,
				'e', Items.emerald,
				's', ModTools.sonicSword,
				'd', Items.diamond,
				'o', Blocks.obsidian,
				'h', ModTools.sonicShovel,
				'a', ModTools.sonicAxe,
				't', ModItems.timelordFragment);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicSword),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_sword);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicShovel),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_shovel);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicPickaxe),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_pickaxe);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicAxe),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.emerald,
				'd', Items.diamond,
				's', Items.diamond_axe);
	}
}
