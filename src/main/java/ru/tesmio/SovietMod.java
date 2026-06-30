package ru.tesmio;

import net.fabricmc.api.ModInitializer;
import ru.tesmio.registry.ModBlocks;
import ru.tesmio.registry.ModItemGroups;
import ru.tesmio.registry.ModItems;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SovietMod implements ModInitializer {
    public static final String MOD_ID = "soviet";
    public static final Logger LOGGER = LoggerFactory.getLogger("Soviet Era Fabric");

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModItemGroups.register();
        LOGGER.info("Initialized {} with {} block registrations and {} item registrations.",
            MOD_ID,
            ModBlocks.count(),
            ModItems.count());
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
