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

import net.minecraft.item.ItemArmor.ArmorMaterial;
public class TimelordArmor extends ItemArmor {
	
	public TimelordArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		 super(material, renderIndex, armorType);
		 this.func_77655_b(unlocalizedName);
		 this.func_77637_a(ModItems.tabSonicToolsMod);
		 
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if (itemStack.func_77973_b() == ModArmor.timelordHelmet) {
			effectPlayer(player, Potion.field_76439_r, 1);
		}
		
		if (itemStack.func_77973_b() == ModArmor.timelordChestplate) {
			absorbtion(player);
			effectPlayer(player, Potion.field_76420_g, 0);
				
		}
		
		if (itemStack.func_77973_b() == ModArmor.timelordLeggings) {
			effectPlayer(player, Potion.field_76424_c, 1);
			effectPlayer(player, Potion.field_76422_e, 0);
		}
		
		if (itemStack.func_77973_b() == ModArmor.timelordBoots) {
	        effectPlayer(player, Potion.field_76430_j, 1);
	    }
		
	    if (this.isWearingFullSet(player, ModArmor.timelordHelmet, ModArmor.timelordChestplate, 
	    		ModArmor.timelordLeggings, ModArmor.timelordBoots)) {
			this.effectPlayer(player, Potion.field_76428_l, 1);
	    }
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.func_70660_b(potion) == null || player.func_70660_b(potion).func_76459_b() <= 12)
	        player.func_70690_d(new PotionEffect(potion.field_76415_H, 400, amplifier, true, true));
	}
	
	private void absorbtion(EntityPlayer player) {
		float health;
		float absorbtion;
		health = player.func_110143_aJ();
		absorbtion = player.func_110139_bj();
		
			if (health == 20.0F && DisplayInterval.absorbtionInterval == false 
				&& AttackCountdown.healthy == true && !player.field_70170_p.field_72995_K 
				&& absorbtion > 6.0) {	
				
				if (absorbtion == 0.0F) {
					player.func_110149_m(2.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				
				else if (absorbtion == 1.0F) {
					player.func_110149_m(2.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				
				else if (absorbtion == 2.0F) {
					player.func_110149_m(4.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				
				else if (absorbtion == 3.0F) {
					player.func_110149_m(4.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				
				else if (absorbtion == 4.0F) {
					player.func_110149_m(6.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				
				if (absorbtion == 5.0F) {
					player.func_110149_m(6.0F);
					DisplayInterval.absorbtionInterval = true;
					CountDown.startInterval();
				}
				
				else if (absorbtion == 6.0F) {
					return;
				}
			}
		}
	
	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
		return player.field_71071_by.func_70440_f(3) != null && player.field_71071_by.func_70440_f(3).func_77973_b() == helmet
				&& player.field_71071_by.func_70440_f(2) != null && player.field_71071_by.func_70440_f(2).func_77973_b() == chestplate
				&& player.field_71071_by.func_70440_f(1) != null && player.field_71071_by.func_70440_f(1).func_77973_b() == leggings
				&& player.field_71071_by.func_70440_f(0) != null && player.field_71071_by.func_70440_f(0).func_77973_b() == boots;
	}
	
}
