package com.nailuj29gaming.moreminerals.moreminerals.items.tools;

import com.nailuj29gaming.moreminerals.moreminerals.items.MoreMineralsItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

// Copper tools are in between stone and iron
public class ToolMaterialCopper implements ToolMaterial {
    @Override
    public int getDurability() {
        return 100;
    }

    @Override
    public float getMiningSpeed() {
        return 5.5f;
    }

    @Override
    public float getAttackDamage() {
        return 1.75f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MoreMineralsItems.COPPER_INGOT);
    }
}