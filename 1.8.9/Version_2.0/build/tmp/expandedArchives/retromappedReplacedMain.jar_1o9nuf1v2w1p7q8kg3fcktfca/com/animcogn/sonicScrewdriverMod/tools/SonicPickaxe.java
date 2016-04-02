package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.item.ItemPickaxe;

import net.minecraft.item.Item.ToolMaterial;
public class SonicPickaxe extends ItemPickaxe{

	public SonicPickaxe(ToolMaterial material) {
		super(material);
		this.func_77655_b("sonicPic");
		this.func_77637_a(ModItems.tabSonicToolsMod);
	}

	
	
}
