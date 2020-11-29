package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SevenTest extends SevenDataProvider{

    @Test(dataProvider = "validLookingForABenefactorDataProvide")
    public void testNewAvg(Seven impl,double[] arr, double navg, long expectedData ) {
        long result = impl.newAvg(arr, navg);
        Assert.assertEquals(expectedData,result,impl.getClass().getName());
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