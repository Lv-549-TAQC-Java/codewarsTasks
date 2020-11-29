package com.ss.ita.kata;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends SixDataProvider {

    @Test
    public void testFindNb() {
    }

    @Test
    public void testBalance() {
    }

    @Test(dataProvider = "dataForF")
    public void testF(Six impl, double act, double exp) {
        assertEquals(impl.f(act),exp);
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