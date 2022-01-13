package com.justhuanghere.neo.registry;

import com.justhuanghere.neo.Neo;
import com.justhuanghere.neo.util.CustomBoatType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class NeoItems {

    public static final Item DINO_NUGGETS = new Item(new FabricItemSettings().maxCount(64).group(ItemGroup.FOOD)
            .food(NeoFoodComponent.DINO_NUGGETS));

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

    public static final Item IRIDIUM = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64).fireproof());

    public static final BlockItem IRIDIUM_BLOCK = new BlockItem(NeoBlocks.IRIDIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    public static final BlockItem IRIDIUM_ORE = new BlockItem(NeoBlocks.IRIDIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    public static final BlockItem DEEPSLATE_IRIDIUM_ORE = new BlockItem(NeoBlocks.DEEPSLATE_IRIDIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    public static final Item IRIDIUM_SWORD = new SwordItem(NeoToolMaterial.IRIDIUM, 3, -2.4F,
            new FabricItemSettings().group(ItemGroup.COMBAT).fireproof());

    public static final Item IRIDIUM_SHOVEL = new ShovelItem(NeoToolMaterial.IRIDIUM, 1.5F, -3.0F,
            new FabricItemSettings().group(ItemGroup.TOOLS).fireproof());

    public static final Item IRIDIUM_PICKAXE = new NeoModPickaxe(NeoToolMaterial.IRIDIUM, 1, -2.8F,
            new FabricItemSettings().group(ItemGroup.TOOLS).fireproof());

    public static final Item IRIDIUM_AXE = new NeoModAxe(NeoToolMaterial.IRIDIUM, 5.0F, -3.0F,
            new FabricItemSettings().group(ItemGroup.TOOLS).fireproof());

    public static final Item IRIDIUM_HOE = new NeoModHoe(NeoToolMaterial.IRIDIUM, -4, 0.0F,
            new FabricItemSettings().group(ItemGroup.TOOLS).fireproof());

    public static final Item IRIDIUM_HELMET = new ArmorItem(NeoArmorMaterial.IRIDIUM, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Item IRIDIUM_CHESTPLATE = new ArmorItem(NeoArmorMaterial.IRIDIUM, EquipmentSlot.CHEST,
            new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Item IRIDIUM_LEGGINGS = new ArmorItem(NeoArmorMaterial.IRIDIUM, EquipmentSlot.LEGS,
            new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Item IRIDIUM_BOOTS = new ArmorItem(NeoArmorMaterial.IRIDIUM, EquipmentSlot.FEET,
            new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Item PINE_BOAT = new BoatItem(CustomBoatType.PINE, new Item.Settings().maxCount(1).group(ItemGroup.TRANSPORTATION));

    public static final Item COFFEE_BEANS = new AliasedBlockItem(NeoBlocks.COFFEE, new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item CRONUS_ICON = new Item(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC));

    public static final Item EMPTY_GLASS = new GlassBottleItem(new FabricItemSettings().group(ItemGroup.BREWING).maxCount(16));

    public static final Item LATTE = new LatteItem(new FabricItemSettings().recipeRemainder(NeoItems.EMPTY_GLASS)
            .group(ItemGroup.FOOD).maxCount(16).food(NeoFoodComponent.LATTE));

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
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_block"), IRIDIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_ore"), IRIDIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "deepslate_iridium_ore"), DEEPSLATE_IRIDIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_sword"), IRIDIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_shovel"), IRIDIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_pickaxe"), IRIDIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_axe"), IRIDIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_hoe"), IRIDIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_helmet"), IRIDIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_chestplate"), IRIDIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_leggings"), IRIDIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "iridium_boots"), IRIDIUM_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "pine_boat"), PINE_BOAT);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "coffee_beans"), COFFEE_BEANS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "cronus_icon"), CRONUS_ICON);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "empty_glass"), EMPTY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(Neo.notenoughorigins, "latte"), LATTE);
    }
}

