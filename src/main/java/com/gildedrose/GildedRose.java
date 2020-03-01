package com.gildedrose;

import com.gildedrose.items.Item;
import java.util.Arrays;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        Arrays.stream(items).forEach(Item::updateInformation);
    }

}
