package com.gildedrose.entities;

//@Document(collection="basicItem")
public class AgedBrie extends Item {
    private static final int maxQuality = 50;

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.sellIn--;
        if(super.sellIn>-1 && super.quality < maxQuality){
            super.quality +=1;
        } else if (super.sellIn < 0 && super.quality < maxQuality) {
            super.quality +=2;
            if(super.quality > maxQuality){
                super.quality = maxQuality;
            }
        }
    }

    @Override
    public void outputSample() {
        System.out.println("Output from Aged Brie class.");
    }
}
