package com.gildedrose;

import static org.junit.Assert.*;

import com.gildedrose.entities.AgedBrie;
import com.gildedrose.entities.Item;
import org.junit.Test;

public class GildedRoseTest {

//    @Test
//    public void foo() {
//        Item[] items = new Item[] { new Item("foo", 0, 0) };
//        GildedRose app = new GildedRose(items);
//        app.updateQuality();
//        assertEquals("foo", app.items[0].getName());
//    }

//    @Test
//    public void basicItem() {
//        Item item = new Item("Elixir of the Mongoose", -1, 3);
////        GildedRose app = new GildedRose(items);
//        item.updateQuality();
//        assertEquals(-2, item.getSellIn());
//        assertEquals(1, item.getQuality());
//    }

    @Test
    public void agedBrie() {
        AgedBrie item = new AgedBrie("Aged Brie", -1, 3);
//        GildedRose app = new GildedRose(items);
        item.updateQuality();
        assertEquals(-2, item.getSellIn());
        assertEquals(5, item.getQuality());
    }


}
