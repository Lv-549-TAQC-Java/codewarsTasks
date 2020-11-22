package com.ss.ita.kata.implementation.mike;

import com.ss.ita.kata.Eight;

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
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double rounded = Math.round(number*100)/100.0;
        return rounded;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }



}
