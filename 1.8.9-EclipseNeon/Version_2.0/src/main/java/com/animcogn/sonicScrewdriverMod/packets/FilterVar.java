package com.animcogn.sonicScrewdriverMod.packets;

import com.animcogn.sonicScrewdriverMod.AOE.GetEntityPlayer;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class FilterVar implements IMessage {
	
	EntityPlayer Player = GetEntityPlayer.ThePlayer;

	String text = "";
	
	public FilterVar() { }

	@Override
	public void fromBytes(ByteBuf buf) {
		text = ByteBufUtils.readUTF8String(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeUTF8String(buf, text);
	}
}
