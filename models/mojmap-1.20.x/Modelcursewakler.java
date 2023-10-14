// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcursewakler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cursewakler"), "main");
	private final ModelPart body;

	public Modelcursewakler(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-7.0F, -1.0F, -2.0F, 13.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -2.0F, -2.0F, 19.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(28, 41)
						.addBox(1.0F, -3.0F, -1.0F, 5.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 41)
						.addBox(-7.0F, -3.0F, -1.0F, 5.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -1.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = arms.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(-10.0F, -1.0F, -1.0F, 3.0F, 31.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 31)
						.addBox(6.0F, -1.0F, -1.0F, 3.0F, 31.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(30, 23)
						.addBox(-6.0F, -14.0F, -3.0F, 11.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 10)
						.addBox(-5.0F, -6.0F, -2.0F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition horn = head.addOrReplaceChild("horn",
				CubeListBuilder.create().texOffs(60, 3)
						.addBox(-9.0F, -11.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(5.0F, -11.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = horn.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(0.0F, -4.0912F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 31)
						.addBox(-14.0F, -4.0912F, 0.0419F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -15.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = horn.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, -2.0912F, -0.9581F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-14.0F, -2.0912F, -0.9581F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -15.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = horn.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 10)
						.addBox(-9.0F, -5.0F, -2.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 21)
						.addBox(-23.0F, -5.0F, -2.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, -9.0F, 2.0F, -0.1745F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}