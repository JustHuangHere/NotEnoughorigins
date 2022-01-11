package com.justhuanghere.neo;

import com.justhuanghere.neo.registry.NeoBlocks;
import com.justhuanghere.neo.registry.NeoItems;
import com.justhuanghere.neo.registry.NeoRegistries;
import com.justhuanghere.neo.registry.NeoStatusEffect;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Neo implements ModInitializer {
    public static final String notenoughorigins = "notenoughorigins";
    public static final StatusEffect BLIGHT = new NeoStatusEffect();
    public static final Identifier ITEM_ARMOR_EQUIP_IRIDIUM = new Identifier("notenoughorigins:item.armor.equip_iridium");
    public static final SoundEvent ARMOR_EQUIP_IRIDIUM = new SoundEvent(ITEM_ARMOR_EQUIP_IRIDIUM);

    @Override
    public void onInitialize() {
        NeoItems.registerItems();
        NeoBlocks.registerBlocks();
        NeoRegistries.registerStrippable();
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NeoBlocks.PINE_DOOR, RenderLayer.getCutout());
        Registry.register(Registry.STATUS_EFFECT, new Identifier("notenoughorigins", "blight"), BLIGHT);
        Registry.register(Registry.SOUND_EVENT, Neo.ITEM_ARMOR_EQUIP_IRIDIUM, ARMOR_EQUIP_IRIDIUM);
        FlammableBlockRegistry.getDefaultInstance().add(NeoBlocks.PINE_PLANKS, 5, 20);
    }
}


