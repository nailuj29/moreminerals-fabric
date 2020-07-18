package com.nailuj29gaming.moreminerals.moreminerals.items.tools;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial material) {
        super(material, -0.5f, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    }
}
