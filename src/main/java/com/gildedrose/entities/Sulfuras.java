package com.gildedrose.entities;


public class Sulfuras extends Item {

    public Sulfuras( int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality(){
        this.sellIn--;
    }


}
