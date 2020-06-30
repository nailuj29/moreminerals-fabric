package com.nailuj29gaming.moreminerals.moreminerals.armor;

import com.nailuj29gaming.moreminerals.moreminerals.items.MoreMineralsItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

// Copper armor provides some protection, but breaks easily
public class CopperArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = {1, 3, 5, 1};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 7;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNTS[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MoreMineralsItems.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "copper";
    }

    @Override
    public float getToughness() {
        return 0;
    }
}
