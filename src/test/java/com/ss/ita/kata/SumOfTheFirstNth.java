package com.ss.ita.kata;
import com.ss.ita.kata.implementation.vadkostuk.SevenImpl;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumOfTheFirstNth {
    Seven impl7 = new SevenImpl();

    @DataProvider(name = "validPackageProvider")
    public static Object[][] validPackageProvider(){
        return new Object[][]{
                {new com.ss.ita.kata.implementation.Nastia3.SevenImpl()},{new com.ss.ita.kata.implementation.vadkostuk.SevenImpl()},
                {new com.ss.ita.kata.implementation.mike.SevenImpl()},{new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl()}};

    }
    @DataProvider(name = "validDataProvider")
    public static Object[][] validDataProvider(){
        return new Object[][]{
                {5,"1,57"},{9,"1,77"},
                {15,"1,94"},{20,"2,5"}};

    }
    @DataProvider
    public static Object[][] combine(Object[][] a1, Object[][] a2){
        List<Object[]> objectCodesList = new LinkedList<Object[]>();
        for(Object[] o : a1){
            for(Object[] o2 : a2){
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
    public static Object[][] getObjectCodes(){
        return combine(validPackageProvider(),  validDataProvider());
    }


    @Test(dataProvider = "objectCodes")
    public void test(Seven impl,int x,String y){
        String result = impl.seriesSum(x);
        Assert.assertEquals(y,result,impl.getClass().getName());
    }

}
