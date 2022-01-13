package com.justhuanghere.neo.registry;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

public class CoffeePlantBlock extends CropBlock {
    protected CoffeePlantBlock(Settings settings) {
        super(settings);

    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return Items.WHEAT_SEEDS;
    }
}