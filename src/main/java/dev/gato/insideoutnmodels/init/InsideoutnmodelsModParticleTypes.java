
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import dev.gato.insideoutnmodels.InsideoutnmodelsMod;

public class InsideoutnmodelsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, InsideoutnmodelsMod.MODID);
	public static final RegistryObject<ParticleType<?>> EXPLOSION_PARTICLE = REGISTRY.register("explosion_particle", () -> new SimpleParticleType(false));
}
