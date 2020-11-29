package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SixDataProvider extends DataProviderClass {
    @DataProvider(name = "validFindNbProvider")
    public static Object[][] validFindNbProviderProvider() {
        Object[][] param = new Object[][]{
                {4183059834009L, 2022},
                {24723578342962L, -1},
                {135440716410000L, 4824},
                {40539911473216L, 3568},
                {91716553919377L, -1},
                {1071225L, 45}
        };
        return getObjectCodes(validSixImplPackageProvider(), param);
    }

    @DataProvider
    public Object[][] dataForF() {
        Object[][] param = new Object[][]{
                {2.6e-08,1.29999999155e-08},
                {1.4e-09,6.999999997549999e-10},
                {5.0e-06,2.499996875007812e-06}
        };
        return getObjectCodes(validSixImplPackageProvider(),param);
    }

}
