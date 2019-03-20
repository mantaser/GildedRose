package com.gildedrose;

import com.gildedrose.entities.BasicItem;

import java.util.ArrayList;

public class GildedRose {
    private ArrayList<BasicItem> items;

    public GildedRose(ArrayList<BasicItem> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (BasicItem item : items) {
            item.updateQuality();
        }
    }

    public ArrayList<BasicItem> getItems() {
        return items;
    }
}