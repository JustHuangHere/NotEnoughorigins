package com.justhuanghere.neo.registry;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class ModStatusEffect extends StatusEffect {
    public ModStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0x1e570);
    }
@Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {return true;}
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity)entity).damage(ModDamageSource.BLIGHTDAMAGE, Float.parseFloat("1"));
        }
    }
}
