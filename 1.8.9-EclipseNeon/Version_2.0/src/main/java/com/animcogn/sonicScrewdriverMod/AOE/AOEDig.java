package com.animcogn.sonicScrewdriverMod.AOE;

import java.util.ArrayList;
import java.util.List;

import com.animcogn.sonicScrewdriverMod.packets.AOEHandler;
import com.animcogn.sonicScrewdriverMod.packets.FilterHandler;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AOEDig {

	static List<Integer> bottomLeftH = new ArrayList();
	static List<Integer> topRightH = new ArrayList();

	static List<Integer> bottomLeftX = new ArrayList();
	static List<Integer> topRightX = new ArrayList();

	static List<Integer> bottomLeftZ = new ArrayList();
	static List<Integer> topRightZ = new ArrayList();	

	static List<Integer> centerBlock = new ArrayList();

	@SubscribeEvent
	public void onDig (BreakEvent event) {

		try {
			if (event.getPlayer().getHeldItem().getItem() == ModTools.sonicScrewdriver
					|| event.getPlayer().getHeldItem().getItem() == ModTools.sonicPickaxe
					|| event.getPlayer().getHeldItem().getItem() == ModTools.sonicShovel
					|| event.getPlayer().getHeldItem().getItem() == ModTools.sonicAxe) {

				centerBlock.clear();
				centerBlock.add(event.pos.getX());
				centerBlock.add(event.pos.getY());
				centerBlock.add(event.pos.getZ());

				float pitch = event.getPlayer().rotationPitch;
				float yaw = event.getPlayer().rotationYaw;


				if (pitch > 49) { //Ground Break
					horizontalBreak(event, centerBlock.get(0), centerBlock.get(1), centerBlock.get(2));


				} else if (pitch < 50 && pitch > -45) { //Vertical Break
					int direction = MathHelper.floor_double((double)(event.getPlayer().rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

					if (direction == 0 || direction == 2) { //X Axis and North/South
						verticalBreakX(event, centerBlock.get(0), centerBlock.get(1), centerBlock.get(2));

					} 
					else if (direction == 1 || direction == 3) { //Z Axis and East/West
						verticalBreakZ(event, centerBlock.get(0), centerBlock.get(1), centerBlock.get(2));

					}
				} else if (pitch < -45) { //Ceiling Break
					horizontalBreak(event, centerBlock.get(0), centerBlock.get(1), centerBlock.get(2));

				} else {
					System.out.println("A pitch error has occered! Pitch: " + pitch);
					System.out.println("If you have not modified the function of this "
							+ "mod, please report a bug on our github and steps to "
							+ "recreate (if possible so we can fix it!) along with this error report! Thanks :)");
				}
			}	
		}

		catch (NullPointerException e) {
			return;
		}

	}

	private void horizontalBreak(BreakEvent event, int x, int y, int z) {

		int mode = (Integer) AOEHandler.aoeModeList.get(event.getPlayer().getDisplayNameString());
		double half = mode / 2;
		double difference = Math.rint(half);

		mathBottomLeft(event, bottomLeftH, x, z);
		mathTopRight(event, topRightH, x, z);

		for (int xPos = bottomLeftH.get(0); xPos <= topRightH.get(0); xPos++) {
			for (int zPos = bottomLeftH.get(1); zPos <= topRightH.get(1); zPos++) {
				breakBlocks(event, xPos, y, zPos);
			}
		}
	}

	private void verticalBreakX (BreakEvent event, int x, int y, int z) {

		int mode = (Integer) AOEHandler.aoeModeList.get(event.getPlayer().getDisplayNameString());
		double half = mode / 2;
		double difference = Math.rint(half);

		mathBottomLeft(event, bottomLeftX, x, y);
		mathTopRight(event, topRightX, x, y);

		for (int xPos = bottomLeftX.get(0); xPos <= topRightX.get(0); xPos++) {
			for (int yPos = bottomLeftX.get(1); yPos <= topRightX.get(1); yPos++) {
				breakBlocks(event, xPos, yPos, z);
			}
		}		
	}

	private void verticalBreakZ (BreakEvent event, int x, int y, int z) {

		int mode = (Integer) AOEHandler.aoeModeList.get(event.getPlayer().getDisplayNameString());
		double half = mode / 2;
		double difference = Math.rint(half);

		mathBottomLeft(event, bottomLeftZ, z, y);
		mathTopRight(event, topRightZ, z, y);	

		for (int zPos = bottomLeftZ.get(0); zPos <= topRightZ.get(0); zPos++) {
			for (int yPos = bottomLeftZ.get(1); yPos <= topRightZ.get(1); yPos++) {
				breakBlocks(event, x, yPos, zPos);
			}
		}	
	}

	private void mathTopRight (BreakEvent event, List<Integer> list, int a, int b) {
		
		int mode = (Integer) AOEHandler.aoeModeList.get(event.getPlayer().getDisplayNameString());
		double half = mode / 2;
		double difference = Math.rint(half);

		list.clear();
		list.add((int) (a + difference));
		list.add((int) (b + difference));
	}

	private void mathBottomLeft (BreakEvent event, List<Integer> list, int a, int b) {
		
		int mode = (Integer) AOEHandler.aoeModeList.get(event.getPlayer().getDisplayNameString());
		double half = mode / 2;
		double difference = Math.rint(half);

		list.clear();
		list.add((int) (a - difference));
		list.add((int) (b - difference));
	}

	private void breakBlocks (BreakEvent event, int x, int y, int z) {
		
		BlockPos pos = (new BlockPos(x, y, z));
		IBlockState block = (event.world.getBlockState(pos));
		Item drop = Item.getItemFromBlock(block.getBlock());
		int metadata = block.getBlock().getDamageValue(event.world, pos);

		if (!(block.getBlock() == Blocks.bedrock)) {
			event.world.setBlockToAir(new BlockPos(x, y, z));
			spawnItems(event, block, centerBlock.get(0), centerBlock.get(1), centerBlock.get(2), drop, metadata);
		}
	}

	private void spawnItems (BreakEvent event, IBlockState block, int x, int y, int z, Item drop, int meta) {
		
		int filtermode = (Integer) FilterHandler.aoeFilterList.get(event.getPlayer().getDisplayNameString());
		if (!event.world.isRemote) {

			if (filtermode == 0) {
				EntityItem item = new EntityItem(event.world, x, y, z, new ItemStack(drop, 1, meta));
				event.world.spawnEntityInWorld(item);
			}
			if (filtermode == 1) {
				if (!(block.getBlock() == Blocks.stone || block.getBlock() == Blocks.cobblestone)) {
					EntityItem item = new EntityItem(event.world, x, y, z, new ItemStack(drop, 1, meta));
					event.world.spawnEntityInWorld(item);
				}
			}
			if (filtermode == 2) {
				if (!(block.getBlock() == Blocks.stone || block.getBlock() == Blocks.cobblestone
						|| block.getBlock() == Blocks.dirt || block.getBlock() == Blocks.gravel)) {
					EntityItem item = new EntityItem(event.world, x, y, z, new ItemStack(drop, 1, meta));
					event.world.spawnEntityInWorld(item);
				}
			}
			if (filtermode == 3) {
				return;
			}
		}
	}
}
