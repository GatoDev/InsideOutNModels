
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import dev.gato.custom.BlockItems.*;
import dev.gato.insideoutnmodels.item.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

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

	// * ORBS PROJ:

	public static final RegistryObject<Item> RED_ORB_PROJ = REGISTRY.register("red_orb_proj", () -> new RedOrbProjItem());
	public static final RegistryObject<Item> BLUE_ORB_PROJ = REGISTRY.register("blue_orb_proj", () -> new BlueOrbProjItem());
	public static final RegistryObject<Item> PINK_ORB_PROJ = REGISTRY.register("pink_orb_proj", () -> new PinkOrbProjItem());
	public static final RegistryObject<Item> GREEN_ORB_PROJ = REGISTRY.register("green_orb_proj", () -> new GreenOrbProjItem());
	public static final RegistryObject<Item> PURPLE_ORB_PROJ = REGISTRY.register("purple_orb_proj", () -> new PurpleOrbProjItem());
	public static final RegistryObject<Item> YELLOW_ORB_PROJ = REGISTRY.register("yellow_orb_proj", () -> new YellowOrbProjItem());
	public static final RegistryObject<Item> ORANGE_ORB_PROJ = REGISTRY.register("orange_orb_proj", () -> new OrangeOrbProjItem());
	public static final RegistryObject<Item> AQUA_ORB_PROJ = REGISTRY.register("aqua_orb_proj", () -> new AquaOrbProjItem());
	public static final RegistryObject<Item> BLACK_ORB_PROJ = REGISTRY.register("black_orb_proj", () -> new BlackOrbProjItem());
	public static final RegistryObject<Item> WHITE_ORB_PROJ = REGISTRY.register("white_orb_proj", () -> new WhiteOrbProjItem());


	// * ORBS:

	public static final RegistryObject<Item> RED_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.RED_ORB.getId().getPath(), () -> new RedOrbItem(InsideoutnmodelsModBlocks.RED_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));

	public static final RegistryObject<Item> BLUE_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.BLUE_ORB.getId().getPath(), () -> new BlueOrbItem(InsideoutnmodelsModBlocks.BLUE_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> PINK_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.PINK_ORB.getId().getPath(), () -> new PinkOrbItem(InsideoutnmodelsModBlocks.PINK_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> GREEN_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.GREEN_ORB.getId().getPath(), () -> new GreenOrbItem(InsideoutnmodelsModBlocks.GREEN_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> PURPLE_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.PURPLE_ORB.getId().getPath(), () -> new PurpleOrbItem(InsideoutnmodelsModBlocks.PURPLE_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> YELLOW_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.YELLOW_ORB.getId().getPath(), () -> new YellowOrbItem(InsideoutnmodelsModBlocks.YELLOW_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> ORANGE_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.ORANGE_ORB.getId().getPath(), () -> new OrangeOrbItem(InsideoutnmodelsModBlocks.ORANGE_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> AQUA_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.AQUA_ORB.getId().getPath(), () -> new AquaOrbItem(InsideoutnmodelsModBlocks.AQUA_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> BLACK_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.BLACK_ORB.getId().getPath(), () -> new BlackOrbItem(InsideoutnmodelsModBlocks.BLACK_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
	public static final RegistryObject<Item> WHITE_ORB = REGISTRY.register(InsideoutnmodelsModBlocks.WHITE_ORB.getId().getPath(), () -> new WhiteOrbItem(InsideoutnmodelsModBlocks.WHITE_ORB.get(), new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB)));
}
