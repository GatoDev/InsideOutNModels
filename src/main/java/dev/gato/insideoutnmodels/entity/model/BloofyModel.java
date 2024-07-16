package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.BloofyEntity;

public class BloofyModel extends AnimatedGeoModel<BloofyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BloofyEntity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/bloofy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BloofyEntity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/bloofy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BloofyEntity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
