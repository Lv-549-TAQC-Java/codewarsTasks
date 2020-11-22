package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Eight;
import java.text.DecimalFormat;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        int amount = (int)time /2;
        return amount;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        DecimalFormat df = new DecimalFormat("0.00");
        String s = (df.format(mpg * 1.609344f / 4.54609188f));
        float f = Float.parseFloat(s);
        return f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int size = array.length;
        int[] myArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            double sr = Math.sqrt(array[i]);

            if ((sr - Math.floor(sr)) == 0) {
                myArray[i] = (int) sr;

            } else {
                myArray[i] = array[i] * array[i];
            }

        }

        return myArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int positiveCount = 0;
        int negativeSum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) positiveCount += 1;
            else negativeSum += input[i];
        }

        return new int[]{positiveCount, negativeSum};
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
        DecimalFormat df = new DecimalFormat("0.00");
        String s = df.format(number);
        return Double.parseDouble(s);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
