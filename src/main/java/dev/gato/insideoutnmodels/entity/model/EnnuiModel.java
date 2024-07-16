package dev.gato.insideoutnmodels.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import dev.gato.insideoutnmodels.entity.EnnuiEntity;

public class EnnuiModel extends AnimatedGeoModel<EnnuiEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(EnnuiEntity entity) {
		return new ResourceLocation("insideoutnmodels", "animations/ennui.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(EnnuiEntity entity) {
		return new ResourceLocation("insideoutnmodels", "geo/ennui.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EnnuiEntity entity) {
		return new ResourceLocation("insideoutnmodels", "textures/entities/" + entity.getTexture() + ".png");
	}

}
