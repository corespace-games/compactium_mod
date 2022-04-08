package com.corespace.asp3x.compactium;

import com.corespace.asp3x.compactium.core.init.BlockInit;
import com.corespace.asp3x.compactium.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("compactium")
@Mod.EventBusSubscriber(modid = Compactium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class Compactium {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "compactium";
    public static final CreativeModeTab COMPACTIUM_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.COMPACTIUM_ITEM.get());
        }
    };

    public Compactium() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // register mod items
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    //@SubscribeEvent
    //public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    //   BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
    //        event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    //    });
    //}

}