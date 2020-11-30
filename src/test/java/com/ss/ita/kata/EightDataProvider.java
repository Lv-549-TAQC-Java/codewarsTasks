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

    @DataProvider(name = "invalidMpgToKpmDataProvider")
    public static Object[][] invalidMpgToKpmDataProvider() {
        Object[][] param = new Object[][]{
                {3.54f, ""},{0.1214,""},{"142",""},{"string",""}};
        return getObjectCodes(validEightImplPackageProvider(), param);
    }

    @DataProvider(name = "validSquareOrSquareRootDataProvider")
    public static Object[][] validSquareOrSquareRootDataProvider(){
        Object[][] param = new Object[][]{
                {new int[]{4, 3, 9, 7, 2, 1}, new int[]{2, 9, 3, 49, 4, 1}}
                , {new int[]{100, 101, 5, 5, 1, 1}, new int[]{10, 10201, 25, 25, 1, 1}}
                , {new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 4, 9, 2, 25, 36}}};

        return getObjectCodes(validEightImplPackageProvider(),param);
    }

    @DataProvider(name = "invalidSquareOrSquareRootDataProvider")
    public static Object[][] invalidSquareOrSquareRootDataProvider(){
        Object[][] param = new Object[][]{
                {new int[]{5, 13, 2, 16, 7, 9}, new int[]{25, 169, 4, 256, 49, 81}}
                , {new int[]{10, 11, 5, 4}, new int[]{100, 121, 25, 16}}
                , {new int[]{1, 2, 3, 4, 5}, new int[]{1, 4, 3, 16, 25}}};

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

    @DataProvider (name = "validStringToNumberDataProvider")
    public Object[][] validStringToNumberDataProvider() {
        Object[][] param = new Object[][]{
                {"1234", 1234},
                {"-3",-3},
                {"0",0},

        };
        return getObjectCodes(validEightImplPackageProvider(),param);
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

    @DataProvider
    public Object[][] dataForFormattingDecimalPlaces() {
        Object[][] param = new Object[][]{
                {4.659725356, 4.66},
                {12.854266, 12.85},
                {50.102285, 50.10},
                {0.00, 0.00}
        };
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
