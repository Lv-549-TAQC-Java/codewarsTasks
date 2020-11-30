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