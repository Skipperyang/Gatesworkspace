
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gates.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.gates.client.model.Modeltaintedwalker;
import net.mcreator.gates.client.model.Modelshadowman;
import net.mcreator.gates.client.model.Modelcursewakler;
import net.mcreator.gates.client.model.ModelSoul;
import net.mcreator.gates.client.model.ModelCursed;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GatesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcursewakler.LAYER_LOCATION, Modelcursewakler::createBodyLayer);
		event.registerLayerDefinition(ModelSoul.LAYER_LOCATION, ModelSoul::createBodyLayer);
		event.registerLayerDefinition(ModelCursed.LAYER_LOCATION, ModelCursed::createBodyLayer);
		event.registerLayerDefinition(Modeltaintedwalker.LAYER_LOCATION, Modeltaintedwalker::createBodyLayer);
		event.registerLayerDefinition(Modelshadowman.LAYER_LOCATION, Modelshadowman::createBodyLayer);
	}
}
