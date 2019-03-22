package com.gildedrose.models;

import com.gildedrose.entities.BasicItem;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="basicItem")
@TypeAlias("item")
public class ConjuredManaCake extends BasicItem {
    private static final int minQuality = 0;

    private String name;

    private int sellIn;

    private int quality;

    public ConjuredManaCake(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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
