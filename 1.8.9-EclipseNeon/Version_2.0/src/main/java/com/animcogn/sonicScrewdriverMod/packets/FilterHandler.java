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

public class FilterHandler implements IMessageHandler<FilterVar, IMessage>{

	public static HashMap aoeFilterList = new HashMap();
	public static String content;
	protected MessageContext msgcontent;

	@Override
	public IMessage onMessage(FilterVar message, MessageContext ctx) {
		IThreadListener mainThread = (WorldServer) ctx.getServerHandler().playerEntity.worldObj;

		content = ctx.getServerHandler().playerEntity.getDisplayNameString();
		msgcontent = ctx;

		mainThread.addScheduledTask(new Runnable() {

			@Override
			public void run() {

				if (!(aoeFilterList.containsKey(content))) {
					aoeFilterList.put(content, 0);
				}
				
				int filtermode = (Integer) aoeFilterList.get(content);
				
				if (filtermode < 3) {
					aoeFilterList.put(content, (filtermode + 1));
				}
				else {
					aoeFilterList.put(content, 0);
				}

				if ((Integer) aoeFilterList.get(content) == 0) {
					msgcontent.getServerHandler().playerEntity.addChatMessage(new ChatComponentText( 
							EnumChatFormatting.GOLD + "Filter Mode Set To: ALL"));
				}
				else if ((Integer) aoeFilterList.get(content) == 1) {
					msgcontent.getServerHandler().playerEntity.addChatMessage(new ChatComponentText( 
							EnumChatFormatting.GOLD + "Filter Mode Set To: No Stone/Cobble"));
				}
				else if ((Integer) aoeFilterList.get(content) == 2) {
					msgcontent.getServerHandler().playerEntity.addChatMessage(new ChatComponentText( 
							EnumChatFormatting.GOLD + "Filter Mode Set To: No Dirt/Stone/Gravel/Cobble"));
				}
				else if ((Integer) aoeFilterList.get(content) == 3) {
					msgcontent.getServerHandler().playerEntity.addChatMessage(new ChatComponentText( 
							EnumChatFormatting.GOLD + "Filter Mode Set To: Nothing"));
				}
			}
		});
		return null;
	}
}
