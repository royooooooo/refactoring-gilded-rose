package com.gildedrose.items;

public class BPTCItem extends Item {

    public static final int PHASE_ONE_EXTRA_DISCOUNT_DAYS = 11;
    public static final int PHASE_TWO_EXTRA_DISCOUNT_DAYS = 6;

    public BPTCItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateInformation() {
        setQuality(getQuality() + 1);

        if (getSellIn() < PHASE_ONE_EXTRA_DISCOUNT_DAYS) {
            setQuality(getQuality() + 1);
        }
        if (getSellIn() < PHASE_TWO_EXTRA_DISCOUNT_DAYS) {
            setQuality(getQuality() + 1);
        }

        setSellIn(getSellIn() - 1);

        if (isOverdueItem()) {
            setQuality(0);
        }
    }
}
