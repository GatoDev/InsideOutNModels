package dev.gato.insideoutnmodels.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelball_emotion_20240715T010112_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("insideoutnmodels", "modelball_emotion_20240715_t_010112_converted"), "main");
	public final ModelPart bone;

	public Modelball_emotion_20240715T010112_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -8.5F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 36).addBox(-13.0F, -9.5F, 3.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(14, 24)
						.addBox(-12.5F, -7.75F, 4.75F, 1.0F, 6.5F, 6.5F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-4.5F, -7.75F, 4.75F, 1.0F, 6.5F, 6.5F, new CubeDeformation(0.0F)).texOffs(18, 17)
						.addBox(-11.25F, -9.0F, 4.75F, 6.5F, 1.0F, 6.5F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-11.25F, -1.0F, 4.75F, 6.5F, 1.0F, 6.5F, new CubeDeformation(0.0F)).texOffs(28, 24)
						.addBox(-11.25F, -7.75F, 3.5F, 6.5F, 6.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-11.25F, -7.75F, 11.5F, 6.5F, 6.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
