package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DistantDreams.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Standard Blocks
        blockWithItem(ModBlocks.EUCALYPTUS_PLANKS);
        blockWithItem(ModBlocks.EUCALYPTUS_LEAVES);
        blockWithItem(ModBlocks.SEQUOIA_PLANKS);
        blockWithItem(ModBlocks.SEQUOIA_LEAVES);

        // Stair Blocks
        stairsBlock(ModBlocks.EUCALYPTUS_STAIRS.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        stairsBlock(ModBlocks.SEQUOIA_STAIRS.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));

        // Slab Blocks
        slabBlock(ModBlocks.EUCALYPTUS_SLAB.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        slabBlock(ModBlocks.SEQUOIA_SLAB.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));

        // Button Blocks
        buttonBlock(ModBlocks.EUCALYPTUS_BUTTON.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        buttonBlock(ModBlocks.SEQUOIA_BUTTON.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));

        // Pressure Plate Blocks
        pressurePlateBlock(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        pressurePlateBlock(ModBlocks.SEQUOIA_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));

        // Fence Blocks
        fenceBlock(ModBlocks.EUCALYPTUS_FENCE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        fenceBlock(ModBlocks.SEQUOIA_FENCE.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));

        // Fence Gate Blocks
        fenceGateBlock(ModBlocks.EUCALYPTUS_FENCE_GATE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        fenceGateBlock(ModBlocks.SEQUOIA_FENCE_GATE.get(), blockTexture(ModBlocks.SEQUOIA_PLANKS.get()));

        // Door Blocks
        doorBlockWithRenderType(ModBlocks.EUCALYPTUS_DOOR.get(), modLoc("block/eucalyptus_door_bottom"), modLoc("block/eucalyptus_door_top"), "cutout");
        doorBlockWithRenderType(ModBlocks.SEQUOIA_DOOR.get(), modLoc("block/sequoia_door_bottom"), modLoc("block/sequoia_door_top"), "cutout");

        // Trapdoor Blocks
        trapdoorBlockWithRenderType(ModBlocks.EUCALYPTUS_TRAPDOOR.get(), modLoc("block/eucalyptus_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SEQUOIA_TRAPDOOR.get(), modLoc("block/sequoia_trapdoor"), true, "cutout");

        // Non-standard Block Items
        blockItem(ModBlocks.EUCALYPTUS_STAIRS);
        blockItem(ModBlocks.EUCALYPTUS_SLAB);
        blockItem(ModBlocks.EUCALYPTUS_PRESSURE_PLATE);
        blockItem(ModBlocks.EUCALYPTUS_FENCE_GATE);
        blockItem(ModBlocks.EUCALYPTUS_TRAPDOOR, "_bottom");

        blockItem(ModBlocks.SEQUOIA_STAIRS);
        blockItem(ModBlocks.SEQUOIA_SLAB);
        blockItem(ModBlocks.SEQUOIA_PRESSURE_PLATE);
        blockItem(ModBlocks.SEQUOIA_FENCE_GATE);
        blockItem(ModBlocks.SEQUOIA_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("distantdreams:block/" +
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("distantdreams:block/" +
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath() + appendix));
    }
}
