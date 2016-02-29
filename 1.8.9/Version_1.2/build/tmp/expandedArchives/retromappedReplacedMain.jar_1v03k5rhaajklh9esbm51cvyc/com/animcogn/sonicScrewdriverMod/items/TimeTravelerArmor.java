package com.animcogn.sonicScrewdriverMod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import net.minecraft.item.ItemArmor.ArmorMaterial;
public class TimeTravelerArmor extends ItemArmor {

	public TimeTravelerArmor (String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        
        this.func_77655_b(unlocalizedName);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if (itemStack.func_77973_b() == ModItems.timetravelerHelmet) {
			effectPlayer(player, Potion.field_76439_r, 0);
		}
		
		if (itemStack.func_77973_b() == ModItems.timetravelerChestplate) {
				effectPlayer(player, Potion.field_76444_x, 0);
		}
		
		if (itemStack.func_77973_b() == ModItems.timetravelerLeggings) {
			effectPlayer(player, Potion.field_76424_c, 0);
		}
		
		if (itemStack.func_77973_b() == ModItems.timetravelerBoots) {
	        effectPlayer(player, Potion.field_76430_j, 0);
	    }
		
	    if (this.isWearingFullSet(player, ModItems.timetravelerHelmet, ModItems.timetravelerChestplate, ModItems.timetravelerLeggings, ModItems.timetravelerBoots)) {
			this.effectPlayer(player, Potion.field_76428_l, 0);
	    }
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.func_70660_b(potion) == null || player.func_70660_b(potion).func_76459_b() <= 2)
	        player.func_70690_d(new PotionEffect(potion.field_76415_H, 159, amplifier, true, true));
	}
	
	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
		return player.field_71071_by.func_70440_f(3) != null && player.field_71071_by.func_70440_f(3).func_77973_b() == helmet
				&& player.field_71071_by.func_70440_f(2) != null && player.field_71071_by.func_70440_f(2).func_77973_b() == chestplate
				&& player.field_71071_by.func_70440_f(1) != null && player.field_71071_by.func_70440_f(1).func_77973_b() == leggings
				&& player.field_71071_by.func_70440_f(0) != null && player.field_71071_by.func_70440_f(0).func_77973_b() == boots;
	}
	
}
