package com.corespace.asp3x.compactium.datagen.client.lang;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider {

    public ModEnUsProvider(DataGenerator generator) {
        super(generator, Compactium.MOD_ID, "en_us");
    }


    @Override
    protected void addTranslations() {
        // Item Groups
        add("itemGroup.compactium", "Compactium Mod");

        // Items
        add(ItemInit.COMPACTIUM_INGOT.get(), "Compactium Ingot");
        add(ItemInit.COMPACTIUM_RAW.get(), "Compactium Raw");
        add(ItemInit.COMPACTIUM_NUGGET.get(), "Compactium Nugget");
        add(ItemInit.COMPACTIUM_DUST.get(), "Compactium Dust");
        add(ItemInit.ENRICHED_COAL.get(), "Enriched Coal");

        // Blocks
        add(BlockInit.COMPACTIUM_ORE.get(), "Compactium Ore");
        add(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get(), "Compactium Deepslate Ore");
        add(BlockInit.COMPACTIUM_BLOCK.get(), "Compactium Block");
        add(BlockInit.COMPACTED_COBBLESTONE.get(), "Compacted Cobblestone");
        add(BlockInit.COMPACTED_DEEPSLATE.get(), "Compacted Deepslate");
        add(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get(), "Compacted Cobbled Deepslate");
        add(BlockInit.COMPACTED_DIRT.get(), "Compacted Dirt");
        add(BlockInit.COMPACTED_SAND.get(), "Compacted Sand");
        add(BlockInit.COMPACTED_STONE.get(), "Compacted Stone");
    }
}
