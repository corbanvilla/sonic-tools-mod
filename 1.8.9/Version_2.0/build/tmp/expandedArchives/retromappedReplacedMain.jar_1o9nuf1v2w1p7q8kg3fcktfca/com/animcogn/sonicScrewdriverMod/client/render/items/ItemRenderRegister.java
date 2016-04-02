package com.animcogn.sonicScrewdriverMod.client.render.items;

import com.animcogn.sonicScrewdriverMod.Main;
import com.animcogn.sonicScrewdriverMod.armor.ModArmor;
import com.animcogn.sonicScrewdriverMod.items.ModItems;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static String modid = Main.MODID;
	
	public static void preInit() {
	}
	
	public static void registerItemRenderer() {
	//Tools	
	reg(ModTools.sonicAxe);
	reg(ModTools.sonicPickaxe);
	reg(ModTools.sonicScrewdriver);
	reg(ModTools.sonicShovel);
	reg(ModTools.sonicSword);
	//Materials
	reg(ModItems.timelordFragment);
	reg(ModItems.timetravelerReminisce);
	reg(ModItems.timetravelerCluster);	
	//Armor
	reg(ModArmor.timetravelerBoots);
	reg(ModArmor.timetravelerChestplate);
	reg(ModArmor.timetravelerHelmet);
	reg(ModArmor.timetravelerLeggings);
	
	reg(ModArmor.timelordBoots);
	reg(ModArmor.timelordChestplate);
	reg(ModArmor.timelordHelmet);
	reg(ModArmor.timelordLeggings);
	
	reg(ModArmor.tardisBoots);
	reg(ModArmor.tardisChestplate);
	reg(ModArmor.tardisHelmet);
	reg(ModArmor.tardisLeggings);

	}

	public static void reg(Item item) {
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(item, 0, new ModelResourceLocation(modid + ":" + item.func_77658_a().substring(5), "inventory"));
	}
}
