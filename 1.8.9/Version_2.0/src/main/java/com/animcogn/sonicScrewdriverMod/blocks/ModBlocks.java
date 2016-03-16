package com.animcogn.sonicScrewdriverMod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block timeTravelerBlock;																																																																																																																																																																																																																																																																																													
	public static Block pegh;
	
	public static void createBlocks() {
	
		//Blocks																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					pegh = new Pegh(); //Haha, lol. Whoopsies :P  Then put below it: 	GameRegistry.registerBlock(pegh, "pegh");
	
	timeTravelerBlock = new TimeTravelerBlock();
	GameRegistry.registerBlock(timeTravelerBlock, "timeTravelerBlock");
	
	
	}
}
