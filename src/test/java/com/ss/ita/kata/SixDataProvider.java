package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SixDataProvider extends DataProviderClass{
    @DataProvider
    public Object[][] dataForF() {
        Object[][] param = new Object[][]{
                {2.6e-08,1.29999999155e-08},
                {1.4e-09,6.999999997549999e-10},
                {5.0e-06,2.499996875007812e-06}
        };
        return getObjectCodes(validSixImplPackageProvider(),param);
    }
    @DataProvider
    public Object[][] dataForMean() {
        Object[][] param = new Object[][]{
                {"London", 51.199999999999996},
                {"Beijing", 52.416666666666664}
        };
        return getObjectCodes(validSixImplPackageProvider(),param);
    }

    @DataProvider
    public Object[][] dataForVariance() {
        Object[][] param = new Object[][]{
                {"London",  57.42833333333374},
                {"Beijing", 4808.37138888889}
        };
        return getObjectCodes(validSixImplPackageProvider(),param);
    }
}
