package com.justhuanghere.neo.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class NeoFoodComponent {
    public static final FoodComponent LATTE;
    public static final FoodComponent DINO_NUGGETS;

    public NeoFoodComponent() {
    }

    private static FoodComponent.Builder create(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }

    static {
        LATTE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.8F).statusEffect
                (new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0F).build();

        DINO_NUGGETS = (new FoodComponent.Builder().hunger(5).saturationModifier(1.5F).meat().build());
    }
}

