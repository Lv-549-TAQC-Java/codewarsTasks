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
}
