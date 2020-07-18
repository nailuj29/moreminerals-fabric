package com.nailuj29gaming.moreminerals.moreminerals.items.tools;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial material) {
        super(material, 1, -2.8f, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    }
}
