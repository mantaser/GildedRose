package com.gildedrose.controllers;

import com.gildedrose.entities.BasicItem;

import com.gildedrose.GildedRose;
import com.gildedrose.repositories.BasicItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class GildedRoseController {

    private final BasicItemRepository repository;

    public GildedRoseController(BasicItemRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/items")
    public GildedRose gildedRose() {
        ArrayList<BasicItem> items = new ArrayList<>(repository.findAll());
//        items.add(new DexterityVest("+5 Dexterity Vest", 10, 20));
//        items.add(new AgedBrie("Aged Brie", 4, 1));
//        items.add(new ElixirMongoose("Elixir of the Mongoose", 5, 7));
//        items.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
//        items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20));
//        items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 10, 49));
//        items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 5, 49));
//        // this conjured item does not work properly yet
//        items.add(new ConjuredManaCake("Conjured Mana Cake", 3, 6));
//        items.add(new ConjuredManaCake("Conjured Mana Cake", 5, 50));
//        items.add(new ConjuredManaCake("Conjured Mana Cake", 7, 25));

        return new GildedRose(items);
    }
}

