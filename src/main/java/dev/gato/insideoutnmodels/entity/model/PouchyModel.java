package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.PouchyEntity;

public class PouchyModel extends AnimatedGeoModel<PouchyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(PouchyEntity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/pouchy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(PouchyEntity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/pouchy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PouchyEntity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
