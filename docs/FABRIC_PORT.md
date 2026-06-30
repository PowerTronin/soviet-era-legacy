# Soviet Era Fabric 1.20.1 Port

This project is the Fabric 1.20.1 port workspace for Soviet Era.

## Current State

- Minecraft: `1.20.1`
- Yarn mappings: `1.20.1+build.10`
- Fabric Loader: dev dependency `0.19.3`, runtime metadata minimum `>=0.19.2`
- Fabric API: dev dependency `0.92.9+1.20.1`, runtime metadata minimum `>=0.92.8+1.20.1`
- Fabric Loom: `1.10.5`
- Gradle wrapper: `8.12.1`
- Java target: `17`

The project currently builds successfully with:

```bash
./gradlew build
```

## Migrated So Far

- Fabric build scaffold and `fabric.mod.json`.
- Resource pack metadata updated to `pack_format` 15 for Minecraft 1.20.1.
- Assets and data copied from `Soviet-Era-2`, excluding Forge metadata and Forge global loot modifiers.
- Empty mixin config updated to Java 17 compatibility.
- Fabric registration for the active item IDs from the old `RegItems`.
- Temporary item registrations for model-only block item IDs until their blocks are ported.
- Generated missing `models/item/*.json` files for texture-only items. The project now has 288 item model JSON files, including ported block item models.
- Fabric registration for 117 simple cube blocks from `RegBlocks`:
  concrete, bricks, horizontal/small/mosaic/quad/rest/regular tiles, lino, simple structural panels/trim blocks, ceramic glass, parquet, metal blocks, and two cleaned metal blocks.
- Fabric registration for 18 vanilla-geometry concrete stairs and slabs from `RegBlocks`.
- Client render-layer registration for the three translucent ceramic glass blocks.
- Generated full-cube blockstates, block models, and block item models for the registered full-cube block set.
- Generated vanilla stairs/slab blockstates and models from Minecraft 1.20.1 templates for the concrete stairs/slabs.
- Added Minecraft block tags for the registered full-cube blocks:
  `minecraft:mineable/pickaxe`, `minecraft:mineable/axe`, and `minecraft:needs_iron_tool`.
- Added the concrete stairs/slabs to the relevant block mining tags.
- Registered `wood_scrap` as Fabric fuel for 250 ticks.
- Fabric creative tabs using the existing `itemGroup.soviet_main` and `itemGroup.soviet_items` localization keys.
- Fixed stale 1.16-era model references such as namespace-less vanilla parents/textures and moved `structural`/`mech` texture paths.
- Made the parked `minecraft:water` fluid tag entries for unported toxic water optional, avoiding runtime missing-tag errors until fluids are ported.
- Moved 46 custom `soviet:crusher` and `soviet:affinage` recipes to `src/legacy/resources` until their Fabric recipe serializers are ported.
- Power Mine MCP `diagnose_mod_content` reports `0` issues and `0` warnings for the current jar:
  1178 models, 440 blockstates, 464 textures, and 0 runtime recipes.
- Power Mine MCP `diagnose_mod` reports `0` issues and `0` warnings against the selected Fabric 1.20.1 profile.
- Power Mine agent runtime smoke loaded the selected Fabric 1.20.1 profile, initialized `soviet` with 135 block registrations and 156 item registrations,
  and verified `soviet:stairs/concrete_gray_stairs`, `soviet:slabs/concrete_slab_gray`, and `soviet:structural/ceramic_glass_blue` held/block render paths with `missingModel=false`.

## Not Migrated Yet

- Forge `DeferredRegister` and `RegistryObject` registries.
- Most complex blocks and block items from `RegBlocks`. The current Fabric registry covers simple cube blocks, translucent ceramic glass, and concrete stairs/slabs.
- `quadtile/tile_quad_6` is still skipped because the source resources do not include `textures/block/quadtile/tile_quad_6.png`.
- Custom block classes, block states, and custom shapes.
- Block entities, inventories, screen handlers, and screens.
- Crusher and affinage recipe serializers. Their JSON data is parked under `src/legacy/resources`.
- Energy storage and transfer.
- Fluids.
- Real behavior for tools, armor, dye tools, `sandspray`, `toxic_water_bucket`, and other custom item classes. Most are currently registered as plain items so their IDs and models load.
- Entities and renderers.
- Structures, world generation, and loot injection.
- JEI integration. Use EMI/REI/JEI Fabric later, depending on the target modpack ecosystem.
- Access transformer replacements. Use access wideners or mixins where still necessary.

## Recommended Port Order

1. Port simple items completely, including generated item models for texture-only items.
2. Port simple blocks by category, starting with full cube decorative blocks.
3. Port shaped/custom model blocks only after their Fabric block state properties exist.
4. Port block entities and screens after block registration is stable.
5. Port custom recipe serializers for crusher and affinage.
6. Port structures and world generation using 1.20.1 structure set/template pool APIs.
7. Port energy to a Fabric-compatible API, preferably Team Reborn Energy or Fabric Transfer API.
8. Add runtime smoke tests in a Fabric client world after each major category.

## Forge To Fabric Replacement Notes

- `@Mod` entrypoint -> `ModInitializer` in `fabric.mod.json`.
- `DeferredRegister` / `RegistryObject` -> `Registry.register` and explicit holder fields.
- `ItemGroup` -> Fabric item group API.
- `Container` / `Screen` -> `ScreenHandler` / `HandledScreen`.
- Forge capabilities -> Fabric Transfer API, Cardinal Components, or a local interface.
- Forge global loot modifiers -> Fabric loot table modify events or datapack loot table overrides.
- Access transformer -> access widener or mixin.
