package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SevenTest extends SevenDataProvider{

    @Test
    public void testNewAvg() {
    }

    @Test(dataProvider ="validSumOfTheFirstNthDataProvider")
    public void seriesSum(Seven impl,int inputData,String expectedData){
        String result = impl.seriesSum(inputData);
        Assert.assertEquals(expectedData,result,impl.getClass().getName());
    }

    @Test
    public void testWhereIsHe() {
    }
}