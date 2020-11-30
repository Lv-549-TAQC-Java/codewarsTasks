package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderClass{
    @DataProvider(name = "validMpgToKpmDataProvider")
    public static Object[][] validMpgToKpmDataProvider(){
        Object[][] param = new Object[][]{
                {10,3.54f},{20,7.08f}};

        return getObjectCodes(validEightImplPackageProvider(),param);
    }

    @DataProvider(name = "validGetVolumeOfCuboidDataProvider")
    public static Object[][] validGetVolumeOfCuboidDataProvider() {
        Object[][] param = new Object[][] {
                {6.3, 2,5, 63},
                {2, 2, 1, 4},
                {3, 3, 3, 27},
                {3, 1, 1, 3}
        };
        return getObjectCodes(validEightImplPackageProvider(), param);
    }

    @DataProvider
    public static Object[][] inValidGetVolumeOfCuboidDataProvider() {
        Object[][] param = new Object[][] {
                {0, 0, 0},
                {-5, 1, 1}
        };
        return getObjectCodes(validEightImplPackageProvider(), param);
    }

}
