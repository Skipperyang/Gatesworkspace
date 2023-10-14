// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelshadowman<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shadowman"), "main");
	private final ModelPart body;

	public Modelshadowman(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition lowerhalf = body.addOrReplaceChild("lowerhalf", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legs = lowerhalf.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(60, 54)
						.addBox(-7.0F, -32.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 54)
						.addBox(0.0F, -32.0F, -3.0F, 6.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left = legs.addOrReplaceChild("left", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right = legs.addOrReplaceChild("right", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F,
				-63.0F, -3.0F, 15.0F, 33.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition arms = torso.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(18, 50)
						.addBox(7.0F, -63.0F, -2.0F, 5.0F, 41.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-13.0F, -63.0F, -2.0F, 5.0F, 41.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(32, 29)
						.addBox(-7.0F, -83.0F, -5.0F, 13.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-6.0F, -69.0F, -2.0F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
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