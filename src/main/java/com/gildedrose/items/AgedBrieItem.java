package com.gildedrose.items;

public class AgedBrieItem extends Item {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateInformation() {
        quality += 1;
        sellIn -= 1;
        if (isOverdueItem()) {
            quality += 1;
        }
        quality = Math.min(quality, 50);
    }
}
