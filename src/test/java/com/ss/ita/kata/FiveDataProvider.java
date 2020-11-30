package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass {
    @DataProvider
    public Object[][] dataForSolveSum(){
        Object[][] param = new Object[][]{
                {2.00, 5.000000000000e-01},
                {4.00, 6.096117967978e-01},
                {5.00, 6.417424305044e-01}
        };
        return getObjectCodes(validFiveImplPackageProvider(),param);
    }
    @DataProvider
    public Object[][] dataForSmalest(){
        Object[][] param = new Object[][]{
                {261235, new long[] {126235, 2, 0}},
                {209917, new long[] {29917, 0, 1}},
                {285365, new long[] {238565, 3, 1}},
                {269045, new long[] {26945, 3, 0}}
        };
        return getObjectCodes(validFiveImplPackageProvider(),param);
    }

}
