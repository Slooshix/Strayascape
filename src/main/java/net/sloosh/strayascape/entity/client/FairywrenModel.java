package net.sloosh.strayascape.entity.client;

import net.minecraft.util.Identifier;
import net.sloosh.strayascape.Strayascape;
import net.sloosh.strayascape.entity.custom.FairywrenEntity;
import software.bernie.geckolib.model.GeoModel;

public class FairywrenModel extends GeoModel<FairywrenEntity> {
    @Override
    public Identifier getModelResource(FairywrenEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"geo/fairywren.geo.json");
    }

    @Override
    public Identifier getTextureResource(FairywrenEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"textures/entity/fairywren_superb.png");
    }

    @Override
    public Identifier getAnimationResource(FairywrenEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"animations/fairywren.animation.json");
    }
}