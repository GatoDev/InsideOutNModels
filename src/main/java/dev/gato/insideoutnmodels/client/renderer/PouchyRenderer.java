
package dev.gato.insideoutnmodels.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import dev.gato.insideoutnmodels.entity.model.PouchyModel;
import dev.gato.insideoutnmodels.entity.PouchyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PouchyRenderer extends GeoEntityRenderer<PouchyEntity> {
	public PouchyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PouchyModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PouchyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
