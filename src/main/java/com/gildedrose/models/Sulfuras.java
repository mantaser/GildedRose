package com.gildedrose.models;


import com.gildedrose.entities.BasicItem;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="basicItem")
@TypeAlias("item")
public class Sulfuras extends BasicItem {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){

    }


}
