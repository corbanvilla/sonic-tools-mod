package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.ItemAxe;

public class SonicAxe extends ItemAxe{

	public SonicAxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("sonicAxe");
		this.setCreativeTab(ModItems.tabSonicToolsMod);
	}

	
	
}
