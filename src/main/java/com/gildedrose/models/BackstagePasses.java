package com.gildedrose.models;

import com.gildedrose.BasicItem;

public class BackstagePasses extends BasicItem {

    private String name;

    private int sellIn;

    private int quality;

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
}
