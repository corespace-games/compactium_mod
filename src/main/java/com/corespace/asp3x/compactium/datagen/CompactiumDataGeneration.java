package com.corespace.asp3x.compactium.datagen;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.datagen.client.ModBlockStateProvider;
import com.corespace.asp3x.compactium.datagen.client.ModItemModelProvider;
import com.corespace.asp3x.compactium.datagen.client.lang.ModDeDeProvider;
import com.corespace.asp3x.compactium.datagen.client.lang.ModEnUsProvider;
import com.corespace.asp3x.compactium.datagen.server.ModBlockTagsProvider;
import com.corespace.asp3x.compactium.datagen.server.ModItemTagsProvider;
import com.corespace.asp3x.compactium.datagen.server.ModLootTableProvider;
import com.corespace.asp3x.compactium.datagen.server.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Compactium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompactiumDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            // Client Data Generation
            generator.addProvider(new ModBlockStateProvider(generator, helper));
            generator.addProvider(new ModItemModelProvider(generator, helper));
            generator.addProvider(new ModEnUsProvider(generator));
            generator.addProvider(new ModDeDeProvider(generator));
        }
        if (event.includeServer()) {
            ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);

            // Server Data Generation
            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(blockTags);
            generator.addProvider(new ModItemTagsProvider(generator, blockTags, helper));
            generator.addProvider(new ModLootTableProvider(generator));
        }
    }
}
