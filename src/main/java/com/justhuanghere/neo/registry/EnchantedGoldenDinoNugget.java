package com.justhuanghere.neo.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedGoldenDinoNugget extends Item {
    public EnchantedGoldenDinoNugget(Settings settings) {
        super(settings);
    }
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
