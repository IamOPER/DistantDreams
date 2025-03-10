package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.DistantDreams;
import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DistantDreams.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        // Block tags for mining
        tag(BlockTags.MINEABLE_WITH_PICKAXE);

        tag(BlockTags.NEEDS_IRON_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        // Block tags for wood
        tag(BlockTags.PLANKS)
                .add(ModBlocks.EUCALYPTUS_PLANKS.get())
                .add(ModBlocks.SEQUOIA_PLANKS.get());

        tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.EUCALYPTUS_STAIRS.get())
                .add(ModBlocks.SEQUOIA_STAIRS.get());

        tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.EUCALYPTUS_SLAB.get())
                .add(ModBlocks.SEQUOIA_SLAB.get());

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get())
                .add(ModBlocks.SEQUOIA_PRESSURE_PLATE.get());

        tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.EUCALYPTUS_BUTTON.get())
                .add(ModBlocks.SEQUOIA_BUTTON.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.EUCALYPTUS_FENCE.get())
                .add(ModBlocks.SEQUOIA_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.EUCALYPTUS_FENCE_GATE.get())
                .add(ModBlocks.SEQUOIA_FENCE_GATE.get());

        tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.EUCALYPTUS_DOOR.get())
                .add(ModBlocks.SEQUOIA_DOOR.get());

        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.EUCALYPTUS_TRAPDOOR.get())
                .add(ModBlocks.SEQUOIA_TRAPDOOR.get());


        // Block tags for stone
        tag(BlockTags.WALLS);
    }
}
