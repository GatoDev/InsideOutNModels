package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Police3Entity;

public class Police3Model extends AnimatedGeoModel<Police3Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Police3Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/police3.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Police3Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/police3.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Police3Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
