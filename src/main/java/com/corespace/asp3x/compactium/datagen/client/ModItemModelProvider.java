package com.corespace.asp3x.compactium.datagen.client;

import com.corespace.asp3x.compactium.Compactium;
import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Compactium.MOD_ID, helper);
    }

    protected void simpleBlockItem(Item item) {
        getBuilder(Objects.requireNonNull(item.getRegistryName()).toString())
                .parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void oneLayerItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(Objects.requireNonNull(item.getRegistryName()).getPath())
                    .parent(getExistingFile(mcLoc("item/generated")))
                    .texture("layer0", itemTexture);
        } else {
            // removed itemTexture.toString()
            System.out.println("Texture for " + item.getRegistryName() + " not present at " + itemTexture);
        }
    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, Objects.requireNonNull(item.getRegistryName()));
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(BlockInit.COMPACTIUM_ORE.get().asItem());
        simpleBlockItem(BlockInit.COMPACTIUM_DEEPSLATE_ORE.get().asItem());
        simpleBlockItem(BlockInit.COMPACTIUM_BLOCK.get().asItem());
        simpleBlockItem(BlockInit.COMPACTED_COBBLESTONE.get().asItem());
        simpleBlockItem(BlockInit.COMPACTED_DEEPSLATE.get().asItem());
        simpleBlockItem(BlockInit.COMPACTED_COBBLED_DEEPSLATE.get().asItem());
        simpleBlockItem(BlockInit.COMPACTED_DIRT.get().asItem());
        simpleBlockItem(BlockInit.COMPACTED_SAND.get().asItem());
        simpleBlockItem(BlockInit.COMPACTED_STONE.get().asItem());

        oneLayerItem(ItemInit.COMPACTIUM_RAW.get());
        oneLayerItem(ItemInit.COMPACTIUM_INGOT.get());
        oneLayerItem(ItemInit.COMPACTIUM_NUGGET.get());
    }
}
