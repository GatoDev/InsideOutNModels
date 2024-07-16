package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker2Entity;

public class Worker2Model extends AnimatedGeoModel<Worker2Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker2Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker2Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker2Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
