package com.animcogn.sonicScrewdriverMod.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {

	public static Item sonicScrewdriver;
	public static Item sonicPickaxe;
	public static Item sonicShovel;
	public static Item sonicAxe;
	public static Item sonicSword;

	public static void createTools() {
		//Tool Materials
		ToolMaterial Pickaxe = EnumHelper.addToolMaterial("Pickaxe", 4, 3000, 10.0F, 6.0F, 30);
		ToolMaterial Shovel = EnumHelper.addToolMaterial("Shovel", 4, 3000, 10.0F, 6.0F, 30);
		ToolMaterial Axe = EnumHelper.addToolMaterial("Axe", 4, 3000, 7.5F, 10.0F, 30);
		ToolMaterial Sword = EnumHelper.addToolMaterial("Sword", 4, 3000, 2.0F, 10.0F, 30);
		ToolMaterial SonicScrewdriver = EnumHelper.addToolMaterial("SonicScrewdriver", 30, 10000, 30.0F, 40.0F, 100);

		//Sonic Tools
		sonicScrewdriver = new SonicScrewdriver(SonicScrewdriver);
		GameRegistry.registerItem(sonicScrewdriver, "sonicScrewdriver");

		sonicPickaxe = new SonicPickaxe(Pickaxe);
		GameRegistry.registerItem(sonicPickaxe, "sonicPic");

		sonicShovel = new SonicShovel(Shovel);
		GameRegistry.registerItem(sonicShovel, "sonicShovel");

		sonicSword = new SonicSword(Sword);
		GameRegistry.registerItem(sonicSword, "sonicSword"); 

		sonicAxe = new SonicAxe(Axe);
		GameRegistry.registerItem(sonicAxe, "sonicAxe");
	}
}
