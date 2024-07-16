package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker4Entity;

public class Worker4Model extends AnimatedGeoModel<Worker4Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker4Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker4.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker4Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker4.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker4Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
