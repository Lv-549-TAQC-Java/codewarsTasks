package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider{

    @Test
    public void testNewAvg() {
    }

    @Test(dataProvider ="validSumOfTheFirstNthDataProvider")
    public void seriesSum(Seven impl,int inputData,String expectedData){
        String result = impl.seriesSum(inputData);
        Assert.assertEquals(expectedData,result,impl.getClass().getName());
    }

    @Test(dataProvider ="validWhereIsHeDataProvider")
    public void testWhereIsHe(Seven impl, int input1, int input2, int input3, int expectedData) {
        int actualData = impl.whereIsHe(input1, input2, input3);
        Assert.assertEquals(expectedData, actualData,impl.getClass().getName());
    }
}