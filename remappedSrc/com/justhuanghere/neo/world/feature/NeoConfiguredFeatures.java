package com.justhuanghere.neo.world.feature;

import com.justhuanghere.neo.Neo;
import com.justhuanghere.neo.registry.NeoBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.PineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class NeoConfiguredFeatures {
    public static final ConfiguredFeature<TreeFeatureConfig, ?> PINE_TREE =
            register("pine", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(NeoBlocks.PINE_LOG),
                    new StraightTrunkPlacer(6, 4, 0),
                    BlockStateProvider.of(NeoBlocks.PINE_LEAVES),
                    new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
                    new TwoLayersFeatureSize(2, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> PINE_TREE_RANDOM = register("pine_feature",
            Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                    PINE_TREE.withWouldSurviveFilter(NeoBlocks.PINE_SAPLING), 0.1f)),
                    PINE_TREE.withWouldSurviveFilter(NeoBlocks.PINE_SAPLING))));

    public static final List<OreFeatureConfig.Target> OVERWORLD_IRIDIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, NeoBlocks.IRIDIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, NeoBlocks.DEEPSLATE_IRIDIUM_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> IRIDIUM_ORE = register("iridium_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_IRIDIUM_ORES, 9)));

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Neo.notenoughorigins, name),
                configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Neo.notenoughorigins);
    }
}