package com.gildedrose.controllers;

import com.gildedrose.entities.Item;

import com.gildedrose.GildedRose;
import com.gildedrose.repositories.ItemRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class GildedRoseController {

    private final ItemRepository repository;

    public GildedRoseController(ItemRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public GildedRose gildedRose() {
        ArrayList<Item> items = new ArrayList<>(repository.findAll());
        return new GildedRose(items);
    }
}

