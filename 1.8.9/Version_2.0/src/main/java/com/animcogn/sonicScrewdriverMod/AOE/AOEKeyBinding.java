package com.animcogn.sonicScrewdriverMod.AOE;

import com.animcogn.sonicScrewdriverMod.ClientProxy;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AOEKeyBinding {
	
	public static int aoemode = 1;
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	
	public void activate (KeyInputEvent event) {
		
		KeyBinding[] keyBindings = ClientProxy.keyBindings;
		
		if (keyBindings[0].isPressed()) {
			
			if (aoemode < 9) {
				aoemode = aoemode + 2;
			}
			else {
				aoemode = 1;
			}
			
			//Message or something?
			System.out.println(aoemode);
			
		}
		
	}

}
