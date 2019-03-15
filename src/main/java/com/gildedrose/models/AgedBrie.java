package com.gildedrose.models;

import com.gildedrose.BasicItem;

public class AgedBrie extends BasicItem {
    private String name;

    private int sellIn;

    private int quality;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

}
