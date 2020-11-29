package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderClass {


    @DataProvider(name = "validMpgToKpmDataProvider")
    public static Object[][] validMpgToKpmDataProvider() {
        Object[][] param = new Object[][]{
                {10, 3.54f}, {20, 7.08f},
                {0, 0}, {17, 6.02f}};
        return getObjectCodes(validEightImplPackageProvider(), param);
    }
}
