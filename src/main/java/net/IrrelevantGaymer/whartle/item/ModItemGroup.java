package net.IrrelevantGaymer.whartle.item;

import net.IrrelevantGaymer.whartle.WhartleMod;
import net.IrrelevantGaymer.whartle.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup WHARTLE = FabricItemGroup.builder(new Identifier(WhartleMod.MOD_ID))
            .displayName(Text.literal("whartle_items"))
            .icon(() -> new ItemStack(ModBlocks.WHARTLE_SHELL_BLOCK))
            .build();
}