package com.gildedrose;

public class ItemFactory {

    public static final String AgedBrie = "Aged Brie";
    public static final String BPTC = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SHR = "Sulfuras, Hand of Ragnaros";

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case AgedBrie:
                return new AgedBrieItem(name, sellIn, quality);
            case BPTC:
                return new BPTCItem(name, sellIn, quality);
            case SHR:
                return new SHRItem(name, sellIn, quality);
            default:
                return new CommonItem(name, sellIn, quality);
        }
    }
}