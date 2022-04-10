package com.corespace.asp3x.compactium.core.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    // applying the configured features to the overworld ore placement
    public static final Holder<PlacedFeature> COMPACTIUM_ORE_PLACED = PlacementUtils.register("compactium_ore_placed",
            ModConfiguredFeatures.COMPACTIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120))));

}
