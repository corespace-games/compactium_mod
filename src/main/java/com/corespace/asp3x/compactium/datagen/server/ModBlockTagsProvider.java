package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Compactium.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        // adding resources to tag
        tag(TagInit.Blocks.COMPACTIUM_RESOURCE).add(BlockInit.COMPACTIUM_ORE.get());
        tag(TagInit.Blocks.COMPACTIUM_RESOURCE).add(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get());

        // adding Compacted blocks to tag
        tag(TagInit.Blocks.COMPACTED_BLOCKS).add(BlockInit.COMPACTED_COBBLESTONE.get());
        tag(TagInit.Blocks.COMPACTED_BLOCKS).add(BlockInit.COMPACTED_DEEPSLATE.get());
        tag(TagInit.Blocks.COMPACTED_BLOCKS).add(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get());
        tag(TagInit.Blocks.COMPACTED_BLOCKS).add(BlockInit.COMPACTED_DIRT.get());
        tag(TagInit.Blocks.COMPACTED_BLOCKS).add(BlockInit.COMPACTED_SAND.get());
        tag(TagInit.Blocks.COMPACTED_BLOCKS).add(BlockInit.COMPACTED_STONE.get());
    }

}
