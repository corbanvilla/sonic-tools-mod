package com.animcogn.sonicScrewdriverMod;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobsDropTimelordFragments {

	private int chance;
	
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event) {
		if (event.entity instanceof EntityPlayer) {
			return;
		}
		
		Random random = new Random();
		
		chance = random.nextInt(25);
		
		if (chance == 10) {
			if (!event.entity.worldObj.isRemote) {
				event.entity.dropItem(Main.timelordFragment, chance);
			}
		}
	}
}
