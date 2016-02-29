package com.animcogn.sonicScrewdriverMod;

import java.util.Random;

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
	
	private Item drop = Main.timetravelerReminisce;
	private int least_quantity = 1;
	private int most_quantity = 3;
	
	
	public TimeTravelerBlock() {
		super(Material.iron);
		this.setUnlocalizedName("timeTravelerBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(7.5F);
		this.setHardness(10.F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel("pickaxe", 4);
	}
	
	@Override
	public boolean onBlockActivated (World worldIn, BlockPos pos, IBlockState stat, 
								EntityPlayer player, EnumFacing side, float hitX, 
								float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			return false;
		}
		
		player.addChatMessage(new ChatComponentText( 
						EnumChatFormatting.DARK_BLUE +
							"You feel a rush of memories, unfamiliar to you, go through your mind and enter your body..."));
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
