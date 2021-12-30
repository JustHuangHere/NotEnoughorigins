package com.justhuanghere.neo;

import com.justhuanghere.neo.registry.ModBlocks;
import com.justhuanghere.neo.registry.ModItems;
import com.justhuanghere.neo.registry.ModRegistries;
import com.justhuanghere.neo.registry.ModStatusEffect;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Neo implements ModInitializer {
    public static final String notenoughorigins = "notenoughorigins";
    public static final StatusEffect BLIGHT = new ModStatusEffect();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModRegistries.registerStrippable();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_DOOR, RenderLayer.getCutout());
        Registry.register(Registry.STATUS_EFFECT, new Identifier("notenoughorigins", "blight"), BLIGHT);
    }
}


