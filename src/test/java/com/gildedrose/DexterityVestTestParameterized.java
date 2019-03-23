package com.gildedrose;

import com.gildedrose.entities.DexterityVest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class DexterityVestTestParameterized {

    private DexterityVest dexterityVest;
    private int expectedSellIn;
    private int expectedQuality;

    public DexterityVestTestParameterized(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        this.dexterityVest = new DexterityVest(sellIn,quality);
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
    public void updateQuality_sellIn() {
        this.dexterityVest.updateQuality();
        assertEquals(expectedSellIn, this.dexterityVest.getSellIn(), 0);
    }

    @Test
    public void updateQuality_quality() {
        this.dexterityVest.updateQuality();
        assertEquals(expectedQuality, this.dexterityVest.getQuality(), 0);
    }
}
