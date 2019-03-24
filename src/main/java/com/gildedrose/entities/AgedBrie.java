package com.gildedrose.entities;

import org.springframework.scheduling.annotation.Async;

public class AgedBrie extends Item {
    private static final int maxQuality = 50;

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Async
    @Override
    public void updateQuality() {
        super.sellIn--;
        if (super.sellIn > -1 && super.quality < maxQuality) {
            super.quality += 1;
        } else if (super.sellIn < 0 && super.quality < maxQuality) {
            super.quality += 2;
            if (super.quality > maxQuality) {
                super.quality = maxQuality;
            }
        }
    }
}
