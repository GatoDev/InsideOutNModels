
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import dev.gato.insideoutnmodels.item.TNTProjectileItem;
import dev.gato.insideoutnmodels.item.TNTItem;
import dev.gato.insideoutnmodels.InsideoutnmodelsMod;

public class InsideoutnmodelsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InsideoutnmodelsMod.MODID);
	public static final RegistryObject<Item> WORKER_2_SPAWN_EGG = REGISTRY.register("worker_2_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_2, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_1_SPAWN_EGG = REGISTRY.register("worker_1_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_1, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_3_SPAWN_EGG = REGISTRY.register("worker_3_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_3, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_4_SPAWN_EGG = REGISTRY.register("worker_4_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_4, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_5_SPAWN_EGG = REGISTRY.register("worker_5_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_5, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_6_SPAWN_EGG = REGISTRY.register("worker_6_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_6, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_7_SPAWN_EGG = REGISTRY.register("worker_7_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_7, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_8_SPAWN_EGG = REGISTRY.register("worker_8_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_8, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WORKER_9_SPAWN_EGG = REGISTRY.register("worker_9_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.WORKER_9, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> POLICE_1_SPAWN_EGG = REGISTRY.register("police_1_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.POLICE_1, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> POLICE_2_SPAWN_EGG = REGISTRY.register("police_2_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.POLICE_2, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> POLICE_3_SPAWN_EGG = REGISTRY.register("police_3_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.POLICE_3, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> BLOOFY_SPAWN_EGG = REGISTRY.register("bloofy_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.BLOOFY, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> ENNUI_SPAWN_EGG = REGISTRY.register("ennui_spawn_egg", () -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.ENNUI, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> POUCHY_SPAWN_EGG = REGISTRY.register("pouchy_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideoutnmodelsModEntities.POUCHY, -1, -1, new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> TNT = REGISTRY.register("tnt", () -> new TNTItem());
	public static final RegistryObject<Item> TNT_PROJECTILE = REGISTRY.register("tnt_projectile", () -> new TNTProjectileItem());
}
