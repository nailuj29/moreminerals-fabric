package com.nailuj29gaming.moreminerals.moreminerals.items;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import com.nailuj29gaming.moreminerals.moreminerals.armor.BaseArmor;
import com.nailuj29gaming.moreminerals.moreminerals.armor.CopperArmorMaterial;
import com.nailuj29gaming.moreminerals.moreminerals.armor.RubyArmorMaterial;
import com.nailuj29gaming.moreminerals.moreminerals.blocks.MoreMineralsBlocks;
import com.nailuj29gaming.moreminerals.moreminerals.items.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MoreMineralsItems {
    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(MoreMinerals.MORE_MINERALS));

    //BlockItems
    public static final BlockItem RUBY_BLOCK_ITEM = new BlockItem(MoreMineralsBlocks.RUBY_BLOCK, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    public static final BlockItem RUBY_ORE_ITEM = new BlockItem(MoreMineralsBlocks.RUBY_ORE, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    public static final BlockItem COPPER_BLOCK_ITEM = new BlockItem(MoreMineralsBlocks.COPPER_BLOCK, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    public static final BlockItem COPPER_ORE_ITEM = new BlockItem(MoreMineralsBlocks.COPPER_ORE, new Item.Settings().group(MoreMinerals.MORE_MINERALS));

    //Tools
    public static final PickaxeBase RUBY_PICKAXE = new PickaxeBase(new ToolMaterialRuby());
    public static final SwordBase RUBY_SWORD = new SwordBase(new ToolMaterialRuby());
    public static final ShovelBase RUBY_SHOVEL = new ShovelBase(new ToolMaterialRuby());
    public static final AxeBase RUBY_AXE = new AxeBase(new ToolMaterialRuby());
    public static final HoeBase RUBY_HOE = new HoeBase(new ToolMaterialRuby());

    public static final PickaxeBase COPPER_PICKAXE = new PickaxeBase(new ToolMaterialCopper());
    public static final SwordBase COPPER_SWORD = new SwordBase(new ToolMaterialCopper());
    public static final ShovelBase COPPER_SHOVEL = new ShovelBase(new ToolMaterialCopper());
    public static final AxeBase COPPER_AXE = new AxeBase(new ToolMaterialCopper());
    public static final HoeBase COPPER_HOE = new HoeBase(new ToolMaterialCopper());

    //Armor
    public static final BaseArmor RUBY_HELMET = new BaseArmor(new RubyArmorMaterial(), EquipmentSlot.HEAD);
    public static final BaseArmor RUBY_CHESTPLATE = new BaseArmor(new RubyArmorMaterial(), EquipmentSlot.CHEST);
    public static final BaseArmor RUBY_LEGGINGS = new BaseArmor(new RubyArmorMaterial(), EquipmentSlot.LEGS);
    public static final BaseArmor RUBY_BOOTS = new BaseArmor(new RubyArmorMaterial(), EquipmentSlot.FEET);

    public static final BaseArmor COPPER_HELMET = new BaseArmor(new CopperArmorMaterial(), EquipmentSlot.HEAD);
    public static final BaseArmor COPPER_CHESTPLATE = new BaseArmor(new CopperArmorMaterial(), EquipmentSlot.CHEST);
    public static final BaseArmor COPPER_LEGGINGS = new BaseArmor(new CopperArmorMaterial(), EquipmentSlot.LEGS);
    public static final BaseArmor COPPER_BOOTS = new BaseArmor(new CopperArmorMaterial(), EquipmentSlot.FEET);
}
