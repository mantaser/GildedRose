package com.gildedrose;

import com.gildedrose.entities.*;
import com.gildedrose.repositories.ItemRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static javax.management.timer.Timer.ONE_DAY;


@Component
public class GildedRose {

    private final ItemRepository repository;

    public GildedRose(ItemRepository repository) {
        this.repository = repository;
    }

    @Async
    @Scheduled(fixedRate = ONE_DAY)
    public void updateItemsQuality() {
        ArrayList<Item> items = new ArrayList<>(repository.findAll());
        for (Item item : items) {
            item.updateQuality();
            repository.save(item);
        }
    }

    public void addItem(Item item) {
        this.repository.save(item);
    }

    public ArrayList<Item> getItems() {
        return new ArrayList<>(repository.findAll());
    }
}