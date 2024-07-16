package dev.gato.insideoutnmodels.client.renderer;

import com.mojang.math.Matrix4f;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import dev.gato.insideoutnmodels.entity.TNTProjectileEntity;
import dev.gato.insideoutnmodels.client.model.ModelCustomModel;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TNTProjectileRenderer extends EntityRenderer<TNTProjectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("insideoutnmodels:textures/entities/tnt.png");
	private final ModelCustomModel model;

	public TNTProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelCustomModel(context.bakeLayer(ModelCustomModel.LAYER_LOCATION));
	}

	@Override
public void render(TNTProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
    VertexConsumer vertexConsumer = bufferIn.getBuffer(RenderType.entityCutoutNoCull(this.getTextureLocation(entityIn)));
    poseStack.pushPose();

    // Ajustar la rotación y posición para el billboarding
    poseStack.mulPose(Vector3f.YP.rotationDegrees(180.0F - this.entityRenderDispatcher.camera.getYRot()));
    poseStack.mulPose(Vector3f.XP.rotationDegrees(-this.entityRenderDispatcher.camera.getXRot()));

    // Dibujar un cuadrado plano con la textura
    Matrix4f matrix4f = poseStack.last().pose();
    vertexConsumer.vertex(matrix4f, -0.5F, -0.5F, 0.0F).color(255, 255, 255, 255).uv(0, 1).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLightIn).normal(1, 0, 0).endVertex();

    vertexConsumer.vertex(matrix4f, 0.5F, -0.5F, 0.0F).color(255, 255, 255, 255).uv(1, 1).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLightIn).normal(1, 0, 0).endVertex();

    vertexConsumer.vertex(matrix4f, 0.5F, 0.5F, 0.0F).color(255, 255, 255, 255).uv(1, 0).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLightIn).normal(1, 0, 0).endVertex();

    vertexConsumer.vertex(matrix4f, -0.5F, 0.5F, 0.0F).color(255, 255, 255, 255).uv(0, 0).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLightIn).normal(1, 0, 0).endVertex();

    poseStack.popPose();
    super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
}

	@Override
	public ResourceLocation getTextureLocation(TNTProjectileEntity entity) {
		return texture;
	}
}
