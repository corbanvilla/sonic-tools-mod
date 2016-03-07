package com.animcogn.sonicScrewdriverMod.client.render.items;

import com.animcogn.sonicScrewdriverMod.Main;
import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ItemRenderRegister {

	public static String modid = Main.MODID;
	
	public static void preInit() {
	}
	
	public static void registerItemRenderer() {
	reg(ModItems.sonicAxe);
	reg(ModItems.sonicPickaxe);
	reg(ModItems.sonicScrewdriver);
	reg(ModItems.sonicShovel);
	reg(ModItems.sonicSword);
	reg(ModItems.timelordFragment);
	reg(ModItems.timetravelerBoots);
	reg(ModItems.timetravelerChestplate);
	reg(ModItems.timetravelerHelmet);
	reg(ModItems.timetravelerLeggings);
	reg(ModItems.timetravelerReminisce);
	reg(ModItems.timetravelerCluster);	
	}

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
