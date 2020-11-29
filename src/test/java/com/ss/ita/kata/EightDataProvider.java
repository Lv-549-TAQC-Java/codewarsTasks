package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderClass{
    @DataProvider(name = "validMpgToKpmDataProvider")
    public static Object[][] validMpgToKpmDataProvider(){
        Object[][] param = new Object[][]{
                {10,3.54f},{20,7.08f}};

        return getObjectCodes(validEightImplPackageProvider(),param);
    }
    @DataProvider
    public Object[][] dataForWilsonNumber() {
        Object[][] param = new Object[][]{
                {7, false},
                {3,false},
                {0,false},
                {-5,false},
                {13,true},
                {4,false},
                {3.14,false}
        };
        return getObjectCodes(validEightImplPackageProvider(),param);
    }

    @DataProvider
    public Object[][] dataForFormattingDecimalPlaces() {
        Object[][] param = new Object[][]{
                {4.659725356, 4.66},
                {12.854266, 12.85},
                {50.102285, 50.10},
                {0.00, 0.00}
        };
        return getObjectCodes(validEightImplPackageProvider(),param);
    }
}
