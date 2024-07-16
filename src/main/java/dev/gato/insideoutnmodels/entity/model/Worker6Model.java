package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Worker6Entity;

public class Worker6Model extends AnimatedGeoModel<Worker6Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Worker6Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/worker6.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Worker6Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/worker6.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Worker6Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
