package com.ss.ita.kata;

import com.ss.ita.kata.implementation.SixDataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProviders {

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

    @Test(dataProvider = "RankingNba")
    public void testNbaCup(String actualResult, String expectedResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStockSummary() {
    }
}