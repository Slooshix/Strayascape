package net.sloosh.strayascape;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.sloosh.strayascape.entity.ModEntities;
import net.sloosh.strayascape.entity.client.EchidnaRenderer;
import net.sloosh.strayascape.entity.custom.EchidnaEntity;

public class StrayascapeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.ECHIDNA, EchidnaRenderer::new);
    }
}
