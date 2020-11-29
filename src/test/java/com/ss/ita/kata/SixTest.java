package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SixTest extends SixDataProvider {

    @Test(dataProvider = "validFindNbProvider")
    public void testFindNb(Six impl, long input, long expected) {
        Assert.assertEquals((Long) impl.findNb(input), (Long) expected, impl.getClass().getName());
    }

    @Test
    public void testBalance() {
    }

    @Test
    public void testF() {
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
    }

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}