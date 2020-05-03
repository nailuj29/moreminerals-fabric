package com.nailuj29gaming.moreminerals.moreminerals;

import com.nailuj29gaming.moreminerals.moreminerals.blocks.MoreMineralsBlocks;
import com.nailuj29gaming.moreminerals.moreminerals.items.MoreMineralsItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;


public class MoreMinerals implements ModInitializer {
    public static final String MODID = "moreminerals";

    // Ruby is added to the ItemGroup when instantiating the ItemGroup instead of the Item because it is the icon for the group
    public static final ItemGroup MORE_MINERALS = FabricItemGroupBuilder.create(new Identifier(MODID, "itemgroup"))
            .icon(() -> new ItemStack(MoreMineralsItems.RUBY)).build();




    @Override
    public void onInitialize() {
        // Standard Items
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby"), MoreMineralsItems.RUBY);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_ingot"), MoreMineralsItems.COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_nugget"), MoreMineralsItems.COPPER_NUGGET);

        // Blocks and corresponding BlockItems
        Registry.register(Registry.BLOCK, new Identifier(MODID, "ruby_block"), MoreMineralsBlocks.RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_block"), MoreMineralsItems.RUBY_BLOCK_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(MODID, "ruby_ore"), MoreMineralsBlocks.RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_ore"), MoreMineralsItems.RUBY_ORE_ITEM);

        // Tools
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_pickaxe"), MoreMineralsItems.RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_sword"), MoreMineralsItems.RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_shovel"), MoreMineralsItems.RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_axe"), MoreMineralsItems.RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_hoe"), MoreMineralsItems.RUBY_HOE);

        // Armor
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_helmet"), MoreMineralsItems.RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_chestplate"), MoreMineralsItems.RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_leggings"), MoreMineralsItems.RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_boots"), MoreMineralsItems.RUBY_BOOTS);

        // Enchants


        /***** END REGISTRATIONS *****/

        // Add ores to existing biomes
        Registry.BIOME.forEach(this::handleBiome);

        // Listen for other biomes being registered, and add ores
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));
    }

    private void handleBiome(Biome biome) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            // Ruby Ore (Any biome, veins of up to 5, 3 attempts per chunk, 0 - 15)
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    MoreMineralsBlocks.RUBY_ORE.getDefaultState(),
                                    5 // Vein Size
                            )
                    ).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(
                                    new RangeDecoratorConfig(
                                            3, // Veins per chunk
                                            0, // Bottom Offset
                                            0, // Minimum Y level
                                            15 // Maximum Y level
                                    )
                            )
                    )
            ); // End Ruby Ore
        }
    }
}
