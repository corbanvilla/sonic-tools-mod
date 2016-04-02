package com.animcogn.sonicScrewdriverMod.blocks;

import java.util.Random;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class TimeTravelerBlock extends Block {
	
	private Item drop = ModItems.timetravelerReminisce;
	private int least_quantity = 1;
	private int most_quantity = 3;
	
	
	public TimeTravelerBlock() {
		super(Material.iron);
		this.setUnlocalizedName("timeTravelerBlock");
		this.setCreativeTab(ModItems.tabSonicToolsMod);
		this.setResistance(7.5F);
		this.setHardness(10.F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel("pickaxe", 4);
	}
	
	@Override
	public boolean onBlockActivated (World worldIn, BlockPos pos, IBlockState state, 
			EntityPlayer player, EnumHand hand, ItemStack heldItem, 
			EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			return false;
		}
		
		player.addChatComponentMessage(new TextComponentString(TextFormatting.DARK_BLUE + 
				"You feel a rush of memories, unfamiliar to you,go through your mind and enter your body..."));
		return true;
		
	}
	
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
	    return this.drop;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}

}
