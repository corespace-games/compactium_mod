package com.corespace.asp3x.compactium.datagen.client.lang;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModDeDeProvider extends LanguageProvider{

    public ModDeDeProvider(DataGenerator generator) { super(generator, Compactium.MOD_ID, "de_de"); }

    @Override
    protected void addTranslations() {
        // Item Groups
        add("itemGroup.compactium", "Compactium Mod");

        // Items
        add(ItemInit.COMPACTIUM_INGOT.get(), "Compactium Barren");
        add(ItemInit.COMPACTIUM_RAW.get(), "Rohes Compactium");
        add(ItemInit.COMPACTIUM_NUGGET.get(), "Compactium Klumpen");

        // Blocks
        add(BlockInit.COMPACTIUM_ORE.get(), "Compactium Erz");
        add(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get(), "Compactium Deepslate Erz");
        add(BlockInit.COMPACTIUM_BLOCK.get(), "Compactium Block");
        add(BlockInit.COMPACTED_COBBLESTONE.get(), "Verdichteter Bruchstein");
    }
}