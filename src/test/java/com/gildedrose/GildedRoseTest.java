package com.gildedrose;

import static org.junit.Assert.*;

import com.gildedrose.models.AgedBrie;
import org.junit.Test;

public class GildedRoseTest {

//    @Test
//    public void foo() {
//        BasicItem[] items = new BasicItem[] { new BasicItem("foo", 0, 0) };
//        GildedRose app = new GildedRose(items);
//        app.updateQuality();
//        assertEquals("foo", app.items[0].getName());
//    }

    @Test
    public void basicItem() {
        BasicItem item = new BasicItem("Elixir of the Mongoose", -1, 3);
//        GildedRose app = new GildedRose(items);
        item.updateQuality();
        assertEquals(-2, item.getSellIn());
        assertEquals(1, item.getQuality());
    }

    @Test
    public void agedBrie() {
        AgedBrie item = new AgedBrie("Aged Brie", -1, 3);
//        GildedRose app = new GildedRose(items);
        item.updateQuality();
        assertEquals(-2, item.getSellIn());
        assertEquals(5, item.getQuality());
    }


}
