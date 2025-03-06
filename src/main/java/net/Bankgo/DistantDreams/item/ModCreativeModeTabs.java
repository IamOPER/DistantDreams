package net.Bankgo.DistantDreams.item;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DistantDreams.MODID);

    public static final RegistryObject<CreativeModeTab> DISTANT_DREAMS_TAB = CREATIVE_MODE_TABS.register(
            "distant_dreams_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EUCALYPTUS_PLANKS.get()))
                    .title(Component.translatable("creativetab.distantdreams.distant_dreams_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.EUCALYPTUS_PLANKS.get());
                        output.accept(ModBlocks.EUCALYPTUS_LEAVES.get());
                        output.accept(ModItems.DREAMCATCHER.get());
                        output.accept(ModItems.REDWOOD.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
