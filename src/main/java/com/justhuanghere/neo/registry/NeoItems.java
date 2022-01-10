package com.justhuanghere.neo.registry;

import com.justhuanghere.neo.Neo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class NeoItems {

    public static final Item DINO_NUGGETS = new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().alwaysEdible().meat().hunger(3).saturationModifier(3.6f).build()));

    public static final Item CUBONE_SKULL = new Item(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).equipmentSlot(stack -> EquipmentSlot.HEAD));

    public static final Item PINE_CONE = new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.DECORATIONS));

    public static final Item PINE_NUTS = new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(0.5f).snack().build()));

    public static final BlockItem PINE_LOG = new BlockItem(NeoBlocks.PINE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_WOOD = new BlockItem(NeoBlocks.PINE_WOOD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_PLANKS = new BlockItem(NeoBlocks.PINE_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem STRIPPED_PINE_LOG = new BlockItem(NeoBlocks.STRIPPED_PINE_LOG, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem STRIPPED_PINE_WOOD = new BlockItem(NeoBlocks.STRIPPED_PINE_WOOD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_LEAVES = new BlockItem(NeoBlocks.PINE_LEAVES, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_STAIRS = new BlockItem(NeoBlocks.PINE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_SLAB = new BlockItem(NeoBlocks.PINE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_FENCE = new BlockItem(NeoBlocks.PINE_FENCE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_FENCE_GATE = new BlockItem(NeoBlocks.PINE_FENCE_GATE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_BUTTON = new BlockItem(NeoBlocks.PINE_BUTTON, new Item.Settings().group(ItemGroup.REDSTONE));

    public static final BlockItem PINE_PRESSURE_PLATE = new BlockItem(NeoBlocks.PINE_PRESSURE_PLATE, new Item.Settings().group(ItemGroup.REDSTONE));

    public static final BlockItem PINE_DOOR = new BlockItem(NeoBlocks.PINE_DOOR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final BlockItem PINE_TRAPDOOR = new BlockItem(NeoBlocks.PINE_TRAPDOOR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Item IRIDIUM = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));

    public static final BlockItem BLOCK_OF_IRIDIUM = new BlockItem(NeoBlocks.BLOCK_OF_IRIDIUM, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "dino_nuggets"), DINO_NUGGETS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "cubone_skull"), CUBONE_SKULL);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_cone"), PINE_CONE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_nuts"),PINE_NUTS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_log"),PINE_LOG);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_wood"),PINE_WOOD);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_planks"),PINE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"stripped_pine_log"),STRIPPED_PINE_LOG);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"stripped_pine_wood"),STRIPPED_PINE_WOOD);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_leaves"),PINE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_stairs"),PINE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_slab"),PINE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_fence"),PINE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_fence_gate"),PINE_FENCE_GATE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_button"),PINE_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_pressure_plate"),PINE_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_door"),PINE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins,"pine_trapdoor"),PINE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium"), IRIDIUM);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "block_of_iridium"), BLOCK_OF_IRIDIUM);
    }
}

