package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProvider {

    @Test
    public void testFindNb() {
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

    @Test(dataProvider = "validHelpTheBooksellerDataProvider")
   public void testStockSummary(Six impl, String[] a,String[] b, String expected) {
        String result = impl.stockSummary(a, b);

        Assert.assertEquals(result,expected,impl.getClass().getName());
    }
}