package com.animcogn.sonicScrewdriverMod.events;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnRightClick {

	@SubscribeEvent
	public void onRightClick(PlayerInteractEvent event) {
		
		if (!(event.entityPlayer.getHeldItemMainhand() == null || event.entityPlayer.getHeldItemOffhand() == null))	{
			if (event.entityPlayer.getHeldItemMainhand().getItem() == ModItems.sonicScrewdriver 
					|| event.entityPlayer.getHeldItemOffhand().getItem() == ModItems.sonicScrewdriver 
					&& event.action == Action.RIGHT_CLICK_AIR) {
				event.entityPlayer.playSound("rain", 1.0F, 1.0F);
//				System.out.println("let the geekyness comence"); //Just a friendly debug statement
//				System.out.println("the show must go wrong"); //Another great debug statement that i'm way to lazy to take out. 
//				However, i'm not lazy enough to delete this temp code :) Enable me to see what's your problem :)	
			}
		}	
	}
}
