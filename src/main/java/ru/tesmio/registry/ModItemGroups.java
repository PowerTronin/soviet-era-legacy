package ru.tesmio.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import ru.tesmio.SovietMod;

public final class ModItemGroups {
    private ModItemGroups() {
    }

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, SovietMod.id("main"), FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.soviet_main"))
            .icon(() -> new ItemStack(ModBlocks.getBlockItem("concrete/concrete_gray")))
            .entries((context, entries) -> ModBlocks.blockItems().forEach(entries::add))
            .build());

        Registry.register(Registries.ITEM_GROUP, SovietMod.id("items"), FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.soviet_items"))
            .icon(() -> new ItemStack(ModItems.get("key_door")))
            .entries((context, entries) -> ModItems.all().forEach(entries::add))
            .build());
    }
}
