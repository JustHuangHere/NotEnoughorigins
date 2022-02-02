package com.justhuanghere.neo.world.feature.tree;

import com.justhuanghere.neo.world.feature.NeoConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class PineSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getTreeFeature(Random random, boolean bees) {
        return NeoConfiguredFeatures.PINE_TREE;
    }
}
