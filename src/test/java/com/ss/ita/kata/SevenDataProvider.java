package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SevenDataProvider extends DataProviderClass{

    @DataProvider(name = "validSumOfTheFirstNthDataProvider")
    public static Object[][] validSumOfTheFirstNthDataProvider(){
         Object[][] param = new Object[][]{
                {5,"1,57"},{9,"1,77"},
                {15,"1,94"},{20,"2,5"}};

      return getObjectCodes(validSevenImplPackageProvider(),param);
    }

    @DataProvider(name = "validWhereIsHeDataProvider")
    public static Object[][] validWhereIsHeDataProvider(){
        Object[][] param = new Object[][]{
                {3,1,1,2},{5,2,3,3}};

        return getObjectCodes(validSevenImplPackageProvider(),param);
    }

}
