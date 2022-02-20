package com.justhuanghere.neo.world.gen;

import com.justhuanghere.neo.world.feature.NeoPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class NeoTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.EXTREME_HILLS, Biome.Category.TAIGA, Biome.Category.FOREST, Biome.Category.MOUNTAIN),
                GenerationStep.Feature.VEGETAL_DECORATION, NeoPlacedFeatures.PINE_PLACED_KEY);
    }
}