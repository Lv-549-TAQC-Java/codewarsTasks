package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class EightDataProvider extends DataProviderClass {
    @DataProvider(name = "validMpgToKpmDataProvider")
    public static Object[][] validMpgToKpmDataProvider() {
        Object[][] param = new Object[][]{
                {10, 3.54f}, {20, 7.08f}};

        return getObjectCodes(validEightImplPackageProvider(),param);
    }

    @DataProvider(name = "validSquareOrSquareRootDataProvider")
    public static Object[][] validSquareOrSquareRootDataProvider(){
        Object[][] param = new Object[][]{
                {new int[]{4, 3, 9, 7, 2, 1}, new int[]{2, 9, 3, 49, 4, 1}}
                , {new int[]{100, 101, 5, 5, 1, 1}, new int[]{10, 10201, 25, 25, 1, 1}}
                , {new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 4, 9, 2, 25, 36}}};

        return getObjectCodes(validEightImplPackageProvider(),param);
    }

    @DataProvider(name = "validCountPositivesSumNegativesProvider")
    public static Object[][] validCountPositivesSumNegativesProvider() {
        Object[][] param = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[]{10, -65}},
                {new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, new int[]{8, -50}}
        };
        return getObjectCodes(validEightImplPackageProvider(), param);
    }
    @DataProvider
    public Object[][] dataForWilsonNumber() {
        Object[][] param = new Object[][]{
                {7, false},
                {3,false},
                {0,false},
                {-5,false},
                {13,true},
                {4,false},
                {3.14,false}
        };
        return getObjectCodes(validEightImplPackageProvider(),param);
    }

}
