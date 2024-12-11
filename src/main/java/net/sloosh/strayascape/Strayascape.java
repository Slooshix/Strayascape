package net.sloosh.strayascape;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.sloosh.strayascape.entity.ModEntities;
import net.sloosh.strayascape.entity.custom.EchidnaEntity;
import net.sloosh.strayascape.entity.custom.FairywrenEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Strayascape implements ModInitializer {
	public static final String MOD_ID = "strayascape";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(ModEntities.ECHIDNA, EchidnaEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FAIRYWREN, FairywrenEntity.createMobAttributes());
	}
}