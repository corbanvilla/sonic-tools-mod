package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class SonicShovel extends ItemSpade{

	public SonicShovel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("sonicShovel");
		this.setCreativeTab(ModItems.tabSonicToolsMod);
	}

	
	
}