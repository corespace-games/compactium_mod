package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
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
        ShapedRecipeBuilder.shaped(BlockInit.COMPACTIUM_BLOCK.get().asItem())
                .define('#', ItemInit.COMPACTIUM_INGOT.get())
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_BLOCK.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_BLOCK.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(BlockInit.COMPACTIUM_BLOCK.get().asItem().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath()));

        // Crafting Recipes Shapeless
        ShapelessRecipeBuilder.shapeless(ItemInit.COMPACTIUM_INGOT.get(), 9)
                .requires(BlockInit.COMPACTIUM_BLOCK.get().asItem())
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_INGOT.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_BLOCK.get().asItem()));

        ShapelessRecipeBuilder.shapeless(ItemInit.COMPACTIUM_NUGGET.get(), 1)
                .requires(ItemInit.COMPACTIUM_INGOT.get())
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_NUGGET.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath() + "_from_" +
                                Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath()));


        // Smelting Recipes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.COMPACTIUM_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 200)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_ORE.get().asItem() + "_smelting"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 200)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem() + "_smelting"));


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.COMPACTIUM_RAW.get()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 100)
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_RAW.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_RAW.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                ItemInit.COMPACTIUM_RAW.get() + "_smelting"));

        // Blast Smelting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockInit.COMPACTIUM_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_ORE.get().asItem() + "_blasting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().getRegistryName()).getPath(),
                        has(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem() + "_blasting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemInit.COMPACTIUM_RAW.get()),
                ItemInit.COMPACTIUM_INGOT.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_RAW.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_RAW.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_INGOT.get().getRegistryName()).getPath() + "_from_" +
                                ItemInit.COMPACTIUM_RAW.get().asItem() + "_blasting"));
    }
}
