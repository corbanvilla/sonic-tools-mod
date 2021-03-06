package com.animcogn.sonicScrewdriverMod.armor;

import com.animcogn.sonicScrewdriverMod.events.AttackCountdown;
import com.animcogn.sonicScrewdriverMod.events.CountDown;
import com.animcogn.sonicScrewdriverMod.events.CountDown.DisplayInterval;
import com.animcogn.sonicScrewdriverMod.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.world.World;

public class TardisArmor extends ItemArmor {
	
	public TardisArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		 super(material, renderIndex, armorType);
		 this.setUnlocalizedName(unlocalizedName);
		 this.setCreativeTab(ModItems.tabSonicToolsMod);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if (itemStack.getItem() == ModArmor.tardisHelmet) {
			effectPlayer(player, Potion.nightVision, 2);
			effectPlayer(player, Potion.resistance, 0);
		}
		
		if (itemStack.getItem() == ModArmor.tardisChestplate) {
			absorbtion(player);
			effectPlayer(player, Potion.damageBoost, 1);
				
		}
		
		if (itemStack.getItem() == ModArmor.tardisLeggings) {
			effectPlayer(player, Potion.moveSpeed, 2);
			effectPlayer(player, Potion.digSpeed, 2);
		}
		
		if (itemStack.getItem() == ModArmor.tardisBoots) {
	        effectPlayer(player, Potion.jump, 2);
	        effectPlayer(player, Potion.fireResistance, 1);
	    }
		
	    if (this.isWearingFullSet(player, ModArmor.tardisHelmet, ModArmor.tardisChestplate, 
	    		ModArmor.tardisLeggings, ModArmor.tardisBoots)) {
			this.effectPlayer(player, Potion.regeneration, 1);
			this.effectPlayer(player, Potion.saturation, 1);
			this.effectPlayer(player, Potion.waterBreathing, 1);
	    }
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 220)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
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
				else if (absorbtion == 1.0F) {
					player.setAbsorptionAmount(2.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 2.0F) {
					player.setAbsorptionAmount(4.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 3.0F) {
					player.setAbsorptionAmount(4.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 4.0F) {
					player.setAbsorptionAmount(6.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 5.0F) {
					player.setAbsorptionAmount(6.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 6.0F) {
					player.setAbsorptionAmount(8.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 7.0F) {
					player.setAbsorptionAmount(8.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else if (absorbtion == 8.0F) {
					player.setAbsorptionAmount(10.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				else {
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
