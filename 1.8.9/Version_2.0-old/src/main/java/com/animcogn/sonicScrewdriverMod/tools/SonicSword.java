package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class SonicSword extends ItemSword{

	public SonicSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("sonicSword");
		this.setCreativeTab(ModItems.tabSonicToolsMod);
	}

	
	
}
