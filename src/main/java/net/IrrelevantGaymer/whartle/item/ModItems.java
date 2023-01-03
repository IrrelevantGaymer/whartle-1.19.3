package net.IrrelevantGaymer.whartle.item;

import net.IrrelevantGaymer.whartle.WhartleMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WhartleMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WhartleMod.LOGGER.debug("Registering Mod Items for " + WhartleMod.MOD_ID);
    }
}
