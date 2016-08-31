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
import net.minecraft.world.World;

public class TimelordArmor extends ItemArmor {
	
	public TimelordArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		 super(material, renderIndex, armorType);
		 this.setUnlocalizedName(unlocalizedName);
		 this.setCreativeTab(ModItems.tabSonicToolsMod);
		 
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if (itemStack.getItem() == ModArmor.timelordHelmet) {
			effectPlayer(player, Potion.nightVision, 1);
		}
		
		if (itemStack.getItem() == ModArmor.timelordChestplate) {
			absorbtion(player);
			effectPlayer(player, Potion.moveSpeed, 0);
				
		}
		
		if (itemStack.getItem() == ModArmor.timelordLeggings) {
			effectPlayer(player, Potion.digSpeed, 0);
		}
		
		if (itemStack.getItem() == ModArmor.timelordBoots) {
	        effectPlayer(player, Potion.jump, 1);
	    }
		
	    if (this.isWearingFullSet(player, ModArmor.timelordHelmet, ModArmor.timelordChestplate, 
	    		ModArmor.timelordLeggings, ModArmor.timelordBoots)) {
			this.effectPlayer(player, Potion.regeneration, 1);
	    }
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 12)
	        player.addPotionEffect(new PotionEffect(potion.id, 400, amplifier, true, true));
	}
	
	private void absorbtion(EntityPlayer player) {
		float health;
		float absorbtion;
		health = player.getHealth();
		absorbtion = player.getAbsorptionAmount();
		
			if (health == 20.0F && DisplayInterval.absorbtionInterval == false 
				&& AttackCountdown.healthy == true && !player.worldObj.isRemote 
				&& absorbtion > 6.0) {	
				
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
				
				if (absorbtion == 5.0F) {
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