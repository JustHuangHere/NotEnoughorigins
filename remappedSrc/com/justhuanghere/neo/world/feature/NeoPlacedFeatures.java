package com.justhuanghere.neo.world.feature;

import com.justhuanghere.neo.Neo;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class NeoPlacedFeatures {
    public static final RegistryKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");
    public static final RegistryKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");

    public static final PlacedFeature PINE_PLACED = registerPlacedFeature("pine_placed",
            NeoConfiguredFeatures.PINE_TREE_RANDOM.withPlacement(VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2))));

    public static final PlacedFeature IRIDIUM_ORE_PLACED = registerPlacedFeature("iridium_ore_placed",
            NeoConfiguredFeatures.IRIDIUM_ORE.withPlacement(NeoOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.fixed(-50)))));


    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Neo.notenoughorigins, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(Neo.notenoughorigins, name));
    }
}