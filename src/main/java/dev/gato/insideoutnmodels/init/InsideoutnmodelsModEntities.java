
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

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

import dev.gato.insideoutnmodels.entity.Worker9Entity;
import dev.gato.insideoutnmodels.entity.Worker8Entity;
import dev.gato.insideoutnmodels.entity.Worker7Entity;
import dev.gato.insideoutnmodels.entity.Worker6Entity;
import dev.gato.insideoutnmodels.entity.Worker5Entity;
import dev.gato.insideoutnmodels.entity.Worker4Entity;
import dev.gato.insideoutnmodels.entity.Worker3Entity;
import dev.gato.insideoutnmodels.entity.Worker2Entity;
import dev.gato.insideoutnmodels.entity.Worker1Entity;
import dev.gato.insideoutnmodels.entity.TNTProjectileEntity;
import dev.gato.insideoutnmodels.entity.PouchyEntity;
import dev.gato.insideoutnmodels.entity.Police3Entity;
import dev.gato.insideoutnmodels.entity.Police2Entity;
import dev.gato.insideoutnmodels.entity.Police1Entity;
import dev.gato.insideoutnmodels.entity.EnnuiEntity;
import dev.gato.insideoutnmodels.entity.BloofyEntity;
import dev.gato.insideoutnmodels.InsideoutnmodelsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsideoutnmodelsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, InsideoutnmodelsMod.MODID);
	public static final RegistryObject<EntityType<Worker2Entity>> WORKER_2 = register("worker_2",
			EntityType.Builder.<Worker2Entity>of(Worker2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker1Entity>> WORKER_1 = register("worker_1",
			EntityType.Builder.<Worker1Entity>of(Worker1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker3Entity>> WORKER_3 = register("worker_3",
			EntityType.Builder.<Worker3Entity>of(Worker3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker4Entity>> WORKER_4 = register("worker_4",
			EntityType.Builder.<Worker4Entity>of(Worker4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker5Entity>> WORKER_5 = register("worker_5",
			EntityType.Builder.<Worker5Entity>of(Worker5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker6Entity>> WORKER_6 = register("worker_6",
			EntityType.Builder.<Worker6Entity>of(Worker6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker7Entity>> WORKER_7 = register("worker_7",
			EntityType.Builder.<Worker7Entity>of(Worker7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker8Entity>> WORKER_8 = register("worker_8",
			EntityType.Builder.<Worker8Entity>of(Worker8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Worker9Entity>> WORKER_9 = register("worker_9",
			EntityType.Builder.<Worker9Entity>of(Worker9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Worker9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Police1Entity>> POLICE_1 = register("police_1",
			EntityType.Builder.<Police1Entity>of(Police1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Police1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Police2Entity>> POLICE_2 = register("police_2",
			EntityType.Builder.<Police2Entity>of(Police2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Police2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Police3Entity>> POLICE_3 = register("police_3",
			EntityType.Builder.<Police3Entity>of(Police3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Police3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BloofyEntity>> BLOOFY = register("bloofy",
			EntityType.Builder.<BloofyEntity>of(BloofyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloofyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnnuiEntity>> ENNUI = register("ennui",
			EntityType.Builder.<EnnuiEntity>of(EnnuiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnnuiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PouchyEntity>> POUCHY = register("pouchy",
			EntityType.Builder.<PouchyEntity>of(PouchyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PouchyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TNTProjectileEntity>> TNT_PROJECTILE = register("projectile_tnt_projectile",
			EntityType.Builder.<TNTProjectileEntity>of(TNTProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TNTProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Worker2Entity.init();
			Worker1Entity.init();
			Worker3Entity.init();
			Worker4Entity.init();
			Worker5Entity.init();
			Worker6Entity.init();
			Worker7Entity.init();
			Worker8Entity.init();
			Worker9Entity.init();
			Police1Entity.init();
			Police2Entity.init();
			Police3Entity.init();
			BloofyEntity.init();
			EnnuiEntity.init();
			PouchyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WORKER_2.get(), Worker2Entity.createAttributes().build());
		event.put(WORKER_1.get(), Worker1Entity.createAttributes().build());
		event.put(WORKER_3.get(), Worker3Entity.createAttributes().build());
		event.put(WORKER_4.get(), Worker4Entity.createAttributes().build());
		event.put(WORKER_5.get(), Worker5Entity.createAttributes().build());
		event.put(WORKER_6.get(), Worker6Entity.createAttributes().build());
		event.put(WORKER_7.get(), Worker7Entity.createAttributes().build());
		event.put(WORKER_8.get(), Worker8Entity.createAttributes().build());
		event.put(WORKER_9.get(), Worker9Entity.createAttributes().build());
		event.put(POLICE_1.get(), Police1Entity.createAttributes().build());
		event.put(POLICE_2.get(), Police2Entity.createAttributes().build());
		event.put(POLICE_3.get(), Police3Entity.createAttributes().build());
		event.put(BLOOFY.get(), BloofyEntity.createAttributes().build());
		event.put(ENNUI.get(), EnnuiEntity.createAttributes().build());
		event.put(POUCHY.get(), PouchyEntity.createAttributes().build());
	}
}
