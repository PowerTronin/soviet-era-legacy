package ru.tesmio.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import ru.tesmio.SovietMod;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class ModBlocks {
    private static final String[] CONCRETE_BLOCK_IDS = {
        "concrete/concrete_orange",
        "concrete/concrete_blue",
        "concrete/concrete_red",
        "concrete/concrete_green",
        "concrete/concrete_gray",
        "concrete/concrete_beige",
        "concrete/concrete_beige2",
        "concrete/concrete_yellow",
        "concrete/concrete_white",
        "concrete/concrete_orange_br",
        "concrete/concrete_blue_br",
        "concrete/concrete_red_br",
        "concrete/concrete_green_br",
        "concrete/concrete_gray_br",
        "concrete/concrete_beige_br",
        "concrete/concrete_beige2_br",
        "concrete/concrete_yellow_br",
        "concrete/concrete_white_br"
    };

    private static final String[][] CONCRETE_STAIR_IDS = {
        {"stairs/concrete_gray_stairs", "concrete/concrete_gray"},
        {"stairs/concrete_green_stairs", "concrete/concrete_green"},
        {"stairs/concrete_blue_stairs", "concrete/concrete_blue"},
        {"stairs/concrete_beige_stairs", "concrete/concrete_beige"},
        {"stairs/concrete_beige2_stairs", "concrete/concrete_beige2"},
        {"stairs/concrete_red_stairs", "concrete/concrete_red"},
        {"stairs/concrete_orange_stairs", "concrete/concrete_orange"},
        {"stairs/concrete_yellow_stairs", "concrete/concrete_yellow"},
        {"stairs/concrete_white_stairs", "concrete/concrete_white"}
    };

    private static final String[][] CONCRETE_SLAB_IDS = {
        {"slabs/concrete_slab_gray", "concrete/concrete_gray"},
        {"slabs/concrete_slab_green", "concrete/concrete_green"},
        {"slabs/concrete_slab_blue", "concrete/concrete_blue"},
        {"slabs/concrete_slab_beige", "concrete/concrete_beige"},
        {"slabs/concrete_slab_beige2", "concrete/concrete_beige2"},
        {"slabs/concrete_slab_red", "concrete/concrete_red"},
        {"slabs/concrete_slab_orange", "concrete/concrete_orange"},
        {"slabs/concrete_slab_yellow", "concrete/concrete_yellow"},
        {"slabs/concrete_slab_white", "concrete/concrete_white"}
    };

    private static final String[] BRICK_BLOCK_IDS = {
        "brick/red_bricks_br",
        "brick/red_bricks",
        "brick/short_bricks",
        "brick/soviet_bricks_br",
        "brick/soviet_bricks",
        "brick/soviet_bricks_with_white",
        "brick/light_bricks2",
        "brick/light_bricks",
        "brick/light_bricks2_br",
        "brick/light_bricks_br",
        "brick/yellow_bricks_1_br",
        "brick/yellow_bricks_1",
        "brick/yellow_bricks_2_br",
        "brick/yellow_bricks_2",
        "brick/yellow_bricks_3_br",
        "brick/yellow_bricks_3",
        "brick/white_bricks",
        "brick/white_bricks_br",
        "brick/small_bricks"
    };

    private static final String[] TILE_BLOCK_IDS = {
        "horiztile/horiz_tile_blue",
        "horiztile/horiz_tile_blue_br",
        "horiztile/horiz_tile_white",
        "horiztile/horiz_tile_white_br",
        "horiztile/horiz_tile_dark_blue",
        "horiztile/horiz_tile_dark_blue_br",
        "smalltile/small_tile_blue",
        "smalltile/small_tile_blue_br",
        "smalltile/small_tile_white",
        "smalltile/small_tile_white_br",
        "smalltile/small_tile_red",
        "smalltile/small_tile_red_br",
        "smalltile/small_tile_yellow",
        "smalltile/small_tile_yellow_br",
        "mosaictile/tile_mosaic_1",
        "mosaictile/tile_mosaic_2",
        "quadtile/tile_quad_gray",
        "quadtile/tile_quad_white",
        "quadtile/tile_quad_blue",
        "quadtile/tile_quad_1_br",
        "quadtile/tile_quad_2_br",
        "quadtile/tile_quad_1",
        "quadtile/tile_quad_2",
        "quadtile/tile_quad_4",
        "quadtile/tile_quad_5",
        "quadtile/tile_quad_3",
        "quadtile/tile_quad_3_br",
        "quadtile/tile_quad_5_br",
        "quadtile/tile_quad_5_brf",
        "quadtile/tile_quad_concrete",
        "quadtile/tile_quad_blue_br",
        "quadtile/tile_quad_white_br",
        "resttile/tile_rest_dark_blue",
        "resttile/tile_rest_dark_blue_br",
        "resttile/tile_rest_blue",
        "resttile/tile_rest_blue_br",
        "resttile/tile_rest_black",
        "resttile/tile_rest_black_br",
        "resttile/tile_rest_brown",
        "resttile/tile_rest_brown_br",
        "resttile/tile_rest_white",
        "resttile/tile_rest_white_br",
        "regtile/tile_reg_brown",
        "regtile/tile_reg_brown_br",
        "regtile/tile_reg_lil",
        "regtile/tile_reg_lil_br",
        "regtile/tile_reg_am",
        "regtile/tile_reg_am_br",
        "structural/trim_tile_1",
        "structural/trim_tile_1_br",
        "structural/trim_tile_red",
        "structural/trim_tile_blue",
        "structural/leadceramic_tile"
    };

    private static final String[] LINO_BLOCK_IDS = {
        "lino/lino1",
        "lino/lino2",
        "lino/lino3",
        "lino/lino4",
        "lino/lino5",
        "lino/lino6",
        "lino/lino7",
        "lino/lino8"
    };

    private static final String[] STRUCTURAL_STONE_BLOCK_IDS = {
        "structural/trim_stone_1",
        "structural/trim_stone_2",
        "structural/trim_stone_3",
        "structural/trim_stone_4",
        "structural/concrete_plate"
    };

    private static final String[] STRUCTURAL_PANEL_BLOCK_IDS = {
        "structural/panel_concrete",
        "structural/panel_concrete_yellow",
        "structural/panel_tile"
    };

    private static final String[] CERAMIC_GLASS_BLOCK_IDS = {
        "structural/ceramic_glass_blue",
        "structural/ceramic_glass_green",
        "structural/ceramic_glass_brown"
    };

    private static final String[] WOOD_BLOCK_IDS = {
        "structural/parquet_block",
        "structural/parquet_block_diagonal"
    };

    private static final String[] METAL_BLOCK_IDS = {
        "structural/trim_metal_1",
        "structural/trim_metal_2",
        "structural/rusty_block",
        "structural/containment_block",
        "cleaned/cleaned_rusty_block",
        "cleaned/cleaned_containment_block"
    };

    private static final Map<String, Block> BLOCKS = new LinkedHashMap<>();
    private static final Map<String, Item> BLOCK_ITEMS = new LinkedHashMap<>();

    private ModBlocks() {
    }

    public static void register() {
        if (!BLOCKS.isEmpty()) {
            return;
        }

        registerBlocks(CONCRETE_BLOCK_IDS, ModBlocks::concreteSettings);
        registerStairs(CONCRETE_STAIR_IDS);
        registerSlabs(CONCRETE_SLAB_IDS);
        registerBlocks(BRICK_BLOCK_IDS, ModBlocks::brickSettings);
        registerBlocks(TILE_BLOCK_IDS, ModBlocks::tileSettings);
        registerBlocks(LINO_BLOCK_IDS, ModBlocks::linoSettings);
        registerBlocks(STRUCTURAL_STONE_BLOCK_IDS, ModBlocks::tileSettings);
        registerBlocks(STRUCTURAL_PANEL_BLOCK_IDS, ModBlocks::brickSettings);
        registerBlocks(CERAMIC_GLASS_BLOCK_IDS, ModBlocks::glassSettings);
        registerBlocks(WOOD_BLOCK_IDS, ModBlocks::woodSettings);
        registerBlocks(METAL_BLOCK_IDS, ModBlocks::metalSettings);
    }

    public static Block getBlock(String id) {
        return BLOCKS.get(id);
    }

    public static Item getBlockItem(String id) {
        return BLOCK_ITEMS.get(id);
    }

    public static Collection<Item> blockItems() {
        return BLOCK_ITEMS.values();
    }

    public static int count() {
        return BLOCKS.size();
    }

    private static void registerBlocks(String[] ids, Supplier<FabricBlockSettings> settingsFactory) {
        for (String id : ids) {
            registerBasicBlock(id, settingsFactory);
        }
    }

    private static void registerBasicBlock(String id, Supplier<FabricBlockSettings> settingsFactory) {
        registerBlock(id, new Block(settingsFactory.get()));
    }

    private static void registerStairs(String[][] ids) {
        for (String[] idPair : ids) {
            Block baseBlock = BLOCKS.get(idPair[1]);
            registerBlock(idPair[0], new StairsBlock(baseBlock.getDefaultState(), concreteSettings()));
        }
    }

    private static void registerSlabs(String[][] ids) {
        for (String[] idPair : ids) {
            registerBlock(idPair[0], new SlabBlock(concreteSettings()));
        }
    }

    private static void registerBlock(String id, Block block) {
        Registry.register(Registries.BLOCK, SovietMod.id(id), block);
        Item item = Registry.register(Registries.ITEM, SovietMod.id(id), new BlockItem(block, new FabricItemSettings()));

        BLOCKS.put(id, block);
        BLOCK_ITEMS.put(id, item);
    }

    private static FabricBlockSettings concreteSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(6.0F, 16.0F)
            .sounds(BlockSoundGroup.STONE);
    }

    private static FabricBlockSettings brickSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(3.0F, 8.0F)
            .sounds(BlockSoundGroup.STONE);
    }

    private static FabricBlockSettings tileSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(5.5F, 15.0F)
            .sounds(BlockSoundGroup.STONE);
    }

    private static FabricBlockSettings linoSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(1.0F, 2.0F)
            .sounds(BlockSoundGroup.WOOL);
    }

    private static FabricBlockSettings woodSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(5.5F, 15.0F)
            .sounds(BlockSoundGroup.WOOD);
    }

    private static FabricBlockSettings glassSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(1.0F, 2.0F)
            .sounds(BlockSoundGroup.GLASS)
            .nonOpaque();
    }

    private static FabricBlockSettings metalSettings() {
        return FabricBlockSettings.create()
            .requiresTool()
            .strength(3.0F, 8.0F)
            .sounds(BlockSoundGroup.METAL);
    }
}
