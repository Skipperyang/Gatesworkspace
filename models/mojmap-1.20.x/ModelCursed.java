// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCursed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cursed"), "main");
	private final ModelPart body;

	public ModelCursed(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, -27.0F, 0.0F));

		PartDefinition Torso = body.addOrReplaceChild("Torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, -11.0F, 0.0F));

		PartDefinition upperback = Torso.addOrReplaceChild("upperback", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-7.0F, -1.0F, -6.0F, 16.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -2.0F, 0.0F));

		PartDefinition Rightarm = upperback.addOrReplaceChild("Rightarm", CubeListBuilder.create(),
				PartPose.offset(23.0F, -1.0F, 0.0F));

		PartDefinition R_A_bottom = Rightarm.addOrReplaceChild("R_A_bottom", CubeListBuilder.create(),
				PartPose.offset(-10.0F, 19.0F, 0.0F));

		PartDefinition rightarmbottom_r1 = R_A_bottom.addOrReplaceChild("rightarmbottom_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(-3.0F, -3.3017F, -3.5513F, 6.0F, 32.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 1.0F, -2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition R_A_top = Rightarm.addOrReplaceChild("R_A_top", CubeListBuilder.create().texOffs(0, 42).addBox(
				-14.0F, -5.0F, -5.0F, 6.0F, 24.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Leftarm = upperback.addOrReplaceChild("Leftarm", CubeListBuilder.create(),
				PartPose.offset(-10.0F, 0.0F, 0.0F));

		PartDefinition L_A_bottom2 = Leftarm.addOrReplaceChild("L_A_bottom2", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 16.0F, 0.0F));

		PartDefinition Leftarmbottom_r1 = L_A_bottom2.addOrReplaceChild("Leftarmbottom_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -3.3017F, -3.5513F, 6.0F, 32.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition L_A_top = Leftarm.addOrReplaceChild("L_A_top", CubeListBuilder.create().texOffs(0, 42).addBox(
				-1.0F, -6.0F, -5.0F, 6.0F, 24.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition neck = upperback.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(50, 0).addBox(-3.0F,
				1.0F, -5.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition cube_r1 = neck
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(52, 89).addBox(-3.0F, -3.0F, -5.0F, 7.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-4.0F, 7.0F, 0.0F, 0.0F, 0.0F, 2.1817F));

		PartDefinition cube_r2 = neck
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(52, 89).addBox(-3.0F, -3.0F, -5.0F, 7.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(37, 29).addBox(-8.0F,
				-16.0F, -7.0F, 16.0F, 16.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r3 = jaw.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(97, 50)
						.addBox(-1.0F, -3.0F, -8.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(95, 38)
						.addBox(-19.0F, -3.0F, -8.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-17.0F, -3.0F, -8.0F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition lowerback = Torso.addOrReplaceChild("lowerback", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-8.0F, -1.0F, -6.0F, 16.0F, 19.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition leftleg2 = lowerback.addOrReplaceChild("leftleg2", CubeListBuilder.create(),
				PartPose.offset(5.0F, 18.0F, 0.0F));

		PartDefinition L_L_bottom2 = leftleg2.addOrReplaceChild("L_L_bottom2", CubeListBuilder.create().texOffs(78, 58)
				.addBox(-3.0F, -1.0F, -5.0F, 6.0F, 23.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 11.0F, 0.0F));

		PartDefinition leftlegtop = leftleg2.addOrReplaceChild("leftlegtop", CubeListBuilder.create().texOffs(78, 58)
				.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, -2.0F));

		PartDefinition rightleg = lowerback.addOrReplaceChild("rightleg", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 20.0F, 0.0F));

		PartDefinition R_L_bottom = rightleg.addOrReplaceChild("R_L_bottom", CubeListBuilder.create().texOffs(78, 58)
				.addBox(-2.0F, -3.0F, -5.0F, 6.0F, 23.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));

		PartDefinition rightlegtop = rightleg.addOrReplaceChild("rightlegtop", CubeListBuilder.create().texOffs(78, 58)
				.addBox(-2.0F, -5.0F, -5.0F, 6.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.body.yRot = ageInTicks / 20.f;
	}
}