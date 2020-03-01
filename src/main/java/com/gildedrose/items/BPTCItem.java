package com.gildedrose.items;

public class BPTCItem extends Item {

    public BPTCItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateInformation() {
        quality += 1;
        if (sellIn < 6) {
            quality += 2;
        } else if (sellIn < 11) {
            quality += 1;
        }
        sellIn -= 1;
        if (isOverdueItem()) {
            quality = 0;
        }
        quality = Math.min(quality, 50);
    }
}
