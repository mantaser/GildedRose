package com.gildedrose.entities;

//@Document(collection="basicItem")
public class ConjuredManaCake extends Item {
    private static final int minQuality = 0;

    public ConjuredManaCake(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.sellIn -= 1;
        if(super.sellIn > -1 && super.quality > minQuality){
            super.quality -=2;
        } else if (super.sellIn < 0 && super.quality > 1){
            super.quality -=4;
        } else {
            super.quality = minQuality;
        }
    }
}
