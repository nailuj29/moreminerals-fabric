package com.nailuj29gaming.moreminerals.moreminerals.items;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial material) {
        super(material, 3, -2.4f, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    }
}
