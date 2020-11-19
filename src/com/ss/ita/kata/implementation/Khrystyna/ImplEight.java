package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Eight;

public class ImplEight implements Eight {
    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        for (int item : input) {
            if (item > 0) {
                result[0]++;
            } else {
                result[1] += item;
            }
        }
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }

    @Override
    public int Liters(double time) {
        return 0;
    }

    @Override
    public int liters(double time) {
        return 0;
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
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    @Override
    public  float mpgToKPM(final float mpg) {
        float imperialGalon = 4.54609188f;
        float mile = 1.609344f;
        float mpgToKPM = mpg * mile / imperialGalon;
        return Math.round(mpgToKPM * 100f) / 100f;
    }
}
