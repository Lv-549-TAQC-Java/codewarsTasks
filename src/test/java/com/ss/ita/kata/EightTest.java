package com.ss.ita.kata;

import com.ss.ita.kata.implementation.Krynytsky.EightImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest {

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