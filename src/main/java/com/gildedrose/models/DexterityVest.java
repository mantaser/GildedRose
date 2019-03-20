package com.gildedrose.models;

import com.gildedrose.entities.BasicItem;

public class DexterityVest extends BasicItem {
    private String name;

    private int sellIn;

    private int quality;

    public DexterityVest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
}
