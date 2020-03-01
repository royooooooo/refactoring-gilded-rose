package com.gildedrose.items;

public class BPTCItem extends Item {

    public BPTCItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateInformation() {
        setQuality(getQuality() + 1);
        if (getSellIn() < 11) {
            setQuality(getQuality() + 1);
        }
        if (getSellIn() < 6) {
            setQuality(getQuality() + 1);
        }
        setSellIn(getSellIn() - 1);
        if (isOverdueItem()) {
            setQuality(0);
        }
    }
}
