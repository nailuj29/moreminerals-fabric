package com.nailuj29gaming.moreminerals.moreminerals.armor;

import com.nailuj29gaming.moreminerals.moreminerals.items.MoreMineralsItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

// Ruby Armor is almost identical to iron, except it is more enchantable, has one point greater protection, and has a +1 toughness
public class RubyArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = {2, 5, 7, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 21;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNTS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MoreMineralsItems.RUBY);
    }

    @Override
    public String getName() {
        return "ruby";
    }

    @Override
    public float getToughness() {
        return 1;
    }
}
