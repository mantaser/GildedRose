package com.gildedrose;

import com.gildedrose.entities.*;

import java.util.ArrayList;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        ArrayList<Item> items = new ArrayList<>();
            items.add(new DexterityVest("+5 Dexterity Vest", 10, 20));
            items.add(new AgedBrie(4, 1));
            items.add(new ElixirMongoose("Elixir of the Mongoose", 5, 7));
            items.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
            items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20));
            items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 10, 49));
            items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 5, 49));
            // this conjured item does not work properly yet
            items.add(new ConjuredManaCake("Conjured Mana Cake", 3, 6));
            items.add(new ConjuredManaCake("Conjured Mana Cake", 5, 50));
            items.add( new ConjuredManaCake("Conjured Mana Cake", 7, 25));


        GildedRose app = new GildedRose(items);

        int days = 30;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);

            }
            app.updateQuality();
            System.out.println();

//            app.updateQuality();
        }
    }

}
