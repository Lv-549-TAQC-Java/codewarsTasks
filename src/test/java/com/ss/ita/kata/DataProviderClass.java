package com.ss.ita.kata;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataProviderClass {

    @DataProvider(name = "validEightImplPackageProvider")
    public static Object[][] validEightImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl()}, {new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl()},
                {new com.ss.ita.kata.implementation.Khrystyna.ImplEight()}, {new com.ss.ita.kata.implementation.Krynytsky.EightImpl()},
                {new com.ss.ita.kata.implementation.Maria.EightImpl()}, {new com.ss.ita.kata.implementation.mike.EightImpl()},
                {new com.ss.ita.kata.implementation.Nastia3.EightImpl()}, {new com.ss.ita.kata.implementation.vadkostuk.EightImpl()}};
    }

    @DataProvider(name = "validSevenImplPackageProvider")
    public static Object[][] validSevenImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl()}, {new com.ss.ita.kata.implementation.HannaVasiunyk.SevenImpl()},
                {new com.ss.ita.kata.implementation.Khrystyna.ImplSeven()}, {new com.ss.ita.kata.implementation.Krynytsky.SevenImpl()},
                {new com.ss.ita.kata.implementation.Maria.SevenImpl()}, {new com.ss.ita.kata.implementation.mike.SevenImpl()},
                {new com.ss.ita.kata.implementation.Nastia3.SevenImpl()}, {new com.ss.ita.kata.implementation.vadkostuk.SevenImpl()}};

    }

    @DataProvider(name = "validSixImplPackageProvider")
    public static Object[][] validSixImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.AndriiTurianskyi.SixImpl()}, {new com.ss.ita.kata.implementation.HannaVasiunyk.SixImpl()},
                {new com.ss.ita.kata.implementation.Khrystyna.ImplSix()}, {new com.ss.ita.kata.implementation.Krynytsky.SixImpl()},
                {new com.ss.ita.kata.implementation.Maria.SixImpl()}, {new com.ss.ita.kata.implementation.mike.SixImpl()},
                {new com.ss.ita.kata.implementation.Nastia3.SixImpl()}, {new com.ss.ita.kata.implementation.vadkostuk.SixImpl()}};
    }

    @DataProvider(name = "validFiveImplPackageProvider")
    public static Object[][] validFiveImplPackageProvider() {
        return new Object[][]{
                {new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl()}, {new com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl()},
                {new com.ss.ita.kata.implementation.Khrystyna.ImplFive()}, {new com.ss.ita.kata.implementation.Krynytsky.FiveImpl()},
                {new com.ss.ita.kata.implementation.Maria.FiveImpl()}, {new com.ss.ita.kata.implementation.mike.FiveImpl()},
                {new com.ss.ita.kata.implementation.Nastia3.FiveImpl()}, {new com.ss.ita.kata.implementation.vadkostuk.FiveImpl()}};
    }

    @DataProvider
    public static Object[][] combine(Object[][] a1, Object[][] a2) {
        List<Object[]> objectCodesList = new LinkedList<Object[]>();
        for (Object[] o : a1) {
            for (Object[] o2 : a2) {
                objectCodesList.add(concatAll(o, o2));
            }
        }
        return objectCodesList.toArray(new Object[0][0]);
    }

    @SafeVarargs
    public static <T> T[] concatAll(T[] first, T[]... rest) {
        //calculate the total length of the final object array after the concat
        int totalLength = first.length;
        for (T[] array : rest) {
            totalLength += array.length;
        }
        //copy the first array to result array and then copy each array completely to result
        T[] result = Arrays.copyOf(first, totalLength);
        int offset = first.length;
        for (T[] array : rest) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }

    @DataProvider(name = "objectCodes")
    public static Object[][] getObjectCodes(Object[][] validPackageProvider, Object[][] validDataProvider) {
        return combine(validPackageProvider, validDataProvider);
    }

}
