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
        blockWithItem(ModBlocks.EUCALYPTUS_PLANKS);
        blockWithItem(ModBlocks.EUCALYPTUS_LEAVES);

        stairsBlock(ModBlocks.EUCALYPTUS_STAIRS.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        slabBlock(ModBlocks.EUCALYPTUS_SLAB.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));

        buttonBlock(ModBlocks.EUCALYPTUS_BUTTON.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        pressurePlateBlock(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        fenceBlock(ModBlocks.EUCALYPTUS_FENCE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));
        fenceGateBlock(ModBlocks.EUCALYPTUS_FENCE_GATE.get(), blockTexture(ModBlocks.EUCALYPTUS_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.EUCALYPTUS_DOOR.get(), modLoc("block/eucalyptus_door_bottom"), modLoc("block/eucalyptus_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.EUCALYPTUS_TRAPDOOR.get(), modLoc("block/eucalyptus_trapdoor"), true, "cutout");

        blockItem(ModBlocks.EUCALYPTUS_STAIRS);
        blockItem(ModBlocks.EUCALYPTUS_SLAB);
        blockItem(ModBlocks.EUCALYPTUS_PRESSURE_PLATE);
        blockItem(ModBlocks.EUCALYPTUS_FENCE_GATE);
        blockItem(ModBlocks.EUCALYPTUS_TRAPDOOR, "_bottom");
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
