package com.animcogn.sonicScrewdriverMod.AOE;

import com.animcogn.sonicScrewdriverMod.tools.ModTools;

import net.minecraft.util.BlockPos;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AEODig {
	
	@SubscribeEvent
	public void onDig (BreakEvent event) {
		try {
		if (event.getPlayer().getHeldItem().getItem() == ModTools.sonicScrewdriver
			|| event.getPlayer().getHeldItem().getItem() == ModTools.sonicPickaxe
			|| event.getPlayer().getHeldItem().getItem() == ModTools.sonicShovel
			|| event.getPlayer().getHeldItem().getItem() == ModTools.sonicAxe) {
			
			System.out.println("Correct Break");
			
			int x = event.pos.getX();
			int y = event.pos.getY();
			int z = event.pos.getZ();
			
			float pitch = event.getPlayer().prevRotationPitch;
			float yaw = event.getPlayer().prevRotationYaw;
			
			if (pitch > 49) {
				System.out.println("Break Ground");
				//Ground - 50 and higher
				horizontalBreak(event, x, y, z);
				
			} else if (pitch < 50 && pitch > -45) {
				System.out.println("Vertical break");
				
				if (yaw > 315 || yaw < 45) {
					System.out.println("South Break!");
				}
				else if (yaw < 135) {
					System.out.println("West Break!");
				}
				else if (yaw < 225) {
					System.out.println("North Break!");
				}
				else if (yaw < 315) {
					System.out.println("East Break!");
				}
				else {
					System.out.println("A yaw error has occered! Yaw: " + yaw);
					System.out.println("If you have not modified the function of this "
							+ "mod, please report a bug on our github and steps to "
							+ "recreate (if possible so we can fix it!) along with this error report! Thanks :)");
				}
				
				
			} else if (pitch < -45) {
				System.out.println("Ceiling Break");
				//Ceiling - -45 and higher
				
				
			} else {
				System.out.println("A pitch error has occered! Pitch: " + pitch);
				System.out.println("If you have not modified the function of this "
						+ "mod, please report a bug on our github and steps to "
						+ "recreate (if possible so we can fix it!) along with this error report! Thanks :)");
			}
			System.out.println(event.getPlayer().prevRotationYaw);
		}	
		}
		
		catch (NullPointerException e) {
			return;
		}

	}

	private void horizontalBreak(BreakEvent event, int x, int y, int z) {
		System.out.println("Starting Method!");
		int mode = AOEKeyBinding.aoemode;
		double half = mode / 2;
		double difference = Math.rint(half);
		System.out.println("Differnce Calculated! It is: " + difference);
		int bottomLeftX = (int) (x - difference);
		int bottomLeftZ = (int) (z - difference);
		
		int topRightX = (int) (x + difference);
		int topRightZ = (int) (z + difference);
		
		System.out.println("bottom left: " + bottomLeftX + bottomLeftZ);
		System.out.println("top right: " + topRightX + topRightZ);
		
		while (bottomLeftX < topRightX) {
			event.world.setBlockToAir(new BlockPos(bottomLeftX, y, bottomLeftZ));
			bottomLeftX++;
			System.out.println(bottomLeftX);
			
			while (bottomLeftZ < topRightZ) {
				event.world.setBlockToAir(new BlockPos(bottomLeftX, y, bottomLeftZ));
				bottomLeftZ++;
				System.out.println(bottomLeftZ);
				
			}
		}
		System.out.println("Opperation Complete!");
	}
	
}
