package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

public class SixDataProvider extends DataProviderClass{
    @DataProvider
    public static Object[][] validHelpTheBooksellerDataProvider() {
        Object[][] param = new Object[][] {
                {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[] {"A", "B"}, "(A : 200) - (B : 1140)" }
        };
        return getObjectCodes(validSixImplPackageProvider(), param);
    }

}
