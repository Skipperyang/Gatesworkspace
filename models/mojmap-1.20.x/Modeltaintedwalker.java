// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltaintedwalker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "taintedwalker"), "main");
	private final ModelPart body;
	private final ModelPart leftleg;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart rightleg;
	private final ModelPart head;

	public Modeltaintedwalker(ModelPart root) {
		this.body = root.getChild("body");
		this.leftleg = root.getChild("leftleg");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.rightleg = root.getChild("rightleg");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-7.0F, -3.5981F, -0.5F, 13.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -4.5981F, -0.5F, 19.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(28, 41).addBox(1.0F, -4.9886F, -1.2615F, 5.0F, 18.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 6.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftarm
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(14, 31).addBox(6.0F, -3.8978F, -1.7765F, 3.0F, 31.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(6.0F, -17.0F, 2.0F));

		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 31).addBox(-10.0F, -3.8978F, -1.7765F, 3.0F, 31.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 15.0F, -3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(46, 41)
				.addBox(-13.0F, 23.0114F, 2.7385F, 5.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -17.0F, 2.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(30, 23)
						.addBox(-6.0F, -16.5981F, -1.5F, 11.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 10)
						.addBox(-5.0F, -8.5981F, -0.5F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition horn = head.addOrReplaceChild("horn",
				CubeListBuilder.create().texOffs(60, 3)
						.addBox(-9.0F, -13.5981F, 0.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(5.0F, -13.5981F, 0.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = horn.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(0.0F, -7.0655F, 0.4335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 31)
						.addBox(-14.0F, -7.0655F, 0.4335F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -15.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = horn.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, -5.02F, -0.3088F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-14.0F, -5.02F, -0.3088F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -15.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = horn.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(32, 10)
						.addBox(-9.0F, -7.8191F, -0.9739F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-23.0F, -7.8191F, -0.9739F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, -9.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}