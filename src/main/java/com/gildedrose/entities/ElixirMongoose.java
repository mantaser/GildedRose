package com.gildedrose.entities;

//@Document(collection="basicItem")

public class ElixirMongoose extends Item {

    public ElixirMongoose(int sellIn, int quality) {
        super("Elixir of the Mongoose", sellIn, quality);
    }
}
