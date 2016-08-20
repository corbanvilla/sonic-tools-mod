package com.animcogn.sonicScrewdriverMod.items;

import com.animcogn.sonicScrewdriverMod.armor.TardisArmor;
import com.animcogn.sonicScrewdriverMod.armor.TimeTravelerArmor;
import com.animcogn.sonicScrewdriverMod.armor.TimelordArmor;
import com.animcogn.sonicScrewdriverMod.tools.ModTools;
import com.animcogn.sonicScrewdriverMod.tools.SonicAxe;
import com.animcogn.sonicScrewdriverMod.tools.SonicPickaxe;
import com.animcogn.sonicScrewdriverMod.tools.SonicScrewdriver;
import com.animcogn.sonicScrewdriverMod.tools.SonicShovel;
import com.animcogn.sonicScrewdriverMod.tools.SonicSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	//Items
	public static Item timetravelerReminisce;
	public static Item stabalizedTimeEnergy;
	public static Item timetravelerCluster;
	public static Item timelordFragment;
	public static Item unstableTimeEnergy;

	public static final CreativeTabs tabSonicToolsMod = new CreativeTabs("sonicToolsMod") {
		@Override public Item func_78016_d() {
			return ModTools.sonicScrewdriver;
		}
	};
	
	public static void createItems() {

		//Items
		timelordFragment = new TimelordFragment();
		GameRegistry.registerItem(timelordFragment, "timelordFragment");
		
		timetravelerReminisce = new TimeTravelerReminisce();
		GameRegistry.registerItem(timetravelerReminisce, "timetravelerReminisce");
		
		stabalizedTimeEnergy = new StabilizedTimeEnergy();
		GameRegistry.registerItem(stabalizedTimeEnergy, "stabalizedTimeEnergy");
		
		timetravelerCluster = new TimeTravelerCluster();
		GameRegistry.registerItem(timetravelerCluster, "timetravelerCluster");
		
		unstableTimeEnergy = new UnstableTimeEnergy();
		GameRegistry.registerItem(unstableTimeEnergy, "unstableTimeEnergy");
		
		}
}
