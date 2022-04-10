package com.corespace.asp3x.compactium.core.world.gen;

import com.corespace.asp3x.compactium.core.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    // ore generation added via Biome Loading listener event
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        // adding the ore to the world generation
        base.add(ModPlacedFeatures.COMPACTIUM_ORE_PLACED);
    }
}
