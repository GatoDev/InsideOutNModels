package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker3Entity;

public class Worker3Model extends AnimatedGeoModel<Worker3Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker3Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker3.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker3Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker3.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker3Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
