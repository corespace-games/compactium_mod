package com.corespace.asp3x.compactium.core.init;

import com.corespace.asp3x.compactium.Compactium;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // create a item register variable
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Compactium.MOD_ID);

    public static final RegistryObject<Item> COMPACTIUM_ITEM = ITEMS.register("compactium_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


    /* Init Block Items */
    public static final RegistryObject<BlockItem> COMPACTIUM_BLOCK_ITEM = ITEMS.register("compactium_block_item",
            () -> new BlockItem(BlockInit.COMPACTIUM_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
