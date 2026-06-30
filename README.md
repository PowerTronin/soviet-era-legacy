# soviet-era-fabric

Fabric 1.20.1 port workspace for Soviet Era.

This repository currently contains the active Fabric port project. The mod id and resource namespace remain `soviet` so existing assets, data paths, and registry ids keep their legacy identity.

## Original Projects

This port is based on two original Minecraft Forge projects:

- `SovietEra` - legacy Forge 1.12.2 project.
- `Soviet-Era-2` - Forge 1.16.5 project used as the primary porting source.

The original project authors and contributors are credited in `fabric.mod.json` and in `docs/ORIGINAL_PROJECTS.md`. This Fabric port should not be treated as a clean-room rewrite; it preserves and ports assets, ids, and data from the original Soviet Era projects.

## Current Target

- Minecraft: `1.20.1`
- Loader: Fabric
- Java: `17`
- Gradle project name: `soviet-era-fabric`
- Main artifact: `soviet-era-fabric-0.1.0-fabric-port.jar`

## Build

```bash
./gradlew clean build
```

The built jar is written to:

```text
build/libs/soviet-era-fabric-0.1.0-fabric-port.jar
```

## Port Status

See `docs/FABRIC_PORT.md` for the current migration status, validation results, and known missing systems.

At the time of this push, the port builds successfully and Power Mine static diagnostics report no model, blockstate, texture, or metadata issues for the current jar.

## License And Credits

See `LICENSE` for the repository license. Original Soviet Era project copyrights and credits remain with their original authors and contributors.
