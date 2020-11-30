package com.ss.ita.kata.implementation.mike;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int) (time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 1.609344f / 4.54609188f * mpg;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt % 1 == 0) {
                array[i] = (int) sqrt;
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[0];
        } else {

            int[] myArr = new int[2];
            int countOfPositive = 0;
            int sumOfNegative = 0;

            for(int value : input) {
                if (value > 0) {
                    countOfPositive ++;
                } else if(value < 0) {
                    sumOfNegative += value;
                }
            }
            myArr[0] = countOfPositive;
            myArr[1] = sumOfNegative;
            return myArr;
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n < 2) {
            return false;
        } else {
            int fact = 1;
            for (int i = 1; i < n; i++) {
                fact *= i;
            }
            return (fact + 1) / Math.pow(n, 2) % 1 == 0;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double rounded = Math.round(number*100)/100.0;
        return rounded;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> newList = new ArrayList<>();
        for (int value : numbers) {
            if (value % divider == 0) {
                newList.add(value);
            }
        }
        int[] exitArray = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            exitArray[i] = newList.get(i);
        }
        return exitArray;

    }



}
