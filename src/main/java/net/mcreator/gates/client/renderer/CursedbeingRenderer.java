
package net.mcreator.gates.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.gates.entity.CursedbeingEntity;
import net.mcreator.gates.client.model.ModelCursed;

public class CursedbeingRenderer extends MobRenderer<CursedbeingEntity, ModelCursed<CursedbeingEntity>> {
	public CursedbeingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCursed(context.bakeLayer(ModelCursed.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CursedbeingEntity, ModelCursed<CursedbeingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gates:textures/entities/cursed_beining.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CursedbeingEntity entity) {
		return new ResourceLocation("gates:textures/entities/cursed_beining.png");
	}
}
