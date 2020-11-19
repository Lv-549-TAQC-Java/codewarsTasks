package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int Liters(double time) {
        final double WATER = 0.5;
        double count = time * WATER;
        return (int) count;
    }

    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        final double imperial = 4.54609188;
        final double km = 1.61;
        float convert =  (mpg / (float)imperial) * (float)km;
        return Math.round(convert * 100) / 100.f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for  (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int)sqrt;
            } else {
                array[i] =(int)Math.pow(array[i], 2);
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] array = new int[2];
        for (int i : input) {
            if (i > 0) {
                array[0]+= 1;
            } else array[1] += i;
        }
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        return (Integer.parseInt(str));
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
