package com.corespace.asp3x.compactium.core.world.feature;

import com.corespace.asp3x.compactium.core.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    // adding ore blocks that should be generated in the overworld
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COMPACTIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.COMPACTIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().defaultBlockState())
    );

    // register the overworld ores and the max size of the ore patches
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COMPACTIUM_ORE = FeatureUtils.register("compactium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_COMPACTIUM_ORES, 9));

}
