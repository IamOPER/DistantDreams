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
        tag(BlockTags.MINEABLE_WITH_PICKAXE);

        tag(BlockTags.NEEDS_IRON_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.EUCALYPTUS_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.EUCALYPTUS_FENCE_GATE.get());

        tag(BlockTags.WALLS);
    }
}
