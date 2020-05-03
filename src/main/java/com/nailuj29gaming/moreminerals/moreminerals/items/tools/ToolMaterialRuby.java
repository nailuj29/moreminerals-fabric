package com.nailuj29gaming.moreminerals.moreminerals.items.tools;

import com.nailuj29gaming.moreminerals.moreminerals.items.MoreMineralsItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

// Ruby tools are in between iron and diamond
public class ToolMaterialRuby implements ToolMaterial {
    @Override
    public int getDurability() {
        return 625;
    }

    @Override
    public float getMiningSpeed() {
        return 2.5f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MoreMineralsItems.RUBY);
    }
}
