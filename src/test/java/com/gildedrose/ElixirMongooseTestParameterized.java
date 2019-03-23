package com.gildedrose;

import com.gildedrose.entities.ElixirMongoose;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ElixirMongooseTestParameterized {

    private ElixirMongoose elixirMongoose;
    private int expectedSellIn;
    private int expectedQuality;

    public ElixirMongooseTestParameterized(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        this.elixirMongoose = new ElixirMongoose(sellIn,quality);
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[] [] {
                {10,10,9,9},
                {9,9,8,8},
                {1,8,0,7},
                {0,7,-1,5},
                {-1,3,-2,1},
                {-2,1,-3,0},
        });
    }

    @Test
    public void updateQualitySellIn() {
        this.elixirMongoose.updateQuality();
        assertEquals(expectedSellIn, this.elixirMongoose.getSellIn(), 0);
    }

    @Test
    public void updateQualityQuality() {
        this.elixirMongoose.updateQuality();
        assertEquals(expectedQuality, this.elixirMongoose.getQuality(), 0);
    }

}
