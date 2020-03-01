package com.gildedrose;

// 特殊商品有三种：Aged Brie， Backstage passes to a TAFKAL80ETC concert，Sulfuras, Hand of Ragnaros

// 普通商品
// 每次update后quality会 -1
// sellIn每次都-1
// 如果过期了，quality -1

// AB
// 每次update，只要quality是小于50的，都会+1
// 如果过期了，quality +1
// sellIn每次都-1

// BPA
// 每次update，只要quality是小于50的，都会+1
// sellIn少于11天大于等于6天，那么quality额外+1，sellIn小于6天，那么额外+2
// sellIn每次都-1
// 如果过期了，quality = 0

// SHR
// quality和sellIn不变
class GildedRose {

    public static final String AgedBrie = "Aged Brie";
    public static final String BPTC = "Backstage passes to a TAFKAL80ETC concert";
    public final String SHR = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item : items) {
            switch (item.getName()) {
                case AgedBrie:
                    updateItemInformationForAgedBrie(item);
                    break;
                case BPTC:
                    updateItemInformationForBPTC(item);
                    break;
                case SHR:
                    break;
                default:
                    updateItemInformationForCommon(item);
                    break;
            }
        }
    }

    private void updateItemInformationForCommon(Item item) {
        int quality = item.getQuality();
        int sellIn = item.getSellIn();
        quality -= 1;
        sellIn -= 1;
        if (isOverdueItem(sellIn)) {
            quality -= 1;
        }
        item.setQuality(Math.min(quality, 50));
        item.setSellIn(sellIn);
    }

    private void updateItemInformationForBPTC(Item item) {
        int quality = item.getQuality();
        int sellIn = item.getSellIn();
        quality += 1;
        if (sellIn < 6) {
            quality += 2;
        } else if (sellIn < 11) {
            quality += 1;
        }
        sellIn -= 1;
        if (sellIn < 0) {
            quality = 0;
        }
        item.setQuality(Math.min(quality, 50));
        item.setSellIn(sellIn);
    }

    private void updateItemInformationForAgedBrie(Item item) {
        int quality = item.getQuality();
        int sellIn = item.getSellIn();
        quality += 1;
        sellIn -= 1;
        if (sellIn < 0) {
            quality += 1;
        }
        item.setQuality(Math.min(quality, 50));
        item.setSellIn(sellIn);
    }

    private boolean isOverdueItem(int sellIn) {
        return sellIn < 0;
    }

}
