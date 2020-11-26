package com.ss.ita.kata;

import com.ss.ita.kata.implementation.vadkostuk.EightImpl;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MpgToKpm {
    Eight impl8 = new EightImpl();
    @DataProvider
    public Object[][] validDataProvider(){
        return new Object[][]{
                {10,3.54f},{20,7.08f}};
        }

        @Test(dataProvider = "validDataProvider")
    public void test(float x,float y){
        float result = impl8.mpgToKPM(x);
            Assert.assertEquals(y,result);
    }
}
