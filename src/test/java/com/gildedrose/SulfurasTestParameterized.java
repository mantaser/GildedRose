package com.gildedrose;

import com.gildedrose.entities.Sulfuras;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class SulfurasTestParameterized {

    private Sulfuras sulfuras;
    private int expectedSellIn;
    private int expectedQuality;

    public SulfurasTestParameterized(int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        this.sulfuras = new Sulfuras(sellIn,quality);
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[] [] {
                {10,80,10,80},
                {1,80,1,80},
                {-1,80,-1,80},
                {-2,80,-2,80},
        });
    }

    @Test
    public void updateQualitySellIn() {
        this.sulfuras.updateQuality();
        assertEquals(expectedSellIn, this.sulfuras.getSellIn(), 0);
    }

    @Test
    public void updateQualityQuality() {
        this.sulfuras.updateQuality();
        assertEquals(expectedQuality, this.sulfuras.getQuality(), 0);
    }
}
