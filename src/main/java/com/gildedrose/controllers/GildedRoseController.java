package com.gildedrose.controllers;

import com.gildedrose.entities.Item;

import com.gildedrose.GildedRose;
import com.gildedrose.repositories.ItemRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class GildedRoseController {

    private final ItemRepository repository;

    public GildedRoseController(ItemRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/items")
    public GildedRose gildedRose() {
        ArrayList<Item> items = new ArrayList<>(repository.findAll());
//        items.add(new DexterityVest( 10, 20));
//        items.add(new AgedBrie( 4, 1));
//        items.add(new ElixirMongoose(5, 7));
//        items.add(new Sulfuras( 0, 80));
//        items.add(new BackstagePasses( 15, 20));
//        items.add(new BackstagePasses(10, 49));
//        items.add(new BackstagePasses(5, 49));
//        // this conjured item does not work properly yet
//        items.add(new ConjuredManaCake( 3, 6));
//        items.add(new ConjuredManaCake( 5, 50));
//        items.add(new ConjuredManaCake( 7, 25));

        return new GildedRose(items);
    }
}

