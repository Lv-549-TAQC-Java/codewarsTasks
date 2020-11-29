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

    @DataProvider(name = "validZerosProvider")
    public static Object[][] validZerosProvider() {
        Object[][] param = new Object[][]{
                {0, 0},
                {6, 1},
                {14, 2},
                {12, 2},
                {519687498, 129921866},
                {62962080, 15740515}
        };
        return getObjectCodes(validFiveImplPackageProvider(), param);
    }
}
