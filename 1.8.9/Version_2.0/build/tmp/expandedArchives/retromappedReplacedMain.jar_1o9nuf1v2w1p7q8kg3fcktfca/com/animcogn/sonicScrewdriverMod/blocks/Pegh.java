package com.animcogn.sonicScrewdriverMod.blocks;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Pegh extends Block {
		
		public Pegh () {
			super(Material.field_151573_f);
			this.func_149663_c("pegh");
			this.func_149722_s();
			this.func_149715_a(1.0F);
			this.func_149647_a(ModItems.tabSonicToolsMod);
		}
}
