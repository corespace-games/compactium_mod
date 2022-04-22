package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class ModCraftingRecipeProvider extends RecipeProvider {

    public ModCraftingRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        // Crafting Recipes Shaped
        // add crafting recipe for compactium_block from the ingot
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTIUM_BLOCK.get().asItem())
                .define('#', ItemInit.COMPACTIUM_INGOT.get())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_BLOCK.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_BLOCK.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTIUM_BLOCK.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath()));

        // add crafting recipe for compactium_ingot from the nugget
        ShapedRecipeBuilder.shaped(ItemInit.COMPACTIUM_INGOT.get())
                .define('#', ItemInit.COMPACTIUM_NUGGET.get())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_INGOT.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath()));

        // add crafting recipe for compacted_cobblestone from cobblestone
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTED_COBBLESTONE.get().asItem())
                .define('#', Blocks.COBBLESTONE.asItem())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTED_COBBLESTONE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTED_COBBLESTONE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTED_COBBLESTONE.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(Blocks.COBBLESTONE.getRegistryName()).getPath()));

        // add crafting recipe for compacted_deepslate from deepslate
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTED_DEEPSLATE.get().asItem())
                .define('#', Blocks.DEEPSLATE.asItem())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTED_DEEPSLATE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTED_DEEPSLATE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTED_DEEPSLATE.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(Blocks.DEEPSLATE.getRegistryName()).getPath()));

        // add crafting recipe for compacted_cobbled_deepslate from cobbled_deepslate
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().asItem())
                .define('#', Blocks.COBBLED_DEEPSLATE.asItem())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(Blocks.COBBLED_DEEPSLATE.getRegistryName()).getPath()));

        // add crafting recipe for compacted_dirt from dirt
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTED_DIRT.get().asItem())
                .define('#', Blocks.DIRT.asItem())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTED_DIRT.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTED_DIRT.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTED_DIRT.get().getRegistryName()).getPath() + "_from_" +
                        Objects.requireNonNull(Blocks.DIRT.getRegistryName()).getPath()));

        // add crafting recipe for compacted_sand from sand
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTED_SAND.get().asItem())
                .define('#', Blocks.SAND.asItem())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTED_SAND.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTED_SAND.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTED_SAND.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(Blocks.SAND.getRegistryName()).getPath()));

        // add crafting recipe for compacted_stone from stone
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTED_STONE.get().asItem())
                .define('#', Blocks.STONE.asItem())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTED_STONE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTED_STONE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTED_STONE.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(Blocks.STONE.getRegistryName()).getPath()));

        // add crafting recipe for enriched_coal from coal and compactium_dust
        ShapedRecipeBuilder.shaped(ItemInit.ENRICHED_COAL.get())
                .define('#', ItemInit.COMPACTIUM_DUST.get())
                .define('C', Items.COAL.asItem())
                .pattern("###").pattern("#C#").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_DUST.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_DUST.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.ENRICHED_COAL.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(ItemInit.COMPACTIUM_DUST.get().getRegistryName()).getPath() + "_and_" +
                                Objects.requireNonNull(Items.COAL.asItem().getRegistryName()).getPath()));


        // Crafting Recipes Shapeless
        // add crafting recipe for compactium_ingot from compactium_block
        ShapelessRecipeBuilder.shapeless(ItemInit.COMPACTIUM_INGOT.get(), 9)
                .requires(BlockInit.COMPACTIUM_BLOCK.get().asItem())
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_INGOT.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_BLOCK.get().asItem()));

        // add crafting recipe for compactium_nugget from compactium_ingot
        ShapelessRecipeBuilder.shapeless(ItemInit.COMPACTIUM_NUGGET.get(), 9)
                .requires(ItemInit.COMPACTIUM_INGOT.get())
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_NUGGET.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath()));

        // add crafting recipe for cobblestone from compacted_cobblestone
        ShapelessRecipeBuilder.shapeless(Blocks.COBBLESTONE.asItem(), 9)
                .requires(BlockInit.COMPACTED_COBBLESTONE.get().asItem())
                .unlockedBy("has_" + Blocks.COBBLESTONE.getRegistryName().getPath(),
                        has(Blocks.COBBLESTONE.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.COBBLESTONE.getRegistryName().getPath() + "_from_" +
                                Objects.requireNonNull(BlockInit.COMPACTED_COBBLESTONE.get().getRegistryName()).getPath()));

        // add crafting recipe for deepslate from compacted_deepslate
        ShapelessRecipeBuilder.shapeless(Blocks.DEEPSLATE.asItem(), 9)
                .requires(BlockInit.COMPACTED_DEEPSLATE.get().asItem())
                .unlockedBy("has_" + Blocks.DEEPSLATE.getRegistryName().getPath(),
                        has(Blocks.DEEPSLATE.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.DEEPSLATE.getRegistryName().getPath() + "_from_" +
                        Objects.requireNonNull(BlockInit.COMPACTED_DEEPSLATE.get().getRegistryName()).getPath()));

        // add crafting recipe for cobbled_deepslate from compacted_cobbled_deepslate
        ShapelessRecipeBuilder.shapeless(Blocks.COBBLED_DEEPSLATE.asItem(), 9)
                .requires(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().asItem())
                .unlockedBy("has_" + Blocks.COBBLED_DEEPSLATE.getRegistryName().getPath(),
                        has(Blocks.COBBLED_DEEPSLATE.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.COBBLED_DEEPSLATE.getRegistryName().getPath() + "_from_" +
                        Objects.requireNonNull(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().getRegistryName()).getPath()));

        // add crafting recipe for dirt from compacted_dirt
        ShapelessRecipeBuilder.shapeless(Blocks.DIRT.asItem(), 9)
                .requires(BlockInit.COMPACTED_DIRT.get().asItem())
                .unlockedBy("has_" + Blocks.DIRT.getRegistryName().getPath(),
                        has(Blocks.DIRT.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.DIRT.getRegistryName().getPath() + "_from_" +
                        Objects.requireNonNull(BlockInit.COMPACTED_DIRT.get().getRegistryName()).getPath()));

        // add crafting recipe for sand from compacted_sand
        ShapelessRecipeBuilder.shapeless(Blocks.SAND.asItem(), 9)
                .requires(BlockInit.COMPACTED_SAND.get().asItem())
                .unlockedBy("has_" + Blocks.DIRT.getRegistryName().getPath(),
                        has(Blocks.SAND.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.SAND.getRegistryName().getPath() + "_from_" +
                                Objects.requireNonNull(BlockInit.COMPACTED_SAND.get().getRegistryName()).getPath()));

        // add crafting recipe for stone from compacted_stone
        ShapelessRecipeBuilder.shapeless(Blocks.STONE.asItem(), 9)
                .requires(BlockInit.COMPACTED_STONE.get().asItem())
                .unlockedBy("has_" + Blocks.DIRT.getRegistryName().getPath(),
                        has(Blocks.STONE.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.STONE.getRegistryName().getPath() + "_from_" +
                                Objects.requireNonNull(BlockInit.COMPACTED_STONE.get().getRegistryName()).getPath()));
    }
}
