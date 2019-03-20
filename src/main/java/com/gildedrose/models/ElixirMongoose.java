package com.gildedrose.models;

import com.gildedrose.entities.BasicItem;

public class ElixirMongoose extends BasicItem {
    private String name;

    private int sellIn;

    private int quality;

    public ElixirMongoose(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
}
