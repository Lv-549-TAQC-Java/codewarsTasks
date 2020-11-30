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


    @DataProvider(name = "validGapDataProvider")
    public static Object[][] validGapDataProvider() {
        Object[][] param = new Object[][]{
                {2, 100, 110, new long[]{101, 103}}, {4, 100, 110, new long[]{103, 107}}
               ,{10, 300, 400, new long[]{337, 347}}, {6, 100, 110, null}
                ,{8, 300, 400, new long[]{359, 367}}};
        return getObjectCodes(validFiveImplPackageProvider(), param);
    }
    @DataProvider
    public Object[][] dataForSolveSum(){
        Object[][] param = new Object[][]{
                {2.00, 5.000000000000e-01},
                {4.00, 6.096117967978e-01},
                {5.00, 6.417424305044e-01}
        };
        return getObjectCodes(validFiveImplPackageProvider(),param);
    }
    @DataProvider
    public Object[][] dataForSmalest(){
        Object[][] param = new Object[][]{
                {261235, new long[] {126235, 2, 0}},
                {209917, new long[] {29917, 0, 1}},
                {285365, new long[] {238565, 3, 1}},
                {269045, new long[] {26945, 3, 0}}
        };
        return getObjectCodes(validFiveImplPackageProvider(),param);
    }

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
