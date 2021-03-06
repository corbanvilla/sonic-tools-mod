package com.animcogn.sonicScrewdriverMod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
//Who thinks to check the imports for an easter egg???? NOT ME :P :P :P (If your not in eclipse, this will most likely make no sense :P 
//Just count the egg and move on :(
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TimeBlocks extends Block {
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	
	protected TimeBlocks(String unlocalizedName, Material material, Item drop, int meta, int least_quantity, int most_quantity) {
		super(material);
		this.setHarvestLevel("pickaxe", 4);
		this.func_149711_c(10.0f);
		this.func_149752_b(15.0f);
		this.func_149663_c(unlocalizedName);
		this.func_149647_a(CreativeTabs.field_78030_b);
	}
	
	protected TimeBlocks(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
	    this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected TimeBlocks(String unlocalizedName, Material mat, Item drop) {
	    this(unlocalizedName, mat, drop, 1, 1);
	}
	
	@Override
	public Item func_180660_a(IBlockState blockstate, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int func_180651_a(IBlockState blockstate) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
	
}
