package com.animcogn.sonicScrewdriverMod.events;



import java.util.concurrent.TimeUnit;

import com.animcogn.sonicScrewdriverMod.events.CountDown.DisplayCountdown;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class AttackCountdown {
	
	public static boolean healthy;

	@SubscribeEvent
	public boolean attackCountdown(LivingAttackEvent event) {
		if(event.entity instanceof EntityPlayer && !event.entity.field_70170_p.field_72995_K) {	
//			System.out.println("player is sick :("); //MO DEBUG JUNK STUFF
			CountDown.startTimer();
			
		}		
		return false;
	}
}
