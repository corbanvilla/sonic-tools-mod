package com.animcogn.sonicScrewdriverMod.sounds;

import com.animcogn.sonicScrewdriverMod.Main;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSounds {
	
	public static SoundEvent sonicEffect;

	public static void initSounds() {
		sonicEffect = registerSound("sonicEffect");
	}

	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(Main.MODID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}

}
