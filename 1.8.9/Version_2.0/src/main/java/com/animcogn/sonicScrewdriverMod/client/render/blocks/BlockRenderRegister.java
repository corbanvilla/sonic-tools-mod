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
		reg(ModBlocks.timeTravelerBlock);	
		reg(ModBlocks.pegh);
	}
	
	public static String modid = Main.MODID;
	
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 
			0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
