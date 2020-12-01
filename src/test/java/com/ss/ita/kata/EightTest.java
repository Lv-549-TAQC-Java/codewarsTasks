package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EightTest extends EightDataProvider {


    @Test(dataProvider = "KeepHydrated")
    public void testLiters(Eight impl, double actualData, double expectedData) {
        actualData = impl.liters(actualData);
        Assert.assertEquals(actualData, expectedData, impl.getClass().getName());
    }

    @Test(dataProvider = "NegativeKeepHydrated")
    public void negativeTestLiters(Eight impl, double actualData, double expectedData) {
        actualData = impl.liters(actualData);
        Assert.assertNotEquals(actualData, expectedData, impl.getClass().getName());
    }

    @Test(dataProvider = "validGetVolumeOfCuboidDataProvider")
    public void testGetVolumeOfCuboid1(Eight impl, double l ,double w, double h, double expectedData) {
        double actualData = impl.getVolumeOfCuboid(l, w, h);
        Assert.assertEquals(actualData, expectedData, impl.getClass().getName());
    }

    @Test(dataProvider = "inValidGetVolumeOfCuboidDataProvider", expectedExceptions = RuntimeException.class)
    public  void testGetVolumeOfCuboid2(Eight impl, double l ,double w, double h) {
        double actualData = impl.getVolumeOfCuboid(l, w, h);

    }

    @Test(dataProvider = "validMpgToKpmDataProvider")
    public void testMpgToKPMPositive(Eight impl, float inputData, float expectedData) {
        float result = impl.mpgToKPM(inputData);
        Assert.assertEquals(expectedData, result, impl.getClass().getName());
    }

    @Test(dataProvider = "invalidMpgToKpmDataProvider", expectedExceptions = IllegalArgumentException.class)
    public void testMpgToKPMNegative(Eight impl, float inputData, float expectedData) {
        float result = impl.mpgToKPM(inputData);
        Assert.assertEquals(expectedData, result, impl.getClass().getName());
    }

   @Test(dataProvider = "validSquareOrSquareRootDataProvider")
   public void testSquareOrSquareRoot(Eight impl, int[] input, int[] expectedData) {
          int[] actualData = impl.squareOrSquareRoot(input);
          Assert.assertEquals(Arrays.toString(expectedData),Arrays.toString(actualData),impl.getClass().getName());
   }

    @Test(dataProvider = "invalidSquareOrSquareRootDataProvider")
    public void testSquareOrSquareRootInvalid(Eight impl, int[] input, int[] expectedData) {
        int[] actualData = impl.squareOrSquareRoot(input);
        Assert.assertNotEquals(Arrays.toString(expectedData), Arrays.toString(actualData), impl.getClass().getName());
    }

    @Test(dataProvider = "validCountPositivesSumNegativesProvider")
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        Assert.assertEquals(impl.countPositivesSumNegatives(input), expected, impl.getClass().getName());
    }

    @Test(dataProvider = "validStringToNumberDataProvider")
    public void testStringToNumber(Eight impl, String input, int expected) {
        Assert.assertEquals(impl.stringToNumber(input), expected, impl.getClass().getName());
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
        Assert.assertEquals(actualData, expectedData, impl.getClass().getName());
    }

    @Test(dataProvider = "NegativeFindNumbersDivisibleBy")
    public void negativeTestDivisibleBy(Eight impl, int[] entryArray, int divider, int[] expectedData) {
        int[] actualData = impl.divisibleBy(entryArray, divider);
        Assert.assertNotEquals(actualData, expectedData, impl.getClass().getName());
    }
}