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

    @DataProvider(name = "invalidSumOfTheFirstNthDataProvider")
    public static Object[][] invalidSumOfTheFirstNthDataProvider() {
        Object[][] param = new Object[][]{
                {"mkl",""}, {"32,6", ""},{0.525684648434863486,""}};

        return getObjectCodes(validSevenImplPackageProvider(), param);
    }

    @DataProvider(name = "validWhereIsHeDataProvider")
    public static Object[][] validWhereIsHeDataProvider(){
        Object[][] param = new Object[][]{
                {3,1,1,2},{5,2,3,3}};

        return getObjectCodes(validSevenImplPackageProvider(),param);
    }

    @DataProvider(name = "invalidWhereIsHeDataProvider")
    public static Object[][] invalidWhereIsHeDataProvider(){
        Object[][] param = new Object[][]{
                {3,2,1,5},{5,7,3,2}};

        return getObjectCodes(validSevenImplPackageProvider(),param);
    }

}
