package com.justhuanghere.neo.registry;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerStrippable() {
        StrippableBlockRegistry.register(ModBlocks.PINE_LOG, ModBlocks.STRIPPED_PINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_WOOD);
    }
}
