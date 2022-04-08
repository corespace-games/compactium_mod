package com.corespace.asp3x.compactium.core.init;

import com.corespace.asp3x.compactium.Compactium;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    private BlockInit() {}

    // create a item register variable
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Compactium.MOD_ID);

    // register a new block
    public static final RegistryObject<Block> COMPACTIUM_BLOCK = BLOCKS.register("compactium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLUE)
                    .strength(2.0f, 15f).requiresCorrectToolForDrops().friction(0.5f)));
}
