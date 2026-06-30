package ru.tesmio.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import ru.tesmio.SovietMod;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ModItems {
    private static final String[] PORTED_ITEM_IDS = {
        "sandspray",
        "beige_dye",
        "beige2_dye",
        "sandspray_dust",
        "hammer",
        "dye_scrapper",
        "dye_scrapper_filler",
        "dye_brush",
        "adc_gasmask",
        "adc_jacket",
        "adc_legs",
        "adc_boots",
        "frame_big_tile",
        "frame_quad_tile",
        "frame_rest_tile",
        "frame_small_tile",
        "quad_tile",
        "big_tile",
        "rest_tile",
        "small_tile",
        "quad_tile_new",
        "big_tile_new",
        "rest_tile_new",
        "small_tile_new",
        "lino",
        "fluolamp",
        "fuel_canister",
        "toxic_water_bucket",
        "lead_scrap",
        "concrete_scrap",
        "wood_scrap",
        "rusty_scrap",
        "ceramic_shard",
        "armatures",
        "armature",
        "copper_scrap",
        "aluminum_scrap",
        "white_brick",
        "broken_white_brick",
        "cracked_yellow_brick",
        "broken_yellow_brick",
        "cracked_red_brick",
        "broken_red_brick",
        "platinum_sword",
        "platinum_hoe",
        "platinum_shovel",
        "platinum_axe",
        "platinum_pickaxe",
        "wire_cutters",
        "puller",
        "platol_sword",
        "platol_hoe",
        "platol_shovel",
        "platol_axe",
        "platol_pickaxe",
        "mortar",
        "pestle",
        "sieve",
        "key_door",
        "wrench",
        "variant_item",
        "aluminum_ingot",
        "copper_ingot",
        "silver_ingot",
        "palladium_ingot",
        "platol_ingot",
        "lead_ingot",
        "silicon_ingot",
        "aluminum_dust",
        "lead_dust",
        "small_lead_dust",
        "leadceramic_dust",
        "ceramic_dust",
        "platol_dust",
        "palladium_dust",
        "copper_dust",
        "silver_dust",
        "platinum_ingot",
        "diamond_dust",
        "gold_dust",
        "netherite_dust",
        "platinum_dust",
        "detail_scrap/dark_yellow_micro_dust",
        "detail_scrap/dark_red_micro_dust",
        "detail_scrap/dark_blue_micro_dust",
        "detail_scrap/dark_yellow_transistor_dust",
        "detail_scrap/dark_gray_transistor_dust",
        "detail_scrap/diode_black_dust",
        "detail_scrap/diode_gray_dust",
        "detail_scrap/black_micro_dust",
        "detail_scrap/red_condenser_dust",
        "detail_scrap/yellow_condenser_dust",
        "detail_scrap/green_condenser_dust",
        "detail_scrap/blue_condenser_dust",
        "detail_scrap/yellow_jack_dust",
        "detail_scrap/blue_jack_dust",
        "detail_scrap/green_jack_dust",
        "detail_scrap/orange_condenser_dust",
        "circuits/reochord",
        "circuits/dark_yellow_micro",
        "circuits/dark_red_micro",
        "circuits/dark_blue_micro",
        "circuits/dark_yellow_transistor",
        "circuits/dark_gray_transistor",
        "circuits/diode_black",
        "circuits/diode_gray",
        "circuits/black_micro",
        "circuits/red_condenser",
        "circuits/yellow_condenser",
        "leadceramic_tile",
        "circuits/green_condenser",
        "circuits/blue_condenser",
        "circuits/yellow_jack",
        "circuits/blue_jack",
        "circuits/green_jack",
        "circuits/orange_condenser"
    };

    private static final String[] TEMPORARY_MODEL_ITEM_IDS = {
        "cleaned/containment_door",
        "cleaned/containment_trapdoor",
        "cleaned/railing_door",
        "cleaned/rusty_iron_door",
        "flashlight",
        "flashlight_battery",
        "innerdeco/airlock_door",
        "innerdeco/aluminium_door",
        "innerdeco/circuit/copper_plate",
        "innerdeco/circuit/copper_plate_empty",
        "innerdeco/circuit/diamond_plate",
        "innerdeco/circuit/diamond_plate_empty",
        "innerdeco/circuit/gold_plate",
        "innerdeco/circuit/gold_plate_empty",
        "innerdeco/circuit/netherite_plate",
        "innerdeco/circuit/netherite_plate_empty",
        "innerdeco/circuit/plate_golden_jack",
        "innerdeco/circuit/plate_golden_jack_empty",
        "innerdeco/circuit/plate_platinum_jack",
        "innerdeco/circuit/plate_platinum_jack_empty",
        "innerdeco/circuit/platinum_plate",
        "innerdeco/circuit/platinum_plate_empty",
        "innerdeco/circuit/silver_plate",
        "innerdeco/circuit/silver_plate_empty",
        "innerdeco/containment_door",
        "innerdeco/containment_trapdoor",
        "innerdeco/dress_cabin",
        "innerdeco/furniture/bath_tube",
        "innerdeco/furniture/fridge",
        "innerdeco/furniture/iron_bed",
        "innerdeco/railing_door",
        "innerdeco/redstonewire/redstone_wire",
        "innerdeco/rusty_iron_door",
        "innerdeco/wood_door_1",
        "innerdeco/wood_door_2",
        "outerdeco/fences/concrete_fence",
        "outerdeco/fences/concrete_fence_high",
        "outerdeco/streetdeco/contact_wire",
        "placeable/dye_bucket",
        "rasty_frames"
    };

    private static final Map<String, Item> ITEMS = new LinkedHashMap<>();

    private ModItems() {
    }

    public static void register() {
        if (!ITEMS.isEmpty()) {
            return;
        }

        for (String id : PORTED_ITEM_IDS) {
            ITEMS.put(id, registerItem(id));
        }

        for (String id : TEMPORARY_MODEL_ITEM_IDS) {
            ITEMS.put(id, registerItem(id));
        }

        FuelRegistry.INSTANCE.add(get("wood_scrap"), 250);
    }

    public static Item get(String id) {
        return ITEMS.get(id);
    }

    public static Collection<Item> all() {
        return ITEMS.values();
    }

    public static int count() {
        return ITEMS.size();
    }

    private static Item registerItem(String id) {
        return Registry.register(Registries.ITEM, SovietMod.id(id), new Item(settingsFor(id)));
    }

    private static FabricItemSettings settingsFor(String id) {
        FabricItemSettings settings = new FabricItemSettings();
        if ("fuel_canister".equals(id) || "toxic_water_bucket".equals(id)) {
            settings.maxCount(1);
        }
        if ("puller".equals(id)) {
            settings.maxDamage(180);
        }
        return settings;
    }
}
