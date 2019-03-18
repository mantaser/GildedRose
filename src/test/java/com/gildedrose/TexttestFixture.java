package com.gildedrose;

import com.gildedrose.models.*;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        BasicItem[] items = new BasicItem[] {
//                new BasicItem("+5 Dexterity Vest", 10, 20), //
//                new DexterityVest("+5 Dexterity Vest", 10, 20), //
//                new BasicItem("Aged Brie", 4, 1), //
//                new AgedBrie("Aged Brie", 4, 1), //
//                new BasicItem("Elixir of the Mongoose", 5, 7), //
//                new ElixirMongoose("Elixir of the Mongoose", 5, 7), //
//                new BasicItem("Sulfuras, Hand of Ragnaros", 0, 80), //
//                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80), //
//                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
//                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 10, 49),
//                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 5, 49),
//                // this conjured item does not work properly yet
                new ConjuredManaCake("Conjured Mana Cake", 3, 6),
                new ConjuredManaCake("Conjured Mana Cake", 5, 50),
                new ConjuredManaCake("Conjured Mana Cake", 7, 25),
                };

        GildedRose app = new GildedRose(items);

        int days = 30;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (BasicItem item : items) {
                System.out.println(item);
                item.updateQuality();
            }
            System.out.println();

//            app.updateQuality();
        }
    }

}
