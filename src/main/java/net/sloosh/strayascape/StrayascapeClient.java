package net.sloosh.strayascape;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.sloosh.strayascape.entity.ModEntities;
import net.sloosh.strayascape.entity.client.EchidnaRenderer;
import net.sloosh.strayascape.entity.client.FairywrenRenderer;

public class StrayascapeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.ECHIDNA, EchidnaRenderer::new);
        EntityRendererRegistry.register(ModEntities.FAIRYWREN, FairywrenRenderer::new);
    }
}
