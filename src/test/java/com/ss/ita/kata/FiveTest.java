package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveTest extends FiveDataProvider{

    @Test
    public void testArtificialRain() {
    }

    @Test
    public void testGap() {
    }

    @Test(dataProvider = "validZerosProvider")
    public void testZeros(Five impl, int input, int expected) {
        Assert.assertEquals(impl.zeros(input), expected, impl.getClass().getName());
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

    @Test
    public void testSmallest() {
    }
}