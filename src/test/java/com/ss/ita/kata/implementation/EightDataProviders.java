package com.ss.ita.kata.implementation;

import org.testng.annotations.DataProvider;

public class EightDataProviders {

    @DataProvider(name = "KeepHydrated")
    public Object[][] testDataForLitersAuthorPackadgeImpl() {

        return new Object[][]{
                {6, new com.ss.ita.kata.implementation.Krynytsky.EightImpl().liters(12)},
                {0, new com.ss.ita.kata.implementation.mike.EightImpl().liters(0.97)},
                {7, new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl().liters(14.64)},
                {800, new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl().liters(1600.20)},
                {40, new com.ss.ita.kata.implementation.Khrystyna.ImplEight().liters(80)},
                {12, new com.ss.ita.kata.implementation.Maria.EightImpl().liters(24)},
                {24, new com.ss.ita.kata.implementation.Nastia3.EightImpl().liters(48)},
                {48, new com.ss.ita.kata.implementation.vadkostuk.EightImpl().liters(96)}
        };
    }

    /*
     *  Here you can add your DataProviders for each task in Eight kata
     */
}
