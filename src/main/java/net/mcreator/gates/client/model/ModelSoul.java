package net.mcreator.gates.client.model;

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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSoul<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("gates", "model_soul"), "main");
	public final ModelPart body;

	public ModelSoul(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, 3.0F, -9.0F, 14.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 18).addBox(-4.0F, -1.0F, -8.0F, 12.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));
		PartDefinition bottom = body.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -31.0F, -9.0F, 14.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 43.0F, 0.0F));
		PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(11.0F, 4.0F, -2.0F));
		PartDefinition rightarm = arms.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-11.0F, 1.0F, 2.0F));
		PartDefinition upperarm_r1 = rightarm.addOrReplaceChild("upperarm_r1", CubeListBuilder.create().texOffs(45, 44).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -1.0F, -2.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition lowerarm_r1 = rightarm.addOrReplaceChild("lowerarm_r1", CubeListBuilder.create().texOffs(22, 51).addBox(-1.0F, 6.1757F, 0.2612F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -1.0F, -2.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition leftarm = arms.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lowerarm_r2 = leftarm.addOrReplaceChild("lowerarm_r2", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, 6.1757F, 0.2612F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition upperarm_r2 = leftarm.addOrReplaceChild("upperarm_r2", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.body.yRot = ageInTicks / 20.f;
	}
}
