package com.corespace.asp3x.compactium.core.init;

import com.corespace.asp3x.compactium.Compactium;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    // Register for Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Compactium.MOD_ID);

    // Register for Block items
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    /* Register Blocks here */
    public static final RegistryObject<Block> COMPACTIUM_ORE = register("compactium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.STONE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Compactium.COMPACTIUM_TAB)));

    public static final RegistryObject<Block> COMPACTIUM_DEEPSLATE_ORE = register("compactium_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Compactium.COMPACTIUM_TAB)));

    public static final RegistryObject<Block> COMPACTIUM_BLOCK = register("compactium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN)
                    .requiresCorrectToolForDrops()
                    .strength(3.0f)
                    .sound(SoundType.METAL)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Compactium.COMPACTIUM_TAB)));

    /* Register Logic for the Block and Block Item */
    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
