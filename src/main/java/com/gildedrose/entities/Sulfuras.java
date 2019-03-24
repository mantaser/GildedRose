package com.gildedrose.entities;


import org.springframework.scheduling.annotation.Async;

public class Sulfuras extends Item {

    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Async
    @Override
    public void updateQuality() {

    }


}
