package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker1Entity;

public class Worker1Model extends AnimatedGeoModel<Worker1Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker1Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker1Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker1Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
