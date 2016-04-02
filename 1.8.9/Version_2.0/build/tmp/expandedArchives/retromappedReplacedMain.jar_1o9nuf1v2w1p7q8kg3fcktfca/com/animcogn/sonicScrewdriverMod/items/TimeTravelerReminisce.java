package com.animcogn.sonicScrewdriverMod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TimeTravelerReminisce extends Item {
	
	public TimeTravelerReminisce() {
		super();
		this.func_77655_b("timetravelerReminisce");
		this.func_77637_a(ModItems.tabSonicToolsMod);
	}

	@Override
	public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("\u00A75" + "Mysterious reminince of past ");
	par3List.add("\u00A75" + "and future time travelers ");
	par3List.add("\u00A75" + "found throughout all time and space");
	}
	
	//Are you sticking your nose where it doesn't belong? HMMMMMM
}
