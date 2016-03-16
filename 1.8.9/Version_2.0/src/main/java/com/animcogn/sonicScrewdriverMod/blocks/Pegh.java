package com.animcogn.sonicScrewdriverMod.blocks;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Pegh extends Block {
		
		public Pegh () {
			super(Material.iron);
			this.setUnlocalizedName("pegh");
			this.setBlockUnbreakable();
			this.setLightLevel(1.0F);
			this.setCreativeTab(ModItems.tabSonicToolsMod);
		}
}
