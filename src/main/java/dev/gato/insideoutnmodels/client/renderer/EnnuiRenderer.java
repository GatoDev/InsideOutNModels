
package dev.gato.insideoutnmodels.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import dev.gato.insideoutnmodels.entity.model.EnnuiModel;
import dev.gato.insideoutnmodels.entity.EnnuiEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EnnuiRenderer extends GeoEntityRenderer<EnnuiEntity> {
	public EnnuiRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EnnuiModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EnnuiEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
