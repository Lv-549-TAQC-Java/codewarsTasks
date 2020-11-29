package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiveTest extends FiveDataProvider {

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

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}