package com.gildedrose;

public class BasicItem implements Item{

    private static final int minQuality = 0;

    public String name;

    public int sellIn;

    public int quality;

    public BasicItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

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
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
