package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass {

    @DataProvider(name = "validGapDataProvider")
    public static Object[][] validGapDataProvider() {
        Object[][] param = new Object[][]{
                {2, 100, 110, new long[]{101, 103}}, {4, 100, 110, new long[]{103, 107}}
               ,{10, 300, 400, new long[]{337, 347}}, {6, 100, 110, null}
                ,{8, 300, 400, new long[]{359, 367}}};
        return getObjectCodes(validFiveImplPackageProvider(), param);
    }
}
