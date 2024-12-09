package net.sloosh.strayascape.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sloosh.strayascape.Strayascape;
import net.sloosh.strayascape.entity.custom.EchidnaEntity;

public class ModEntities {
    public static final EntityType<EchidnaEntity> ECHIDNA = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("strayascape", "echidna"),
            EntityType.Builder.create(EchidnaEntity::new, SpawnGroup.CREATURE).dimensions(0.75f, 0.75f).build("cube")
    );
}