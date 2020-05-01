package com.nailuj29gaming.moreminerals.moreminerals.armor;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class BaseArmor extends ArmorItem {
    public BaseArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    }
}
