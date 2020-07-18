package com.nailuj29gaming.moreminerals.moreminerals.items.tools;

import com.nailuj29gaming.moreminerals.moreminerals.MoreMinerals;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
    public AxeBase(ToolMaterial material) {
        super(material, 5.5f, -3f, new Item.Settings().group(MoreMinerals.MORE_MINERALS));
    }
}
