package com.gildedrose.items;

public abstract class Item {

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = Math.min(quality, 50);
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void updateInformation() {
    }

    protected boolean isOverdueItem() {
        return sellIn < 0;
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + quality;
    }
}
