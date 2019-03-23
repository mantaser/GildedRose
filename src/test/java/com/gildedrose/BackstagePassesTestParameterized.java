package com.gildedrose;

import com.gildedrose.entities.BackstagePasses;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BackstagePassesTestParameterized {

    private BackstagePasses backstagePasses;
    private int expectedSellIn;
    private int expectedQuality;

    public BackstagePassesTestParameterized(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        this.backstagePasses = new BackstagePasses(sellIn,quality);
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[] [] {
                {20,5,19,6},
                {11,6,10,8},
                {10,5,9,7},
                {6,7,5,10},
                {5,9,4,12},
                {4,12,3,15},
                {1,15,0,18},
                {0,18,-1,0},
                {-5,0,-6,0}
        });
    }

    @Test
    public void updateQuality_sellIn() {
        this.backstagePasses.updateQuality();
        assertEquals(expectedSellIn, this.backstagePasses.getSellIn(), 0);
    }

    @Test
    public void updateQuality_quality() {
        this.backstagePasses.updateQuality();
        assertEquals(expectedQuality, this.backstagePasses.getQuality(), 0);
    }

}
