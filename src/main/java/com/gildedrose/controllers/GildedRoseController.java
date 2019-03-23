package com.gildedrose.controllers;

import com.gildedrose.entities.Item;
import com.gildedrose.repositories.ItemRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GildedRoseController {

    private final ItemRepository repository;

    public GildedRoseController(ItemRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Item> gildedRoseItemsList() {
        return repository.findAll();
    }
}

