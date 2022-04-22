package com.corespace.asp3x.compactium.datagen.server;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

public class ModSmeltingRecipeProvider extends RecipeProvider {
    public ModSmeltingRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
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

        // add smelting recipe for compactium_dust from compactium_nugget
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.COMPACTIUM_NUGGET.get()),
                        ItemInit.COMPACTIUM_DUST.get(), 1f, 100)
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_NUGGET.get()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_DUST.get().getRegistryName()).getPath() + "_from_" +
                                ItemInit.COMPACTIUM_NUGGET.get() + "_smelting"));
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

        // add blast smelting recipe for compactium_dust from compactium_nugget
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemInit.COMPACTIUM_NUGGET.get()),
                        ItemInit.COMPACTIUM_DUST.get(), 1f, 150)
                .unlockedBy("has_" + Objects.requireNonNull(ItemInit.COMPACTIUM_NUGGET.get().getRegistryName()).getPath(),
                        has(ItemInit.COMPACTIUM_NUGGET.get().asItem()))
                .save(consumer, new ResourceLocation(Compactium.MOD_ID,
                        Objects.requireNonNull(ItemInit.COMPACTIUM_DUST.get().getRegistryName()).getPath() + "_from_" +
                                ItemInit.COMPACTIUM_NUGGET.get().asItem() + "_blasting"));
    }
}
