
package net.mcreator.gates.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.gates.entity.ShadowmanEntity;
import net.mcreator.gates.client.model.Modelshadowman;

public class ShadowmanRenderer extends MobRenderer<ShadowmanEntity, Modelshadowman<ShadowmanEntity>> {
	public ShadowmanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshadowman(context.bakeLayer(Modelshadowman.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ShadowmanEntity, Modelshadowman<ShadowmanEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gates:textures/entities/shadowman.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowmanEntity entity) {
		return new ResourceLocation("gates:textures/entities/shadowman.png");
	}
}
