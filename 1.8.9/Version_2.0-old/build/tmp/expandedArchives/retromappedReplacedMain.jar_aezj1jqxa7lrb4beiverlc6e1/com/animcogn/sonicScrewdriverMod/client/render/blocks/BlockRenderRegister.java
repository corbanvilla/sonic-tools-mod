package com.animcogn.sonicScrewdriverMod.client.render.blocks;

import com.animcogn.sonicScrewdriverMod.Main;
import com.animcogn.sonicScrewdriverMod.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

	public static void preInit() {
	}
	
	public static void registerBlockRenderer() {
		reg(ModBlocks.timeTravelerBlock);																																																						//		reg(ModBlocks.pegh);
	}
	
	public static String modid = Main.MODID;
	
	public static void reg(Block block) {
		Minecraft.func_71410_x().func_175599_af().func_175037_a().func_178086_a(Item.func_150898_a(block), 
			0, new ModelResourceLocation(modid + ":" + block.func_149739_a().substring(5), "inventory"));
	}
}
