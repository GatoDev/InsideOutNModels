package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker8Entity;

public class Worker8Model extends AnimatedGeoModel<Worker8Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker8Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker8.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker8Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker8.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker8Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
