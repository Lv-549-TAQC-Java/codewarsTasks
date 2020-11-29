package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass {


    @DataProvider(name = "validSumOfTheFirstNthDataProvider")
    public static Object[][] validSumOfTheFirstNthDataProvider() {
        Object[][] param = new Object[][]{
                {5, "1,57"}, {9, "1,77"},
                {15, "1,94"}, {20, "2,04"},
                {0, "0,00"}};

        return getObjectCodes(validSevenImplPackageProvider(), param);
    }

}
