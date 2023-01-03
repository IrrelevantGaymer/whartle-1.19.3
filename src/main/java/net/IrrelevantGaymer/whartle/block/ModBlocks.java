package net.IrrelevantGaymer.whartle.block;

import net.IrrelevantGaymer.whartle.WhartleMod;
import net.IrrelevantGaymer.whartle.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block WHARTLE_SHELL_BLOCK = registerBlock("whartle_shell_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(12f)
                    .requiresTool()),
            ModItemGroup.WHARTLE);

    public static final Block WHARTLE_FADED_SHELL_BLOCK = registerBlock("whartle_faded_shell_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(12f)
                    .requiresTool()),
            ModItemGroup.WHARTLE);

    public static final Block WHARTLE_HEXED_SHELL_BLOCK = registerBlock("whartle_hexed_shell_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(12f)
                    .requiresTool()),
            ModItemGroup.WHARTLE);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(WhartleMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(block));

        return Registry.register(Registries.ITEM, new Identifier(WhartleMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlcoks() {
        WhartleMod.LOGGER.debug("Registering ModBlocks for " + WhartleMod.MOD_ID);
    }
}
