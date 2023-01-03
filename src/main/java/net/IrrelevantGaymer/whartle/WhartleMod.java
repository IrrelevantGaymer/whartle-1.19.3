package net.IrrelevantGaymer.whartle;

import net.IrrelevantGaymer.whartle.block.ModBlocks;
import net.IrrelevantGaymer.whartle.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhartleMod implements ModInitializer {
	public static final String MOD_ID = "whartle";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlcoks();
	}
}
