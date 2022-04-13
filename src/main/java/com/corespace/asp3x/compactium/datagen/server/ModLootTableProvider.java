package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import com.corespace.asp3x.compactium.datagen.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModLootTableProvider extends BaseLootTableProvider {

    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        dropSelf(BlockInit.COMPACTIUM_BLOCK.get());
        dropSelf(BlockInit.COMPACTED_COBBLESTONE.get());

        silkTouch(BlockInit.COMPACTIUM_ORE.get(), ItemInit.COMPACTIUM_RAW.get(), 1, 4);
        silkTouch(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get(), ItemInit.COMPACTIUM_RAW.get(), 1, 4);
    }

    protected void silkTouch(Block block, Item item, int min, int max) {
        add(block, createSilkTouchTable(block.getRegistryName().getPath(),
                block, item, min, max));
    }

    protected void dropSelf(Block block) {
        add(block, createSimpleTable(block.getRegistryName().getPath(), block));
    }

}
