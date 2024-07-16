
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import dev.gato.insideoutnmodels.client.renderer.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InsideoutnmodelsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_2.get(), Worker2Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_1.get(), Worker1Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_3.get(), Worker3Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_4.get(), Worker4Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_5.get(), Worker5Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_6.get(), Worker6Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_7.get(), Worker7Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_8.get(), Worker8Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WORKER_9.get(), Worker9Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.POLICE_1.get(), Police1Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.POLICE_2.get(), Police2Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.POLICE_3.get(), Police3Renderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.BLOOFY.get(), BloofyRenderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.ENNUI.get(), EnnuiRenderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.POUCHY.get(), PouchyRenderer::new);
		event.registerEntityRenderer(InsideoutnmodelsModEntities.TNT_PROJECTILE.get(), TNTProjectileRenderer::new);

		event.registerEntityRenderer(InsideoutnmodelsModEntities.RED_ORB_PROJ.get(), context -> new RedOrbProjRenderer(context, "redorb"));

		event.registerEntityRenderer(InsideoutnmodelsModEntities.BLUE_ORB_PROJ.get(), context -> new BlueOrbProjRenderer(context, "blueorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.PINK_ORB_PROJ.get(), context -> new PinkOrbProjRenderer(context, "pinkorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.GREEN_ORB_PROJ.get(), context -> new GreenOrbProjRenderer(context, "greenorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.PURPLE_ORB_PROJ.get(), context -> new PurpleOrbProjRenderer(context, "purpleorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.YELLOW_ORB_PROJ.get(), context -> new YellowOrbProjRenderer(context, "yelloworb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.ORANGE_ORB_PROJ.get(), context -> new OrangeOrbProjRenderer(context, "orangeorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.AQUA_ORB_PROJ.get(), context -> new AquaOrbProjRenderer(context, "aquaorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.BLACK_ORB_PROJ.get(), context -> new BlackOrbProjRenderer(context, "blackorb"));
		event.registerEntityRenderer(InsideoutnmodelsModEntities.WHITE_ORB_PROJ.get(), context -> new WhiteOrbProjRenderer(context, "whiteorb"));
	}
}
