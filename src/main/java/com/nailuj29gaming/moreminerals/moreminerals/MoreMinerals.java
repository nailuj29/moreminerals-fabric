package com.nailuj29gaming.moreminerals.moreminerals;

import com.nailuj29gaming.moreminerals.moreminerals.blocks.MoreMineralsBlocks;
import com.nailuj29gaming.moreminerals.moreminerals.blocks.MoreMineralsOres;
import com.nailuj29gaming.moreminerals.moreminerals.items.MoreMineralsItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.impl.biome.modification.BiomeSelectionContextImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
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

        Registry.register(Registry.BLOCK, new Identifier(MODID, "copper_block"), MoreMineralsBlocks.COPPER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_block"), MoreMineralsItems.COPPER_BLOCK_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(MODID, "copper_ore"), MoreMineralsBlocks.COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_ore"), MoreMineralsItems.COPPER_ORE_ITEM);

        // Tools
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_pickaxe"), MoreMineralsItems.RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_sword"), MoreMineralsItems.RUBY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_shovel"), MoreMineralsItems.RUBY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_axe"), MoreMineralsItems.RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_hoe"), MoreMineralsItems.RUBY_HOE);

        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_pickaxe"), MoreMineralsItems.COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_sword"), MoreMineralsItems.COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_shovel"), MoreMineralsItems.COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_axe"), MoreMineralsItems.COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_hoe"), MoreMineralsItems.COPPER_HOE);

        // Armor
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_helmet"), MoreMineralsItems.RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_chestplate"), MoreMineralsItems.RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_leggings"), MoreMineralsItems.RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ruby_boots"), MoreMineralsItems.RUBY_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_helmet"), MoreMineralsItems.COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_chestplate"), MoreMineralsItems.COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_leggings"), MoreMineralsItems.COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "copper_boots"), MoreMineralsItems.COPPER_BOOTS);

        // Enchants
        // Ores
        RegistryKey<ConfiguredFeature<?, ?>> oreRubyOverworld = RegistryKey.of(
                Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MODID, "ruby_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyOverworld.getValue(), MoreMineralsOres.RUBY_ORE_CONFIG);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyOverworld);
        RegistryKey<ConfiguredFeature<?, ?>> oreCopperOverworld = RegistryKey.of(
                Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MODID, "copper_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCopperOverworld.getValue(), MoreMineralsOres.COPPER_ORE_CONFIG);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCopperOverworld);


        /***** END REGISTRATIONS *****/
    }


}
