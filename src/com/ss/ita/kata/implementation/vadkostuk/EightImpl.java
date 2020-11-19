package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int Liters(double time) {
        return (int)Math.floor(time/2);
    }

    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            {
                if (Math.sqrt(array[i]) == (int) Math.sqrt(array[i])) {
                    array[i] = (int) Math.sqrt(array[i]);
                } else {
                    array[i] = array[i] * array[i];
                }
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int count = 0;
        int sumNeg = 0;
        for (int j : input) {
            if (j > 0) {
                count++;
            } else if (j < 0) {
                sumNeg += j;
            }
        }
        return new int[]{count, sumNeg};
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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
