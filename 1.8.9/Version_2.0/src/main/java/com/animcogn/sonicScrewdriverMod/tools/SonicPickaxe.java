package com.animcogn.sonicScrewdriverMod.tools;

import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SonicPickaxe extends ItemPickaxe{
	
	EntityPlayer player;

	public SonicPickaxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("sonicPic");
		this.setCreativeTab(ModItems.tabSonicToolsMod);
	}

}
