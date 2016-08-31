package com.animcogn.sonicScrewdriverMod.AOE;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GetEntityPlayer {
	
	public static EntityPlayer ThePlayer;
	
	private int varStored = 0;
	
	@SubscribeEvent
	public void onJoin(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityPlayer && varStored == 0) {
			ThePlayer = (EntityPlayer) event.entity;
			varStored = 1;
		}
	}

}
