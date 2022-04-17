package com.corespace.asp3x.compactium.datagen.client;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Compactium.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.COMPACTIUM_ORE.get());
        simpleBlock(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get());
        simpleBlock(BlockInit.COMPACTIUM_BLOCK.get());
        simpleBlock(BlockInit.COMPACTED_COBBLESTONE.get());
        simpleBlock(BlockInit.COMPACTED_DEEPSLATE.get());
        simpleBlock(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get());
        simpleBlock(BlockInit.COMPACTED_DIRT.get());
    }
}
