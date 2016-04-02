package com.animcogn.sonicScrewdriverMod.crafting;

import com.animcogn.sonicScrewdriverMod.armor.ModArmor;
import com.animcogn.sonicScrewdriverMod.items.ModItems;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {
	public static void initCrafting() {

		//Sonic Tools		
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicScrewdriver),
				"pes",
				"dod",
				"hta",
				'p', ModTools.sonicPickaxe,
				'e', Items.field_151166_bC,
				's', ModTools.sonicSword,
				'd', Items.field_151045_i,
				'o', Blocks.field_150343_Z,
				'h', ModTools.sonicShovel,
				'a', ModTools.sonicAxe,
				't', ModItems.timelordFragment);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicSword),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.field_151166_bC,
				'd', Items.field_151045_i,
				's', Items.field_151048_u);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicShovel),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.field_151166_bC,
				'd', Items.field_151045_i,
				's', Items.field_151047_v);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicPickaxe),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.field_151166_bC,
				'd', Items.field_151045_i,
				's', Items.field_151046_w);
		GameRegistry.addRecipe(
				new ItemStack(ModTools.sonicAxe),
				"oeo",
				"dsd",
				"ddd",
				'o', ModItems.timelordFragment,
				'e', Items.field_151166_bC,
				'd', Items.field_151045_i,
				's', Items.field_151056_x);

		//Time Traveler Gear
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerHelmet), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.field_151161_ac);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerChestplate), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.field_151163_ad);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerLeggings), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.field_151173_ae);
		GameRegistry.addRecipe(
				new ItemStack(ModArmor.timetravelerBoots), 
				"ttt",
				"tdt",
				"ttt",
				't', ModItems.timetravelerReminisce,
				'd', Items.field_151175_af);

		//Materials
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
