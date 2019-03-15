package com.gildedrose;

public class BasicItem implements Item{

    private String name;

    private int sellIn;

    private int quality;

    public BasicItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality(){
        // logic
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
