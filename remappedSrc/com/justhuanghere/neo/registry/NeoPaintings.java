package com.justhuanghere.neo.registry;

import com.justhuanghere.neo.Neo;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NeoPaintings {
    public static final PaintingMotive SATURN = registerPainting("saturn", new PaintingMotive(64, 32));
    public static final PaintingMotive TRAIN = registerPainting("train", new PaintingMotive(64, 48));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Neo.notenoughorigins, name), paintingMotive);
    }

    public static void registerPaintings() {
        System.out.println("Registering Paintings for " + Neo.notenoughorigins);
    }
}

