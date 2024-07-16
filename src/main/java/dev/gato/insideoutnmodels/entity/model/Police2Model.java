package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Police2Entity;

public class Police2Model extends AnimatedGeoModel<Police2Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Police2Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/police2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Police2Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/police2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Police2Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
