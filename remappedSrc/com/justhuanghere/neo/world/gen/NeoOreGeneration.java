package com.justhuanghere.neo.world.gen;

import com.justhuanghere.neo.world.feature.NeoPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class NeoOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, NeoPlacedFeatures.IRIDIUM_ORE_PLACED_KEY);
    }
}