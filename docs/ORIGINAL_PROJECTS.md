# Original Projects And Attribution

This repository contains `soviet-era-fabric`, a Fabric 1.20.1 port workspace for Soviet Era.

## Source Projects

The current Fabric port was prepared from these original Forge projects:

- `SovietEra`
  - Minecraft/Forge generation: legacy Forge 1.12.2.
  - Role in this port: historical reference for older behavior and assets.

- `Soviet-Era-2`
  - Minecraft/Forge generation: Forge 1.16.5.
  - Role in this port: primary source for Java registrations, resources, assets, recipes, and data layout.

## Upstream Repository

The user-provided upstream/legacy repository URL is:

```text
https://github.com/PowerTronin/soviet-era-legacy
```

## Credited Authors And Contributors

The Fabric metadata currently credits:

- Tesmio
- Max_Freemen
- SlimeF
- Vincent11A
- Peresmechnic
- lrx1tp
- feulim

## Porting Notes

- The Fabric project name is `soviet-era-fabric`.
- The mod id remains `soviet` for compatibility with the original resource namespace and registry ids.
- Ported content is incremental. Many custom block classes, block entities, GUI systems, fluids, world generation systems, and custom machine recipes are still incomplete.
- Custom `soviet:crusher` and `soviet:affinage` recipes are parked under `src/legacy/resources` until their Fabric recipe serializers are ported.

For detailed current status, see `docs/FABRIC_PORT.md`.
