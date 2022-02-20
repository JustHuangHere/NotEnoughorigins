package com.justhuanghere.neo.registry;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class NeoRegistries {
    public static void registerStrippable() {
        StrippableBlockRegistry.register(NeoBlocks.PINE_LOG, NeoBlocks.STRIPPED_PINE_LOG);
        StrippableBlockRegistry.register(NeoBlocks.PINE_WOOD, NeoBlocks.STRIPPED_PINE_WOOD);
    }
}
