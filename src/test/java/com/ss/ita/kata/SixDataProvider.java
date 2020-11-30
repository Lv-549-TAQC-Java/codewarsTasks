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

    @DataProvider(name = "validBalance")
    public static Object[][] validBalance() {
        Object[][] param = new Object[][]{
                {"1000.00!=\n" +
                "125 Market !=:125.45\n" +
                "126 Hardware =34.95\n" +
                "127 Video! 7.45\n" +
                "128 Book :14.32\n" +
                "129 Gasoline ::16.10",
                "Original_Balance: 1000.00 " +
                        "\n125 Market 125.45 Balance 874,55" +
                        "\n126 Hardware 34.95 Balance 839,60" +
                        "\n127 Video 7.45 Balance 832,15" +
                        "\n128 Book 14.32 Balance 817,83" +
                        "\n129 Gasoline 16.10 Balance 801,73" +
                        "\nTotal expense  198,27" +
                        "\nAverage expense  39,65"}//,
                //{24723578342962L, -1}
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
    @DataProvider
    public Object[][] dataForMean() {
        Object[][] param = new Object[][]{
                {"London", 51.199999999999996},
                {"Beijing", 52.416666666666664}
        };
        return getObjectCodes(validSixImplPackageProvider(),param);
    }

    @DataProvider
    public Object[][] dataForVariance() {
        Object[][] param = new Object[][]{
                {"London",  57.42833333333374},
                {"Beijing", 4808.37138888889}
        };
        return getObjectCodes(validSixImplPackageProvider(),param);
    }
}
