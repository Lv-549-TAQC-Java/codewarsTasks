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

}
