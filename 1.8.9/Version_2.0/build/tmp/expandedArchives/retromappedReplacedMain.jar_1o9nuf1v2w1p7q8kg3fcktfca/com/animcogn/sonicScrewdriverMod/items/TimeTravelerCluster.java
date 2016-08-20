package com.animcogn.sonicScrewdriverMod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TimeTravelerCluster extends Item {

	public TimeTravelerCluster() {
		super();
		this.func_77655_b("timetravelerCluster");
		this.func_77637_a(ModItems.tabSonicToolsMod);
		this.func_77625_d(4);
	}
	
	@Override
	public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
	par3List.add("\u00A75" + "More and more pieces of time clumpted ");
	par3List.add("\u00A75" + "together to make one stronger piece of ");
	par3List.add("\u00A75" + "time energy!");
	}
}
