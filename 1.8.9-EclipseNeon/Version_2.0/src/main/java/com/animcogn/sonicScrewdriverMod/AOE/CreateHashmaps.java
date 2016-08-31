package com.animcogn.sonicScrewdriverMod.AOE;

import com.animcogn.sonicScrewdriverMod.packets.AOEHandler;
import com.animcogn.sonicScrewdriverMod.packets.FilterHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CreateHashmaps {
	
	private EntityPlayer player;
	
	@SubscribeEvent
	public void createHashs(EntityJoinWorldEvent event) {
		if (event.entity instanceof EntityPlayer) {
			player = (EntityPlayer) event.entity;
			if (!(AOEHandler.aoeModeList.containsKey(player.getDisplayNameString()))) {
				AOEHandler.aoeModeList.put(player.getDisplayName(), 1);
			}
			if (!(FilterHandler.aoeFilterList.containsKey(player.getDisplayNameString()))) {
				FilterHandler.aoeFilterList.put(player.getDisplayName(), 0);
			}
		}
	}

}
