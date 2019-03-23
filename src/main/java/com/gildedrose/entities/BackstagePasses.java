package com.gildedrose.entities;

//@Document(collection="basicItem")
public class BackstagePasses extends Item {
    private static final int maxQuality = 50;

    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.sellIn--;
        if (super.sellIn > -1) {
            super.quality++;
            if (super.sellIn < 11) {
                super.quality++;
            }
            if (super.sellIn < 6) {
                super.quality++;
            }
            if (super.quality > maxQuality) {
                super.quality = maxQuality;
            }
        } else {
            super.quality = 0;
        }
    }
}
