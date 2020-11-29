package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class FiveTest extends FiveDataProvider{

    @Test
    public void testArtificialRain() {
    }


    @Test(dataProvider ="validGapDataProvider")
    public void testGap(Five impl,int input1, int input2, int input3, long[] expectedData) {
        long[] actualData = impl.gap(input1, input2, input3);
        Assert.assertEquals(Arrays.toString(expectedData), Arrays.toString(actualData), impl.getClass().getName());
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}