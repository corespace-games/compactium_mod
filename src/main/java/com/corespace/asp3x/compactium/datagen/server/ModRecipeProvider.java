package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generator) {
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

        ShapelessRecipeBuilder.shapeless(Blocks.COBBLED_DEEPSLATE.asItem(), 9)
                .requires(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().asItem())
                .unlockedBy("has_" + Blocks.COBBLED_DEEPSLATE.getRegistryName().getPath(),
                        has(Blocks.COBBLED_DEEPSLATE.asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Blocks.COBBLED_DEEPSLATE.getRegistryName().getPath() + "_from_" +
                        Objects.requireNonNull(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().getRegistryName()).getPath()));

        // Smelting Recipes
        // add smelting recipe for compactium_ingot from compactium_ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.COMPACTIUM_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 200)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_ORE.get().asItem() + "_smelting"));

        // add smelting recipe for compactium_ingot from compactium_deepslate_ore
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 200)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem() + "_smelting"));


        // add smelting recipe for compactium_ingot from compactium_raw
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.COMPACTIUM_RAW.get()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 100)
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_RAW.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_RAW.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                ItemInit.COMPACTIUM_RAW.get() + "_smelting"));

        // Blast Smelting
        // add blast smelting recipe for compactium_ingot from compactium_ore
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockInit.COMPACTIUM_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_ORE.get().asItem() + "_blasting"));

        // add blast smelting recipe for compactium_ingot from compactium_deepslate_ore
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem() + "_blasting"));

        // add blast smelting recipe for compactium_ingot from compactium_raw
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemInit.COMPACTIUM_RAW.get()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_RAW.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_RAW.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                ItemInit.COMPACTIUM_RAW.get().asItem() + "_blasting"));
    }
}
