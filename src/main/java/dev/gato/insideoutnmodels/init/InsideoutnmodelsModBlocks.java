
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import dev.gato.insideoutnmodels.block.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import dev.gato.insideoutnmodels.InsideoutnmodelsMod;

public class InsideoutnmodelsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InsideoutnmodelsMod.MODID);
	public static final RegistryObject<Block> RED_ORB = REGISTRY.register("red_orb", () -> new RedOrbBlock());
	public static final RegistryObject<Block> BLUE_ORB = REGISTRY.register("blue_orb", () -> new BlueOrbBlock());
	public static final RegistryObject<Block> PINK_ORB = REGISTRY.register("pink_orb", () -> new PinkOrbBlock());
	public static final RegistryObject<Block> GREEN_ORB = REGISTRY.register("green_orb", () -> new GreenOrbBlock());
	public static final RegistryObject<Block> PURPLE_ORB = REGISTRY.register("purple_orb", () -> new PurpleOrbBlock());
	public static final RegistryObject<Block> YELLOW_ORB = REGISTRY.register("yellow_orb", () -> new YellowOrbBlock());
	public static final RegistryObject<Block> ORANGE_ORB = REGISTRY.register("orange_orb", () -> new OrangeOrbBlock());
	public static final RegistryObject<Block> AQUA_ORB = REGISTRY.register("aqua_orb", () -> new AquaOrbBlock());
	public static final RegistryObject<Block> BLACK_ORB = REGISTRY.register("black_orb", () -> new BlackOrbBlock());
	public static final RegistryObject<Block> WHITE_ORB = REGISTRY.register("white_orb", () -> new WhiteOrbBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RedOrbBlock.registerRenderLayer();
			BlueOrbBlock.registerRenderLayer();
			PinkOrbBlock.registerRenderLayer();
			GreenOrbBlock.registerRenderLayer();
			PurpleOrbBlock.registerRenderLayer();
			YellowOrbBlock.registerRenderLayer();
			OrangeOrbBlock.registerRenderLayer();
			AquaOrbBlock.registerRenderLayer();
			BlackOrbBlock.registerRenderLayer();
			WhiteOrbBlock.registerRenderLayer();
		}
	}
}
