package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Compactium.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(TagInit.Blocks.COMPACTIUM_RESOURCE).add(BlockInit.COMPACTIUM_ORE.get());
        tag(TagInit.Blocks.COMPACTIUM_RESOURCE).add(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get());
    }

}
