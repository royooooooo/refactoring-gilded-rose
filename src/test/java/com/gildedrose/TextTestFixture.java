package com.gildedrose;

public class TextTestFixture {

    public static String getCorrectInformationByDifferentDays(int days) {
        StringBuilder result = new StringBuilder();
        result.append("OMGHAI!\n");

        Item[] items =
            new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                new Item("Conjured Mana Cake", 3, 6)
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
