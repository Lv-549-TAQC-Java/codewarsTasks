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
    public void testMpgToKPM(Eight impl,float x,float expectedData) {
        float actualData = impl.mpgToKPM(x);
        Assert.assertEquals(expectedData,actualData,impl.getClass().getName());
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @Test
    public void testCountPositivesSumNegatives() {
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