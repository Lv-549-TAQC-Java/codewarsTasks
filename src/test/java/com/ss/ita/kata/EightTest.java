package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

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
    public void testMpgToKPMPositive(Eight impl, float inputData, float expectedData) {
        float result = impl.mpgToKPM(inputData);
        Assert.assertEquals(expectedData, result, impl.getClass().getName());
    }

    @Test(dataProvider = "invalidMpgToKpmDataProvider",expectedExceptions = IllegalArgumentException.class)
    public void testMpgToKPMNegative(Eight impl, float inputData, float expectedData) {
        float result = impl.mpgToKPM(inputData);
        Assert.assertEquals(expectedData, result, impl.getClass().getName());
    }

   @Test(dataProvider = "validSquareOrSquareRootDataProvider")
   public void testSquareOrSquareRoot(Eight impl, int[] input, int[] expectedData) {
          int[] actualData = impl.squareOrSquareRoot(input);
          Assert.assertEquals(Arrays.toString(actualData),Arrays.toString(expectedData),impl.getClass().getName());
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
        Assert.assertEquals(impl.amIWilson(number),isWilsonNumber,impl.getClass().getName());
    }

    @Test(dataProvider = "dataForFormattingDecimalPlaces")
    public void testTwoDecimalPlaces(Eight impl, double actualData, double expectedData) {
        Assert.assertEquals(impl.twoDecimalPlaces(actualData),expectedData,impl.getClass().getName());
    }

    @Test
    public void testDivisibleBy() {
    }
}