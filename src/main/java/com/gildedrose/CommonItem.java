package com.gildedrose;

public class CommonItem extends Item {

    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateInformation() {
        quality -= 1;
        sellIn -= 1;
        if (isOverdueItem()) {
            quality -= 1;
        }
        quality = Math.min(quality, 50);
    }
}
