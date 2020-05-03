package com.nailuj29gaming.moreminerals.moreminerals.items.tools;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial material) {
        super(material, 1.5f, -3f, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    }
}
