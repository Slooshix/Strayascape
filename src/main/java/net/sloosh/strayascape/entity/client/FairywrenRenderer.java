package net.sloosh.strayascape.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.sloosh.strayascape.Strayascape;
import net.sloosh.strayascape.entity.custom.FairywrenEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FairywrenRenderer extends GeoEntityRenderer<FairywrenEntity> {
    public FairywrenRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new FairywrenModel());
    }

    @Override
    public Identifier getTextureLocation(FairywrenEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"textures/entity/fairywren_superb.png");
    }
}