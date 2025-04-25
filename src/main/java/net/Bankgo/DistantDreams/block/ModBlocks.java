package net.Bankgo.DistantDreams.block;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.custom.ModFlammableRotatedPillarBlock;
import net.Bankgo.DistantDreams.block.custom.ModFarmBlock;
import net.Bankgo.DistantDreams.block.custom.ModSoilBlock;
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
    // Registry for mod blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DistantDreams.MODID);

    // Eucalyptus Wood
    public static final RegistryObject<Block> EUCALYPTUS_WOOD = registerBlock("eucalyptus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    // Stripped Eucalyptus Wood
    public static final RegistryObject<Block> STRIPPED_EUCALYPTUS_WOOD = registerBlock("stripped_eucalyptus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    // Eucalyptus Log
    public static final RegistryObject<Block> EUCALYPTUS_LOG = registerBlock("eucalyptus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    // Stripped Eucalyptus Log
    public static final RegistryObject<Block> STRIPPED_EUCALYPTUS_LOG = registerBlock("stripped_eucalyptus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

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
                    15,
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

    // Sequoia Wood
    public static final RegistryObject<Block> SEQUOIA_WOOD = registerBlock("sequoia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    // Stripped Sequoia Wood
    public static final RegistryObject<Block> STRIPPED_SEQUOIA_WOOD = registerBlock("stripped_sequoia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    // Sequoia Log
    public static final RegistryObject<Block> SEQUOIA_LOG = registerBlock("sequoia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    // Stripped Sequoia Log
    public static final RegistryObject<Block> STRIPPED_SEQUOIA_LOG = registerBlock("stripped_sequoia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    // Sequoia Planks
    public static final RegistryObject<Block> SEQUOIA_PLANKS = registerBlock("sequoia_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));

    // Sequoia Stairs
    public static final RegistryObject<StairBlock> SEQUOIA_STAIRS = registerBlock("sequoia_stairs",
            () -> new StairBlock(ModBlocks.SEQUOIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    // Sequoia Slab
    public static final RegistryObject<SlabBlock> SEQUOIA_SLAB = registerBlock("sequoia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    // Sequoia Pressure Plate
    public static final RegistryObject<PressurePlateBlock> SEQUOIA_PRESSURE_PLATE = registerBlock("sequoia_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));

    // Sequoia Button
    public static final RegistryObject<ButtonBlock> SEQUOIA_BUTTON = registerBlock("sequoia_button",
            () -> new ButtonBlock(BlockSetType.OAK,
                    15,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    // Sequoia Fence
    public static final RegistryObject<FenceBlock> SEQUOIA_FENCE = registerBlock("sequoia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));

    // Sequoia Fence Gate
    public static final RegistryObject<FenceGateBlock> SEQUOIA_FENCE_GATE = registerBlock("sequoia_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    // Sequoia Door
    public static final RegistryObject<DoorBlock> SEQUOIA_DOOR = registerBlock("sequoia_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));

    // Sequoia Trapdoor
    public static final RegistryObject<TrapDoorBlock> SEQUOIA_TRAPDOOR = registerBlock("sequoia_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));

    // Sequoia Leaves
    public static final RegistryObject<Block> SEQUOIA_LEAVES = registerBlock("sequoia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)));

    // Fertile Soil Block
    public static final RegistryObject<Block> FERTILE_SOIL = registerBlock("fertile_soil",
            () -> new ModSoilBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PODZOL)));

    // Fertile Plot Block
    public static final RegistryObject<Block> FERTILE_PLOT = registerBlock("fertile_plot",
            () -> new ModFarmBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND)));


    // Limestone Block
    // Code here

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
