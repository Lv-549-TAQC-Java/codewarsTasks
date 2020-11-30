package com.ss.ita.kata;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class FiveTest extends FiveDataProvider{

    @Test
    public void testArtificialRain() {
    }

    @Test
    public void testGap() {
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    private static void assertFuzzyEquals(double act, double exp){
        boolean inrange;
        double merr = 1e-12;
        if (exp == 0.0)
            inrange = Math.abs(act) <= merr;
        else {
            double e = Math.abs((act - exp) / exp);
            inrange = e <= 1e-12;
            Assert.assertTrue(inrange);
        }
    }
    @Test(dataProvider = "dataForSolveSum")
    public void testSolveSum(Five impl, double act, double exp) {
        assertFuzzyEquals(impl.solveSum(act),exp);
    }

    @Test(dataProvider = "dataForSmalest")
    public void testSmallest(Five impl, long act, long[] exp) {
        long[] actualData = impl.smallest(act);
        Assert.assertEquals(Arrays.toString(exp), Arrays.toString(actualData), impl.getClass().getName());
    }
}