package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker9Entity;

public class Worker9Model extends AnimatedGeoModel<Worker9Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker9Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker9.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker9Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker9.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker9Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
