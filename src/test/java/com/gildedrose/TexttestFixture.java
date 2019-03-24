package com.gildedrose;

import com.gildedrose.entities.*;

import java.util.ArrayList;

public class TexttestFixture {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
//            items.add(new DexterityVest(10, 20));
//            items.add(new AgedBrie(4, 1));
//            items.add(new ElixirMongoose(5, 7));
//            items.add(new Sulfuras(0, 80));
//            items.add(new BackstagePasses( 15, 20));
//            items.add(new BackstagePasses(10, 49));
//            items.add(new BackstagePasses( 5, 49));
//            // this conjured item does not work properly yet
//            items.add(new ConjuredManaCake(3, 6));
//            items.add(new ConjuredManaCake( 5, 50));
//            items.add( new ConjuredManaCake(7, 25));

        //GildedRose app = new GildedRose(repository);

        int days = 0;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);

            }
      //      app.updateQuality();
            System.out.println();

//            app.updateQuality();
        }
    }


}
