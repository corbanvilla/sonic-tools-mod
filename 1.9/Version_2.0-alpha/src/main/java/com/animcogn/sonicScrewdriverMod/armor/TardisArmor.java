package com.animcogn.sonicScrewdriverMod.armor;

import com.animcogn.sonicScrewdriverMod.events.AttackCountdown;
import com.animcogn.sonicScrewdriverMod.events.CountDown;
import com.animcogn.sonicScrewdriverMod.events.CountDown.DisplayInterval;
import com.animcogn.sonicScrewdriverMod.items.ModItems;

import akka.japi.Effect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.world.World;
import net.minecraftforge.event.brewing.PotionBrewEvent;

public class TardisArmor extends ItemArmor {
	
	public TardisArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
		 super(material, renderIndex, armorType);
		 this.setUnlocalizedName(unlocalizedName);
		 this.setCreativeTab(ModItems.tabSonicToolsMod);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if (itemStack.getItem() == ModItems.tardisHelmet) {
			effectPlayer(player, MobEffects.nightVision, 2);
			effectPlayer(player, MobEffects.resistance, 0);
		}
		
		if (itemStack.getItem() == ModItems.tardisChestplate) {
			absorbtion(player);
			effectPlayer(player, MobEffects.damageBoost, 1);
				
		}
		
		if (itemStack.getItem() == ModItems.tardisLeggings) {
			effectPlayer(player, MobEffects.moveSpeed, 2);
			effectPlayer(player, MobEffects.digSpeed, 2);
		}
		
		if (itemStack.getItem() == ModItems.tardisBoots) {
	        effectPlayer(player, MobEffects.jump, 2);
	        effectPlayer(player, MobEffects.fireResistance, 1);
	    }
		
	    if (this.isWearingFullSet(player, ModItems.tardisHelmet, ModItems.tardisChestplate, 
	    		ModItems.tardisLeggings, ModItems.tardisBoots)) {
			this.effectPlayer(player, MobEffects.regeneration, 1);
			this.effectPlayer(player, MobEffects.saturation, 1);
			this.effectPlayer(player, MobEffects.waterBreathing, 1);
	    }
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion, 400, amplifier, true, true));
	}
	
	private void absorbtion(EntityPlayer player) {
		float health;
		float absorbtion;
		health = player.getHealth();
		absorbtion = player.getAbsorptionAmount();
		
			if (health == 20.0F && DisplayInterval.absorbtionInterval == false && AttackCountdown.healthy == true) {
				if (absorbtion == 0.0F) {
					player.setAbsorptionAmount(2.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 2.0F) {
					player.setAbsorptionAmount(4.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 4.0F) {
					player.setAbsorptionAmount(6.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 6.0F) {
					return;
				}
			}
		}
	
	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
	}
	
}
