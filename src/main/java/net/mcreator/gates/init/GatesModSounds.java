
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gates.GatesMod;

public class GatesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GatesMod.MODID);
	public static final RegistryObject<SoundEvent> CURSED = REGISTRY.register("cursed", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "cursed")));
	public static final RegistryObject<SoundEvent> CURSED_ATTACK = REGISTRY.register("cursed_attack", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "cursed_attack")));
	public static final RegistryObject<SoundEvent> CURSED_PLAINS = REGISTRY.register("cursed_plains", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "cursed_plains")));
	public static final RegistryObject<SoundEvent> CURSED_PLAINS_EXTRA = REGISTRY.register("cursed_plains_extra", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "cursed_plains_extra")));
	public static final RegistryObject<SoundEvent> SOUL_IDLE = REGISTRY.register("soul_idle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "soul_idle")));
	public static final RegistryObject<SoundEvent> SPOTS_SOUL = REGISTRY.register("spots_soul", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "spots_soul")));
	public static final RegistryObject<SoundEvent> SOULATT = REGISTRY.register("soulatt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("gates", "soulatt")));
}
