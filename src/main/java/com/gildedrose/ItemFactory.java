package com.gildedrose;

import com.gildedrose.items.ABItem;
import com.gildedrose.items.BPTCItem;
import com.gildedrose.items.CommonItem;
import com.gildedrose.items.Item;
import com.gildedrose.items.SHRItem;

public class ItemFactory {

    public static final String AB = "Aged Brie";
    public static final String BPTC = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SHR = "Sulfuras, Hand of Ragnaros";

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case AB:
                return new ABItem(name, sellIn, quality);
            case BPTC:
                return new BPTCItem(name, sellIn, quality);
            case SHR:
                return new SHRItem(name, sellIn, quality);
            default:
                return new CommonItem(name, sellIn, quality);
        }
    }
}
