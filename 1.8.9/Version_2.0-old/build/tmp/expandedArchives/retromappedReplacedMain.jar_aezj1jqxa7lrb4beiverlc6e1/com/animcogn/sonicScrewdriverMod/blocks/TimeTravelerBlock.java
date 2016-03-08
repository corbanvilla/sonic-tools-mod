package com.animcogn.sonicScrewdriverMod.blocks;

import java.util.Random;

import com.animcogn.sonicScrewdriverMod.Main;
import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TimeTravelerBlock extends Block {
	
	private Item drop = ModItems.timetravelerReminisce;
	private int least_quantity = 1;
	private int most_quantity = 3;
	
	
	public TimeTravelerBlock() {
		super(Material.field_151573_f);
		this.func_149663_c("timeTravelerBlock");
		this.func_149647_a(ModItems.tabSonicToolsMod);
		this.func_149752_b(7.5F);
		this.func_149711_c(10.F);
		this.func_149715_a(1.0F);
		this.setHarvestLevel("pickaxe", 4);
	}
	
	@Override
	public boolean func_180639_a (World worldIn, BlockPos pos, IBlockState stat, 
								EntityPlayer player, EnumFacing side, float hitX, 
								float hitY, float hitZ) {
		if (!worldIn.field_72995_K) {
			return false;
		}
		
		player.func_145747_a(new ChatComponentText( 
						EnumChatFormatting.DARK_BLUE +
							"You feel a rush of memories, unfamiliar to you, go through your mind and enter your body..."));
		return true;
		
	}
	
	@Override
	public Item func_180660_a(IBlockState blockstate, Random random, int fortune) {
	    return this.drop;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}

}
