package com.ss.ita.kata;
import com.ss.ita.kata.implementation.vadkostuk.SevenImpl;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumOfTheFirstNth {
    Seven impl7 = new SevenImpl();
    @DataProvider
    public Object[][] validDataProvider(){
        return new Object[][]{
                {5,"1,57"},{9,"1,77"},
                {15,"1,94"}};

    }

    @Test(dataProvider = "validDataProvider")
    public void test(int x,String y){
        String result = impl7.seriesSum(x);
        Assert.assertEquals(y,result);
    }
}
