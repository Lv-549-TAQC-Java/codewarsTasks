package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass {
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
