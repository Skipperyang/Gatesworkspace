
package net.mcreator.gates.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.gates.entity.CursedwalkerEntity;
import net.mcreator.gates.client.model.Modelcursewakler;

public class CursedwalkerRenderer extends MobRenderer<CursedwalkerEntity, Modelcursewakler<CursedwalkerEntity>> {
	public CursedwalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursewakler(context.bakeLayer(Modelcursewakler.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CursedwalkerEntity, Modelcursewakler<CursedwalkerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gates:textures/entities/cursedwalker.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CursedwalkerEntity entity) {
		return new ResourceLocation("gates:textures/entities/cursedwalker.png");
	}
}
