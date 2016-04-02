package com.animcogn.sonicScrewdriverMod.events;

import com.animcogn.sonicScrewdriverMod.tools.ModTools;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnRightClick {

	@SubscribeEvent
	public void onRightClick(PlayerInteractEvent event) {
			
		try {
			if (event.entityPlayer.func_70694_bm().func_77973_b() == ModTools.sonicScrewdriver && event.action == Action.RIGHT_CLICK_AIR) {
				event.entityPlayer.func_85030_a("sonic-tools-mod:sonicEffect", 1.0F, 1.0F);
//				System.out.println("let the geekyness comence"); //Just a friendly debug statement
		}
	} catch (NullPointerException e) {
//		System.out.println("the show must go wrong"); //Another great debug statement that i'm way to lazy to take out. 
//		However, i'm not lazy enough to delete this temp code :) Enable me to see what's your problem :)
		return;
		}
	}
}
