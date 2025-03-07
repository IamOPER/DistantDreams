package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.EUCALYPTUS_PLANKS.get());
        dropSelf(ModBlocks.EUCALYPTUS_STAIRS.get());
        this.add(ModBlocks.EUCALYPTUS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EUCALYPTUS_SLAB.get()));
        dropSelf(ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.EUCALYPTUS_BUTTON.get());
        dropSelf(ModBlocks.EUCALYPTUS_FENCE.get());
        dropSelf(ModBlocks.EUCALYPTUS_FENCE_GATE.get());
        this.add(ModBlocks.EUCALYPTUS_DOOR.get(),
                block -> createDoorTable(ModBlocks.EUCALYPTUS_DOOR.get()));
        dropSelf(ModBlocks.EUCALYPTUS_TRAPDOOR.get());
        this.add(ModBlocks.EUCALYPTUS_LEAVES.get(),
                block -> createLeavesDrops(block, Blocks.OAK_LEAVES, NORMAL_LEAVES_SAPLING_CHANCES));

    }

    @Override
    @Nonnull
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
