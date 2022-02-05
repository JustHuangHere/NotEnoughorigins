package com.justhuanghere.neo.registry;

import com.justhuanghere.neo.Neo;
import com.justhuanghere.neo.world.feature.tree.PineSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.minecraft.util.registry.Registry;

public class NeoBlocks {

    public static final Block PINE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));

    public static final Block PINE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));

    public static final Block PINE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    public static final Block STRIPPED_PINE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));

    public static final Block STRIPPED_PINE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block PINE_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));

    public static final Block PINE_STAIRS = new NeoStairsBlock(NeoBlocks.PINE_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS));

    public static final Block PINE_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB));

    public static final Block PINE_FENCE = new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE));

    public static final Block PINE_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE));

    public static final Block PINE_BUTTON = new NeoButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON));

    public static final Block PINE_PRESSURE_PLATE = new NeoPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final Block PINE_DOOR = new NeoDoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR).nonOpaque());

    public static final Block PINE_TRAPDOOR = new NeoTrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());

    public static final Block IRIDIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f)
            .resistance(6.0f).requiresTool());

    public static final Block IRIDIUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f).resistance(6.0f)
            .sounds(BlockSoundGroup.METAL).requiresTool());

    public static final Block DEEPSLATE_IRIDIUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE)
            .strength(4.5f).resistance(3.0f).mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).requiresTool());

    public static final Block PINE_SAPLING = new NeoSaplingBlock(new PineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));

    public static final Block PINE_WALL_SIGN = new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS), NeoSignTypes.PINE);

    public static final Block PINE_SIGN = new SignBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).noCollision(), NeoSignTypes.PINE);

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_log"), PINE_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_wood"), PINE_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_planks"), PINE_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "stripped_pine_log"), STRIPPED_PINE_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "stripped_pine_wood"), STRIPPED_PINE_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_leaves"), PINE_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_stairs"), PINE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_slab"), PINE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_fence"), PINE_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_fence_gate"), PINE_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_button"), PINE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_pressure_plate"), PINE_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_door"), PINE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_trapdoor"), PINE_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "iridium_block"), IRIDIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "iridium_ore"), IRIDIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "deepslate_iridium_ore"), DEEPSLATE_IRIDIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_sapling"), PINE_SAPLING);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_wall_sign"), PINE_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Neo.notenoughorigins, "pine_sign"), PINE_SIGN);
    }
}

