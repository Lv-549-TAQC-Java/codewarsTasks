package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FiveTest extends FiveDataProvider {

    @Test(dataProvider = "validArtificialRainDataProvider")
    public void testArtificialRain(Five impl, int[] inputData, int expectedData) {
        int result = impl.artificialRain(inputData);
        Assert.assertEquals(expectedData, result, impl.getClass().getName());
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

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}