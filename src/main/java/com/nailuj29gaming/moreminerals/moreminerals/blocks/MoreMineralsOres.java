package com.nailuj29gaming.moreminerals.moreminerals.blocks;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class MoreMineralsOres {
    // Ruby Ore (Any biome, veins of up to 5, 3 attempts per chunk, 0 - 15)
    public static final ConfiguredFeature<?, ?> RUBY_ORE_CONFIG = Feature.ORE.configure(
            new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MoreMineralsBlocks.RUBY_ORE.getDefaultState(),
                    5 // Vein Size
            )
    ).decorate(
            Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            0, // Bottom Offset
                            0, // Minimum Y level
                            15 // Maximum Y level
                    )
            )
    ).spreadHorizontally().repeat(3);

    public static final ConfiguredFeature<?, ?> COPPER_ORE_CONFIG = Feature.ORE.configure(
            new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MoreMineralsBlocks.COPPER_ORE.getDefaultState(),
                    14 // Vein Size
            )
    ).decorate(
            Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            0, // Bottom Offset
                            0, // Minimum Y level
                            63 // Maximum Y level
                    )
            )
    ).spreadHorizontally().repeat(20);

}
