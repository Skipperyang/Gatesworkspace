
package net.mcreator.gates.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.gates.entity.TaintedwalkerEntity;
import net.mcreator.gates.client.model.Modeltaintedwalker;

public class TaintedwalkerRenderer extends MobRenderer<TaintedwalkerEntity, Modeltaintedwalker<TaintedwalkerEntity>> {
	public TaintedwalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltaintedwalker(context.bakeLayer(Modeltaintedwalker.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<TaintedwalkerEntity, Modeltaintedwalker<TaintedwalkerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gates:textures/entities/taintedwalker.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TaintedwalkerEntity entity) {
		return new ResourceLocation("gates:textures/entities/taintedwalker.png");
	}
}
