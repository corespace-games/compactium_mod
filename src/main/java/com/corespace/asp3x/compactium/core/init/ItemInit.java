package com.corespace.asp3x.compactium.core.init;

import com.corespace.asp3x.compactium.Compactium;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    // create a item register variable
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Compactium.MOD_ID);

    public static final RegistryObject<Item> COMPACTIUM_RAW = register("compactium_raw",
            () -> new Item(new Item.Properties()
                    .tab(Compactium.COMPACTIUM_TAB)));

    public static final RegistryObject<Item> COMPACTIUM_INGOT = register("compactium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(Compactium.COMPACTIUM_TAB)));

    public static final RegistryObject<Item> COMPACTIUM_NUGGET = register("compactium_nugget",
            () -> new Item(new Item.Properties()
                    .tab(Compactium.COMPACTIUM_TAB)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
