package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EightTest extends EightDataProvider {


    @Test(dataProvider = "KeepHydrated")
    public void testLiters(Eight impl, double actualData, double expectedData) {
        actualData = impl.liters(actualData);
        Assert.assertEquals(expectedData, actualData, impl.getClass().getName());
    }

    @Test(dataProvider = "NegativeKeepHydrated")
    public void negativeTestLiters(Eight impl, double expectedData, double actualData) {
        actualData = impl.liters(actualData);
        Assert.assertNotEquals(expectedData, actualData, impl.getClass().getName());
    }

    @Test
    public void testGetVolumeOfCuboid() {
    }

    @Test(dataProvider = "validMpgToKpmDataProvider")
    public void testMpgToKPM(Eight impl, float x, float expectedData) {
        float actualData = impl.mpgToKPM(x);
        Assert.assertEquals(expectedData, actualData, impl.getClass().getName());
    }

    @Test(dataProvider = "validSquareOrSquareRootDataProvider")
    public void testSquareOrSquareRoot(Eight impl, int[] input, int[] expectedData) {
        int[] actualData = impl.squareOrSquareRoot(input);
        Assert.assertEquals(Arrays.toString(actualData), Arrays.toString(expectedData), impl.getClass().getName());
    }

    @Test(dataProvider = "validCountPositivesSumNegativesProvider")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), expected, impl.getClass().getName());
    }

    @Test
    public void testStringToNumber() {
    }

    @Test(dataProvider = "dataForWilsonNumber")
    public void testAmIWilson1(Eight impl, double number, boolean isWilsonNumber) {
        Assert.assertEquals(impl.amIWilson(number), isWilsonNumber, impl.getClass().getName());
    }

    @Test(dataProvider = "dataForFormattingDecimalPlaces")
    public void testTwoDecimalPlaces(Eight impl, double actualData, double expectedData) {
        Assert.assertEquals(impl.twoDecimalPlaces(actualData), expectedData, impl.getClass().getName());
    }

    @Test(dataProvider = "FindNumbersDivisibleBy")
    public void testDivisibleBy(Eight impl, int[] entryArray, int divider, int[] expectedData) {
        int[] actualData = impl.divisibleBy(entryArray, divider);
        Assert.assertEquals(expectedData, actualData, impl.getClass().getName());
    }

    @Test(dataProvider = "NegativeFindNumbersDivisibleBy")
    public void negativeTestDivisibleBy(Eight impl, int[] entryArray, int divider, int[] expectedData) {
        int[] actualData = impl.divisibleBy(entryArray, divider);
        Assert.assertNotEquals(expectedData, actualData, impl.getClass().getName());
    }
}