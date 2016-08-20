package com.animcogn.sonicScrewdriverMod.crafting;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorSmelting {

	public static void initArmorSmelting() {
		GameRegistry.addSmelting(
				new ItemStack(ModItems.timetravelerCluster), 
				new ItemStack(ModItems.stabalizedTimeEnergy), 5.0F);
	}
}
