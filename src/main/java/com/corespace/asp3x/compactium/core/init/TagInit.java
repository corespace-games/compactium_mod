package com.corespace.asp3x.compactium.core.init;

        import com.corespace.asp3x.compactium.Compactium;
        import net.minecraft.resources.ResourceLocation;
        import net.minecraft.tags.BlockTags;
        import net.minecraft.tags.ItemTags;
        import net.minecraft.tags.TagKey;
        import net.minecraft.world.item.Item;
        import net.minecraft.world.level.block.Block;

public final class TagInit {
    public static final class Blocks {
        public static final TagKey<Block> COMPACTIUM_RESOURCE = tag("compactium_resource");
        public static final TagKey<Block> COMPACTED_BLOCKS = tag("compacted_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Compactium.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static final class Items {
        public static final TagKey<Item> COMPACTIUM_RESOURCE = tag("compactium_resource");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Compactium.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}