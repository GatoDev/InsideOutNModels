
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import dev.gato.insideoutnmodels.client.particle.ExplosionParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InsideoutnmodelsModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) InsideoutnmodelsModParticleTypes.EXPLOSION_PARTICLE.get(), ExplosionParticleParticle::provider);
	}
}
