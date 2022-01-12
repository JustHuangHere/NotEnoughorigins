package com.justhuanghere.neo.registry;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class CoffeePlantBlock extends CropBlock {
    protected CoffeePlantBlock(Settings settings) {
        super(settings);

    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return NeoItems.COFFEE_BEANS;
    }
}
