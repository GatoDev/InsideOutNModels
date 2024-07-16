package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.Police1Entity;

public class Police1Model extends AnimatedGeoModel<Police1Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(Police1Entity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/police.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(Police1Entity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/police.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(Police1Entity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
