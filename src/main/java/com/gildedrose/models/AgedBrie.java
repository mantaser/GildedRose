package com.gildedrose.models;

import com.gildedrose.entities.BasicItem;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="basicItem")
@TypeAlias("item")
public class AgedBrie extends BasicItem {
    private static final int maxQuality = 50;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
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
}
