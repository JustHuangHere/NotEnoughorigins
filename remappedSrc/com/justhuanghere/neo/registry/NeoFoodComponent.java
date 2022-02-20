package com.justhuanghere.neo.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class NeoFoodComponent {
    public static final FoodComponent LATTE;
    public static final FoodComponent DINO_NUGGETS;
    public static final FoodComponent PINE_NUT;
    public static final FoodComponent PINE_NUT_SOUP;
    public static final FoodComponent ENCHANTED_GOLDEN_DINO_NUGGET;


    public NeoFoodComponent() {
    }

    private static FoodComponent.Builder create(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }

    static {
        LATTE = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.1F).statusEffect
                (new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0F).build();

        DINO_NUGGETS = (new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).meat().build());

        ENCHANTED_GOLDEN_DINO_NUGGET = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F)
                .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 400, 0), 1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 6000, 0), 1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 6000, 2), 1.0F)
                .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 6000, 0), 1.0F).alwaysEdible().build();

        PINE_NUT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).snack().build();

        PINE_NUT_SOUP = create(6).build();
    }
}

