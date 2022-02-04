package com.justhuanghere.neo.registry;

import io.github.apace100.calio.mixin.DamageSourceAccessor;
import net.minecraft.entity.damage.DamageSource;

public class NeoDamageSource {
    public static final DamageSource BLIGHTDAMAGE = ((DamageSourceAccessor)
            ((DamageSourceAccessor)DamageSourceAccessor.createDamageSource("blightdamage")).callSetBypassesArmor()).callSetUsesMagic();

    public static final DamageSource STOMPED = ((DamageSource) ((DamageSourceAccessor)DamageSourceAccessor.
            createDamageSource("stomped")));
}

