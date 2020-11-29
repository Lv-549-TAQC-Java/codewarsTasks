package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class FiveDataProvider extends DataProviderClass {

    @DataProvider(name = "validArtificialRainDataProvider")
    public static Object[][] validArtificialRainDataProvider() {
        Object[][] param = new Object[][]{
                {new int[]{2}, 1}, {new int[]{1, 2, 1, 2, 1}, 3},
                {new int[]{4, 2, 3, 3, 2}, 4}, {new int[]{4, 2, 4, 3, 5}, 3}};

        return getObjectCodes(validFiveImplPackageProvider(), param);
    }

}
