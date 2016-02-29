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
			'e', Items.field_151166_bC,
			's', ModItems.sonicSword,
			'd', Items.field_151045_i,
			'o', Blocks.field_150343_Z,
			'h', ModItems.sonicShovel,
			'a', ModItems.sonicAxe,
			't', ModItems.timelordFragment);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicSword),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.field_151166_bC,
			'd', Items.field_151045_i,
			's', Items.field_151048_u);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicShovel),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.field_151166_bC,
			'd', Items.field_151045_i,
			's', Items.field_151047_v);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicPickaxe),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.field_151166_bC,
			'd', Items.field_151045_i,
			's', Items.field_151046_w);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.sonicAxe),
			"oeo",
			"dsd",
			"ddd",
			'o', ModItems.timelordFragment,
			'e', Items.field_151166_bC,
			'd', Items.field_151045_i,
			's', Items.field_151056_x);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerHelmet), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.field_151161_ac);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerChestplate), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.field_151163_ad);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerLeggings), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.field_151173_ae);
	GameRegistry.addRecipe(
			new ItemStack(ModItems.timetravelerBoots), 
			"ttt",
			"tdt",
			"ttt",
			't', ModItems.timetravelerReminisce,
			'd', Items.field_151175_af);
	}
}
