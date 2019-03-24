package com.gildedrose.entities;

import org.springframework.data.annotation.Id;
import org.springframework.scheduling.annotation.Async;

public abstract class Item{
    private static final int minQuality = 0;

    @Id
    protected String id;

    protected String name;

    protected int sellIn;

    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Async
    public void updateQuality(){
        this.sellIn -= 1;
        if(this.sellIn > -1 && this.quality > minQuality){
            this.quality--;
        } else if (this.sellIn < 0 && this.quality > 1){
            this.quality -=2;
        } else {
            this.quality = minQuality;
        }
    }

    public void outputSample(){
        System.out.println("Output from Item class.");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    @Override
   public String toString() {
        return String.format(
                "Item[id=%s, name='%s', sellIn='%s', quality='%s']",
                id, name, sellIn, quality);
    }


}
