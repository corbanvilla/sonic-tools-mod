package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.ItemAxe;

import net.minecraft.item.Item.ToolMaterial;
public class SonicAxe extends ItemAxe{

	public SonicAxe(ToolMaterial material) {
		super(material);
		this.func_77655_b("sonicAxe");
		this.func_77637_a(ModItems.tabSonicToolsMod);
	}

	
	
}
