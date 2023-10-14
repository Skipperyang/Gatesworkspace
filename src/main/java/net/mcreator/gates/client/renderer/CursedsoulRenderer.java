
package net.mcreator.gates.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.gates.entity.CursedsoulEntity;
import net.mcreator.gates.client.model.ModelSoul;

public class CursedsoulRenderer extends MobRenderer<CursedsoulEntity, ModelSoul<CursedsoulEntity>> {
	public CursedsoulRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSoul(context.bakeLayer(ModelSoul.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CursedsoulEntity, ModelSoul<CursedsoulEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gates:textures/entities/soul2.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CursedsoulEntity entity) {
		return new ResourceLocation("gates:textures/entities/soul2.png");
	}
}
