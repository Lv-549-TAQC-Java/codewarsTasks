package com.ss.ita.kata.implementation;

import org.testng.annotations.DataProvider;

public class EightDataProviders {

    @DataProvider(name = "KeepHydrated")
    public Object[][] testDataForLitersImpl() {
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

    @DataProvider(name = "FindNumbersDivisibleBy")
    public Object[][] testDataForDivisibleByImpl() {
        return new Object[][]{
                {new int[]{2, 4, 6}, new com.ss.ita.kata.implementation.Krynytsky.EightImpl().divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)},
                {new int[]{3, 6}, new com.ss.ita.kata.implementation.mike.EightImpl().divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3)},
                {new int[]{0, 4}, new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl().divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4)},
                {new int[]{4, 8}, new com.ss.ita.kata.implementation.Nastia3.EightImpl().divisibleBy(new int[]{1, 2, 3, 4, 5, 8}, 4)},
                {new int[]{121, 11}, new com.ss.ita.kata.implementation.Maria.EightImpl().divisibleBy(new int[]{1, 121, 3, 11, 5, 6}, 11)},
                {new int[]{25, 5}, new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl().divisibleBy(new int[]{1, 2, 25, 4, 5, 6}, 5)},
                {new int[]{36, 6}, new com.ss.ita.kata.implementation.vadkostuk.EightImpl().divisibleBy(new int[]{1, 2, 36, 4, 5, 6}, 6)},
                {new int[]{1, 2, 3, 4, 5, 6}, new com.ss.ita.kata.implementation.Khrystyna.ImplEight().divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 1)},
        };
    }

    /*
     * put your provider methods here
     */
}
