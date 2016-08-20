package com.animcogn.sonicScrewdriverMod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UnstableTimeEnergy extends Item {

	public UnstableTimeEnergy() {
		super();
		this.func_77655_b("unstableTimeEnergy");
		this.func_77637_a(ModItems.tabSonicToolsMod);
	}
	
	@Override
	public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
	par3List.add("\u00A75" + "Unless you wear a timelords set ");
	par3List.add("\u00A75" + "of armor, it may be impossible to ");
	par3List.add("\u00A75" + "carry this incredibly heavy and ");
	par3List.add("\u00A75" + "powerful unstable object. You have");
	par3List.add("\u00A75" + "been warned!");
	}
}
