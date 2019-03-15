package com.gildedrose.models;

import com.gildedrose.BasicItem;

public class ConjuredManaCake extends BasicItem {
    private String name;

    private int sellIn;

    private int quality;

    public ConjuredManaCake(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
}
