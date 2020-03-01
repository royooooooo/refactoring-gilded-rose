package com.gildedrose;

import com.gildedrose.items.Item;

public class TextTestFixture {

    public static String getCorrectInformationByDifferentDays(int days) {
        StringBuilder result = new StringBuilder();
        result.append("OMGHAI!\n");

        Item[] items =
            new Item[]{
                ItemFactory.createItem("+5 Dexterity Vest", 10, 20), //
                ItemFactory.createItem("Aged Brie", 2, 0), //
                ItemFactory.createItem("Elixir of the Mongoose", 5, 7), //
                ItemFactory.createItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                ItemFactory.createItem("Sulfuras, Hand of Ragnaros", -1, 80),
                ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                ItemFactory.createItem("Conjured Mana Cake", 3, 6)
            };

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < days; i++) {
            result.append("-------- day ").append(i).append(" --------\n");
            result.append("name, sellIn, quality\n");
            for (Item item : items) {
                result.append(item).append("\n");
            }
            result.append("\n");
            app.update_quality();
        }
        return result.toString();
    }
}
