
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import dev.gato.insideoutnmodels.client.renderer.Worker9Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker8Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker7Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker6Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker5Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker4Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker3Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker2Renderer;
import dev.gato.insideoutnmodels.client.renderer.Worker1Renderer;
import dev.gato.insideoutnmodels.client.renderer.TNTProjectileRenderer;
import dev.gato.insideoutnmodels.client.renderer.RedOrbProjRenderer;
import dev.gato.insideoutnmodels.client.renderer.PouchyRenderer;
import dev.gato.insideoutnmodels.client.renderer.Police3Renderer;
import dev.gato.insideoutnmodels.client.renderer.Police2Renderer;
import dev.gato.insideoutnmodels.client.renderer.Police1Renderer;
import dev.gato.insideoutnmodels.client.renderer.EnnuiRenderer;
import dev.gato.insideoutnmodels.client.renderer.BloofyRenderer;

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
	}
}
