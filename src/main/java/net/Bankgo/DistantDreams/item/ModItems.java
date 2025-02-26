package net.Bankgo.DistantDreams.item;

import net.Bankgo.DistantDreams.DistantDreams;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DistantDreams.MODID);

    public static final RegistryObject<Item> DREAMCATCHER = ITEMS.register("dreamcatcher",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD = ITEMS.register("redwood",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
