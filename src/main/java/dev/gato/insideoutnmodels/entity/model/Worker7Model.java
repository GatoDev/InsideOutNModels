package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker7Entity;

public class Worker7Model extends AnimatedGeoModel<Worker7Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker7Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker7.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker7Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker7.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker7Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
