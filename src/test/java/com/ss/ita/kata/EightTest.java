package com.ss.ita.kata;

import com.ss.ita.kata.implementation.Krynytsky.EightImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest extends EightDataProvider {

    private EightImpl eight;

    @BeforeClass
    public void createObject() {
        eight = new EightImpl();
    }

    @Test
    public void testLiters() {
        double actualResult = eight.liters(12);
        double expectedResult = 6;
        Assert.assertEquals(actualResult, expectedResult);
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