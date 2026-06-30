package ru.tesmio.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import ru.tesmio.registry.ModBlocks;

public final class SovietClientMod implements ClientModInitializer {
    private static final String[] TRANSLUCENT_BLOCK_IDS = {
        "structural/ceramic_glass_blue",
        "structural/ceramic_glass_green",
        "structural/ceramic_glass_brown"
    };

    @Override
    public void onInitializeClient() {
        for (String id : TRANSLUCENT_BLOCK_IDS) {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.getBlock(id), RenderLayer.getTranslucent());
        }
    }
}
