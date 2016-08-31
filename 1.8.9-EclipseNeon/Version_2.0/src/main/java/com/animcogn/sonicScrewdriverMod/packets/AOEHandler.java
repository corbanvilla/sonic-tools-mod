package com.animcogn.sonicScrewdriverMod.packets;

import java.util.HashMap;

import com.animcogn.sonicScrewdriverMod.AOE.GetEntityPlayer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IThreadListener;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class AOEHandler implements IMessageHandler<AOEVar, IMessage>{

	public static HashMap aoeModeList = new HashMap();
	public static String content;
	protected MessageContext msgcontent;

	@Override
	public IMessage onMessage(AOEVar message, MessageContext ctx) {
		IThreadListener mainThread = (WorldServer) ctx.getServerHandler().playerEntity.worldObj;

		content = ctx.getServerHandler().playerEntity.getDisplayNameString();
		msgcontent = ctx;

		mainThread.addScheduledTask(new Runnable() {

			EntityPlayer Player = GetEntityPlayer.ThePlayer;

			@Override
			public void run() {
				
				if (!(aoeModeList.containsKey(content))) {
					aoeModeList.put(content, 1);
				}

				int aoeMode = (Integer) aoeModeList.get(content);
				
				if (aoeMode < 9) {
					aoeModeList.put(content, (aoeMode + 2));
				}
				else {
					aoeModeList.put(content, 1);
				}

				msgcontent.getServerHandler().playerEntity.addChatMessage(new ChatComponentText( 
						EnumChatFormatting.AQUA + "AOE Mode Set to: " + aoeModeList.get(content) + "x" + aoeModeList.get(content)));
			}
		});
		return null;
	}
}

