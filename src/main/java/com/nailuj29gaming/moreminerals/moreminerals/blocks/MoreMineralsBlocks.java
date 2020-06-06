package com.nailuj29gaming.moreminerals.moreminerals.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;

public class MoreMineralsBlocks {
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(5.0f).resistance(6.0f).breakByTool(FabricToolTags.PICKAXES, 2).build());
    public static final OreBlock RUBY_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(3.0f).breakByTool(FabricToolTags.PICKAXES, 2).build());

    public static final Block COPPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(3.0f).resistance(6.0f).breakByTool(FabricToolTags.PICKAXES, 1).build());
    public static final OreBlock COPPER_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0f).resistance(3.0f).breakByTool(FabricToolTags.PICKAXES, 1).build());
}
