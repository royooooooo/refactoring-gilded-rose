package com.gildedrose.items;

public class CommonItem extends Item {

    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateInformation() {
        setQuality(getQuality() - 1);

        setSellIn(getSellIn() - 1);

        if (isOverdueItem()) {
            setQuality(getQuality() - 1);
        }
    }
}
