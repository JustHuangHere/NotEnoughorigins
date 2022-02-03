package com.justhuanghere.neo;

import com.justhuanghere.neo.registry.*;
import com.justhuanghere.neo.world.feature.NeoConfiguredFeatures;
import com.justhuanghere.neo.world.gen.NeoOreGeneration;
import com.justhuanghere.neo.world.gen.NeoWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Neo implements ModInitializer {
    public static final String notenoughorigins = "notenoughorigins";
    public static final StatusEffect BLIGHT = new NeoBlightedEffect();
    public static final Identifier ITEM_ARMOR_EQUIP_IRIDIUM = new Identifier("notenoughorigins:item.armor.equip_iridium");
    public static final SoundEvent ARMOR_EQUIP_IRIDIUM = new SoundEvent(ITEM_ARMOR_EQUIP_IRIDIUM);

    @Override
    public void onInitialize() {
        NeoItems.registerItems();
        NeoBlocks.registerBlocks();
        NeoRegistries.registerStrippable();
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_SAPLING, RenderLayer.getCutout());
        Registry.register(Registry.STATUS_EFFECT, new Identifier("notenoughorigins", "blight"), BLIGHT);
        Registry.register(Registry.SOUND_EVENT, Neo.ITEM_ARMOR_EQUIP_IRIDIUM, ARMOR_EQUIP_IRIDIUM);
        NeoConfiguredFeatures.registerConfiguredFeatures();
        NeoWorldGen.generateModWorldGen();
        NeoOreGeneration.generateOres();
        NeoPaintings.registerPaintings();
    }
}


