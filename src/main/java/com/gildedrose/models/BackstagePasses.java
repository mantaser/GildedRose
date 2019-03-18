package com.gildedrose.models;

import com.gildedrose.BasicItem;

public class BackstagePasses extends BasicItem {
    private static final int maxQuality = 50;

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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
