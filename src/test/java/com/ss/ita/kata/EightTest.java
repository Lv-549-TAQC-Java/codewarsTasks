package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EightTest extends EightDataProvider {


    @Test
    public void testLiters() {
    }

    @Test
    public void testTestLiters() {
    }

    @Test
    public void testGetVolumeOfCuboid() {
    }

    @Test(dataProvider = "validMpgToKpmDataProvider")
    public void testMpgToKPM(Eight impl, float x, float expectedData) {
        float actualData = impl.mpgToKPM(x);
        Assert.assertEquals(expectedData, actualData, impl.getClass().getName());
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @Test(dataProvider = "validCountPositivesSumNegativesProvider")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), expected, impl.getClass().getName());
    }

    @Test
    public void testStringToNumber() {
    }

    @Test
    public void testAmIWilson() {
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }
}