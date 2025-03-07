package net.Bankgo.DistantDreams.block;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DistantDreams.MODID);

    // Eucalyptus Planks
    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registerBlock("eucalyptus_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    // Eucalyptus Stairs
    public static final RegistryObject<StairBlock> EUCALYPTUS_STAIRS = registerBlock("eucalyptus_stairs",
            () -> new StairBlock(ModBlocks.EUCALYPTUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    // Eucalyptus Slab
    public static final RegistryObject<SlabBlock> EUCALYPTUS_SLAB = registerBlock("eucalyptus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    // Eucalyptus Pressure Plate
    public static final RegistryObject<PressurePlateBlock> EUCALYPTUS_PRESSURE_PLATE = registerBlock("eucalyptus_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

    // Eucalyptus Button
    public static final RegistryObject<ButtonBlock> EUCALYPTUS_BUTTON = registerBlock("eucalyptus_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    // Eucalyptus Fence
    public static final RegistryObject<FenceBlock> EUCALYPTUS_FENCE = registerBlock("eucalyptus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    // Eucalyptus Fence Gate
    public static final RegistryObject<FenceGateBlock> EUCALYPTUS_FENCE_GATE = registerBlock("eucalyptus_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    // Eucalyptus Door
    public static final RegistryObject<DoorBlock> EUCALYPTUS_DOOR = registerBlock("eucalyptus_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));

    // Eucalyptus Trapdoor
    public static final RegistryObject<TrapDoorBlock> EUCALYPTUS_TRAPDOOR = registerBlock("eucalyptus_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    // Eucalyptus Leaves
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registerBlock("eucalyptus_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    // Limestone Wall
    // Code here

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
