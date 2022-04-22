package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import com.corespace.asp3x.compactium.core.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blocks, ExistingFileHelper helper) {
        super(generator, blocks, Compactium.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(TagInit.Items.COMPACTIUM_RESOURCE).add(ItemInit.COMPACTIUM_RAW.get());
        tag(TagInit.Items.COMPACTIUM_RESOURCE).add(ItemInit.COMPACTIUM_INGOT.get());
        tag(TagInit.Items.COMPACTIUM_RESOURCE).add(ItemInit.COMPACTIUM_NUGGET.get());
        tag(TagInit.Items.COMPACTIUM_RESOURCE).add(ItemInit.COMPACTIUM_DUST.get());
    }

}
