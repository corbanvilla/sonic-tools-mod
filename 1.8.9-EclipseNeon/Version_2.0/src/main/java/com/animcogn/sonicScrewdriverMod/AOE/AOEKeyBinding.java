package com.animcogn.sonicScrewdriverMod.AOE;

import com.animcogn.sonicScrewdriverMod.ClientProxy;
import com.animcogn.sonicScrewdriverMod.packets.AOEVar;
import com.animcogn.sonicScrewdriverMod.packets.FilterVar;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AOEKeyBinding {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)

	public void activate (KeyInputEvent event) {

		KeyBinding[] keyBindings = ClientProxy.keyBindings;
		EntityPlayer Player = GetEntityPlayer.ThePlayer;

		if (keyBindings[0].isPressed()) {
			ClientProxy.network.sendToServer(new AOEVar());
		}

		if (keyBindings[1].isPressed()) {
			ClientProxy.network.sendToServer(new FilterVar());
		}
	}
}
