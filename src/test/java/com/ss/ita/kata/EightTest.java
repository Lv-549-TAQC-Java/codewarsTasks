package com.ss.ita.kata;

import com.ss.ita.kata.implementation.EightDataProviders;

import com.ss.ita.kata.implementation.Krynytsky.EightImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EightTest extends EightDataProviders {

    private Eight eight = new EightImpl();

    @Test(dataProvider = "KeepHydrated")
    public void testLiters(double expectedResult, double actualResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetVolumeOfCuboid() {
    }

    @Test
    public void testMpgToKPM() {
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