
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gates.entity.TaintedwalkerEntity;
import net.mcreator.gates.entity.ShadowmanEntity;
import net.mcreator.gates.entity.CursedwalkerEntity;
import net.mcreator.gates.entity.CursedsoulEntity;
import net.mcreator.gates.entity.CursedbeingEntity;
import net.mcreator.gates.GatesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GatesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GatesMod.MODID);
	public static final RegistryObject<EntityType<CursedbeingEntity>> CURSEDBEING = register("cursedbeing", EntityType.Builder.<CursedbeingEntity>of(CursedbeingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedbeingEntity::new).fireImmune().sized(0.6f, 3.7f));
	public static final RegistryObject<EntityType<CursedwalkerEntity>> CURSEDWALKER = register("cursedwalker",
			EntityType.Builder.<CursedwalkerEntity>of(CursedwalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedwalkerEntity::new)

					.sized(0.6f, 3.2f));
	public static final RegistryObject<EntityType<CursedsoulEntity>> CURSEDSOUL = register("cursedsoul",
			EntityType.Builder.<CursedsoulEntity>of(CursedsoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedsoulEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowmanEntity>> SHADOWMAN = register("shadowman",
			EntityType.Builder.<ShadowmanEntity>of(ShadowmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowmanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TaintedwalkerEntity>> TAINTEDWALKER = register("taintedwalker",
			EntityType.Builder.<TaintedwalkerEntity>of(TaintedwalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TaintedwalkerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CursedbeingEntity.init();
			CursedwalkerEntity.init();
			CursedsoulEntity.init();
			ShadowmanEntity.init();
			TaintedwalkerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CURSEDBEING.get(), CursedbeingEntity.createAttributes().build());
		event.put(CURSEDWALKER.get(), CursedwalkerEntity.createAttributes().build());
		event.put(CURSEDSOUL.get(), CursedsoulEntity.createAttributes().build());
		event.put(SHADOWMAN.get(), ShadowmanEntity.createAttributes().build());
		event.put(TAINTEDWALKER.get(), TaintedwalkerEntity.createAttributes().build());
	}
}
