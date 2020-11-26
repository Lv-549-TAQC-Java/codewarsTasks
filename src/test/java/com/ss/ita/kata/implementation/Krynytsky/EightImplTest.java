package com.ss.ita.kata.implementation.Krynytsky;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class EightImplTest {
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
    public void testDivisibleBy() {
    }
}