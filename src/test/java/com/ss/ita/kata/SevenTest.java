package com.ss.ita.kata;

import com.ss.ita.kata.implementation.SevenDataProviders;
import com.ss.ita.kata.implementation.mike.SevenImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SevenTest extends SevenDataProviders {
    private SevenImpl sevenMike;

    @BeforeClass
    public void beforeClass() {
        sevenMike = new SevenImpl();
    }

    @Test
    public void testNewAvg1() {
        double actualResult = sevenMike.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90);
        double expectedResult = 628;
        assertEquals(actualResult, expectedResult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNewAvg2() {
        double actualResult = sevenMike.newAvg(new double[]{14, 30, 5, 7, 9, 11, 15}, 2);
        //double expectedResult =628;
        //assertEquals(actualResult, expectedResult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNewAvg3() {
        double actualResult = sevenMike.newAvg(new double[]{12, 0, 43, 2}, 9);
        double expectedResult = 628;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSeriesSum() {
    }

    @Test
    public void testWhereIsHe() {
    }
}