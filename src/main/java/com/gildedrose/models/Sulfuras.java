package com.gildedrose.models;

import com.gildedrose.BasicItem;


public class Sulfuras extends BasicItem {


    private String name;

    private int sellIn;

    private int quality;

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        System.out.println("Sulfuras class");
    }


}
