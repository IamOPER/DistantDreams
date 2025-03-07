package net.Bankgo.DistantDreams.datagen;

import net.Bankgo.DistantDreams.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pRecipeOutput) {
        // Eucalyptus Stair Recipe
        stairBuilder(ModBlocks.EUCALYPTUS_STAIRS.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get()))
                .group("eucalyptus")
                .unlockedBy(getHasName(ModBlocks.EUCALYPTUS_PLANKS.get()), has(ModBlocks.EUCALYPTUS_PLANKS.get())).save(pRecipeOutput);

        // Eucalyptus Slab Recipe
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EUCALYPTUS_SLAB.get(), ModBlocks.EUCALYPTUS_PLANKS.get());

        // Eucalyptus Button Recipe
        buttonBuilder(ModBlocks.EUCALYPTUS_BUTTON.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get()))
                .group("eucalyptus")
                .unlockedBy(getHasName(ModBlocks.EUCALYPTUS_PLANKS.get()), has(ModBlocks.EUCALYPTUS_PLANKS.get())).save(pRecipeOutput);

        // Eucalyptus Pressure Plate Recipe
        pressurePlate(pRecipeOutput, ModBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), ModBlocks.EUCALYPTUS_PLANKS.get());

        // Eucalyptus Fence Recipe
        fenceBuilder(ModBlocks.EUCALYPTUS_FENCE.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get()))
                .group("eucalyptus")
                .unlockedBy(getHasName(ModBlocks.EUCALYPTUS_PLANKS.get()), has(ModBlocks.EUCALYPTUS_PLANKS.get())).save(pRecipeOutput);

        // Eucalyptus Fence Gate Recipe
        fenceGateBuilder(ModBlocks.EUCALYPTUS_FENCE_GATE.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get()))
                .group("eucalyptus")
                .unlockedBy(getHasName(ModBlocks.EUCALYPTUS_PLANKS.get()), has(ModBlocks.EUCALYPTUS_PLANKS.get())).save(pRecipeOutput);

        // Eucalyptus Door Recipe
        doorBuilder(ModBlocks.EUCALYPTUS_DOOR.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get()))
                .group("eucalyptus")
                .unlockedBy(getHasName(ModBlocks.EUCALYPTUS_PLANKS.get()), has(ModBlocks.EUCALYPTUS_PLANKS.get())).save(pRecipeOutput);

        // Eucalyptus Trapdoor Recipe
        trapdoorBuilder(ModBlocks.EUCALYPTUS_TRAPDOOR.get(), Ingredient.of(ModBlocks.EUCALYPTUS_PLANKS.get()))
                .group("eucalyptus")
                .unlockedBy(getHasName(ModBlocks.EUCALYPTUS_PLANKS.get()), has(ModBlocks.EUCALYPTUS_PLANKS.get())).save(pRecipeOutput);
    }
}
