package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getSellIn() + ", " + this.quality;
    }

    public int getQuality() {
        return quality;
    }

    void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
}
