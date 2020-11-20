package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        return (int) Math.floor(time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return (float) Math.round(100 * mpg * 1.609344f / 4.54609188f) / 100;
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
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int number : numbers) {
            if (number % divider == 0) {
                arrayList.add(number);
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }

        return res;
    }
}
