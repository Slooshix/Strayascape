package net.sloosh.strayascape.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.sloosh.strayascape.Strayascape;
import net.sloosh.strayascape.entity.custom.EchidnaEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class EchidnaRenderer extends GeoEntityRenderer<EchidnaEntity> {
    public EchidnaRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new EchidnaModel());
    }

    @Override
    public Identifier getTextureLocation(EchidnaEntity animatable) {
        return Identifier.of(Strayascape.MOD_ID,"textures/entity/echidna.png");
    }
}
