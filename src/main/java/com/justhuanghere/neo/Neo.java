package com.justhuanghere.neo;

import com.justhuanghere.neo.registry.NeoBlocks;
import com.justhuanghere.neo.registry.NeoItems;
import com.justhuanghere.neo.registry.NeoRegistries;
import com.justhuanghere.neo.registry.NeoStatusEffect;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Neo implements ModInitializer {
    public static final String notenoughorigins = "notenoughorigins";
    public static final StatusEffect BLIGHT = new NeoStatusEffect();

    @Override
    public void onInitialize() {
        NeoItems.registerItems();
        NeoBlocks.registerBlocks();
        NeoRegistries.registerStrippable();
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_DOOR, RenderLayer.getCutout());
        Registry.register(Registry.STATUS_EFFECT, new Identifier("notenoughorigins", "blight"), BLIGHT);
    }
}


