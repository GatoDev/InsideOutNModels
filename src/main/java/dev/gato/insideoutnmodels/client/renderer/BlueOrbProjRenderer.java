package dev.gato.insideoutnmodels.client.renderer;

import dev.gato.insideoutnmodels.entity.BlueOrbProjEntity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import dev.gato.insideoutnmodels.entity.RedOrbProjEntity;
import dev.gato.insideoutnmodels.client.model.Modelball_emotion_20240715T010112_Converted;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlueOrbProjRenderer extends EntityRenderer<BlueOrbProjEntity> {
	private static ResourceLocation texture;
	private final Modelball_emotion_20240715T010112_Converted model;

	public BlueOrbProjRenderer(EntityRendererProvider.Context context, String textureName) {
		super(context);
		model = new Modelball_emotion_20240715T010112_Converted(context.bakeLayer(Modelball_emotion_20240715T010112_Converted.LAYER_LOCATION));

		texture  = new ResourceLocation(
				"insideoutnmodels:textures/entities/" + textureName + ".png");
	}

	@Override
	public void render(BlueOrbProjEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueOrbProjEntity entity) {
		return texture;
	}
}
