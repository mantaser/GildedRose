package com.gildedrose;

import com.gildedrose.entities.ConjuredManaCake;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ConjuredManaCakeTestParameterized {

    private ConjuredManaCake conjuredManaCake;
    private int expectedSellIn;
    private int expectedQuality;

    public ConjuredManaCakeTestParameterized(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        this.conjuredManaCake = new ConjuredManaCake(sellIn,quality);
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[] [] {
                {10,10,9,8},
                {9,8,8,6},
                {1,6,0,4},
                {0,4,-1,0},
                {-1,10,-2,6},
                {-2,50,-3,46},
        });
    }

    @Test
    public void updateQuality_sellIn() {
        this.conjuredManaCake.updateQuality();
        assertEquals(expectedSellIn, this.conjuredManaCake.getSellIn(), 0);
    }

    @Test
    public void updateQuality_quality() {
        this.conjuredManaCake.updateQuality();
        assertEquals(expectedQuality, this.conjuredManaCake.getQuality(), 0);
    }
}
