package com.ss.ita.kata;

import com.ss.ita.kata.implementation.Krynytsky.EightImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EightTest {

    private Eight eight = new EightImpl();

    @Test(dataProvider = "KeepHydrated")
    public void testLiters(double expectedResult, double actualResult) {
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTestLiters() {
    }

    @Test
    public void testGetVolumeOfCuboid1() {
        double actualResult = eightMike.getVolumeOfCuboid(1,2,2);
        double expectedResult = 4;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetVolumeOfCuboid2() {
        double actualResult = eightMike.getVolumeOfCuboid(2,2,5);
        double expectedResult = 20;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test( expectedExceptions = ArithmeticException.class)
    public void testGetVolumeOfCuboid3() {
        double actualResult = eightMike.getVolumeOfCuboid((2/0),5,1);
        double expectedResult = 10;
        //Assert.assertEquals(actualResult, expectedResult);
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