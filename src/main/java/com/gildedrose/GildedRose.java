package com.gildedrose;

// 特殊商品有三种：Aged Brie， Backstage passes to a TAFKAL80ETC concert，Sulfuras, Hand of Ragnaros

// 普通商品
// 如果过期了，quality -1
// sellIn每次都-1
// 每次update后quality会 -1

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

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item : items) {
            if (!item.getName().equals("Aged Brie")
                && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality() > 0) {
                    if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                        item.setQuality(item.getQuality() - 1);
                    }
                }
            } else {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);

                    if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getSellIn() < 11) {
                            if (item.getQuality() < 50) {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }

                        if (item.getSellIn() < 6) {
                            if (item.getQuality() < 50) {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (item.getSellIn() < 0) {
                if (!item.getName().equals("Aged Brie")) {
                    if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getQuality() > 0) {
                            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                                item.setQuality(item.getQuality() - 1);
                            }
                        }
                    } else {
                        item.setQuality(0);
                    }
                } else {
                    if (item.getQuality() < 50) {
                        item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }
    }

}
