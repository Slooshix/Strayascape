package net.sloosh.strayascape.entity.client;

import net.minecraft.util.Identifier;
import net.sloosh.strayascape.Strayascape;
import net.sloosh.strayascape.entity.custom.EchidnaEntity;
import software.bernie.geckolib.model.GeoModel;

public class EchidnaModel extends GeoModel<EchidnaEntity> {
    @Override
    public Identifier getModelResource(EchidnaEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"geo/echidna.geo.json");
    }

    @Override
    public Identifier getTextureResource(EchidnaEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"textures/entity/echidna.png");
    }

    @Override
    public Identifier getAnimationResource(EchidnaEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"animations/echidna.animation.json");
    }
}