package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker5Entity;

public class Worker5Model extends AnimatedGeoModel<Worker5Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker5Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker5.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker5Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker5.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker5Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
