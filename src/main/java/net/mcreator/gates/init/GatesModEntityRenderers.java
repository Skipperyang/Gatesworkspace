
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gates.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.gates.client.renderer.TaintedwalkerRenderer;
import net.mcreator.gates.client.renderer.ShadowmanRenderer;
import net.mcreator.gates.client.renderer.CursedwalkerRenderer;
import net.mcreator.gates.client.renderer.CursedsoulRenderer;
import net.mcreator.gates.client.renderer.CursedbeingRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GatesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GatesModEntities.CURSEDBEING.get(), CursedbeingRenderer::new);
		event.registerEntityRenderer(GatesModEntities.CURSEDWALKER.get(), CursedwalkerRenderer::new);
		event.registerEntityRenderer(GatesModEntities.CURSEDSOUL.get(), CursedsoulRenderer::new);
		event.registerEntityRenderer(GatesModEntities.SHADOWMAN.get(), ShadowmanRenderer::new);
		event.registerEntityRenderer(GatesModEntities.TAINTEDWALKER.get(), TaintedwalkerRenderer::new);
	}
}
