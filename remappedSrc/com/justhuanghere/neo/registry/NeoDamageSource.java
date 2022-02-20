package com.justhuanghere.neo.registry;

import io.github.apace100.calio.mixin.DamageSourceAccessor;
import net.minecraft.entity.damage.DamageSource;

public class NeoDamageSource {
    public static final DamageSource BLIGHTDAMAGE = ((DamageSourceAccessor)
            ((DamageSourceAccessor)DamageSourceAccessor.createDamageSource("blightdamage")).callSetBypassesArmor()).callSetUsesMagic();

    public static final DamageSource STOMPED = ((DamageSource) ((DamageSourceAccessor)DamageSourceAccessor.
            createDamageSource("stomped")));

    public static final DamageSource DIET =((DamageSource)
            ((DamageSourceAccessor)DamageSourceAccessor.createDamageSource("diet")).callSetBypassesArmor());

    public static final DamageSource RAM = ((DamageSource) ((DamageSourceAccessor)DamageSourceAccessor.createDamageSource("ram")));
}

