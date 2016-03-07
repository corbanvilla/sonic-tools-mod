package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.ItemPickaxe;

public class SonicPickaxe extends ItemPickaxe{

	public SonicPickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("sonicPic");
		this.setCreativeTab(ModItems.tabSonicToolsMod);
	}

	
	
}
