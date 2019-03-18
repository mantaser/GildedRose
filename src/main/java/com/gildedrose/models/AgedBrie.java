package com.gildedrose.models;

import com.gildedrose.BasicItem;

public class AgedBrie extends BasicItem {
    private static final int maxQuality = 50;
    private static final int minQuality = 0;

    private String name;

    private int sellIn;

    private int quality;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn -= 1;
        if(sellIn>-1 && this.quality < maxQuality){
            this.quality +=1;
        } else if (sellIn < 0 && this.quality < maxQuality) {
            this.quality +=2;
            if(this.quality > maxQuality){
                this.quality = maxQuality;
            }
        }
    }
}
