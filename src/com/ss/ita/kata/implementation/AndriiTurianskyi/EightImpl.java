package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;

import java.util.List;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        if (time >= 0) {
            double literPerHour = 0.5;
            double result = time * literPerHour;
            return (int) result;
        } else {
            throw new IllegalArgumentException("time can't be less than 0");
        }
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0) {
            return length * width * height;
        } else throw new IllegalArgumentException("values can't be less than 0");
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float mParseKm = 1.609344f;
        final float gParseL = 4.54609188f;
        if (mpg >= 0) {
            float result = mpg * mParseKm / gParseL;
            return Math.round(result * 100f) / 100f;
        } else throw new IllegalArgumentException("values can't be less than 0");
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double numbOfArray = Math.sqrt(array[i]);
            if (numbOfArray % 1 == 0) {
                resultArray[i] = (int) numbOfArray;
            } else {
                resultArray[i] = (int) (Math.pow(array[i], 2));
            }
        }
        return resultArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            int[] resultArray = new int[2];
            int countOfPositives = 0;
            int sumOfNegative = 0;
            for (int value : input) {
                if (value > 0) {
                    countOfPositives++;
                } else if (value < 0) {
                    sumOfNegative += value;
                }
            }
            resultArray[0] = countOfPositives;
            resultArray[1] = sumOfNegative;
            return resultArray;
        }
    }

    @Override
    public int stringToNumber(String str) {
            return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if ((n % 1 != 0) || (n < 2)) {
            return false;
        }
        double factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }
        return ((factorial + 1) / (n * n)) % 1 == 0;
        }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100d) / 100d;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> divList = new ArrayList<>();
        for (int values : numbers) {
            if (values % divider == 0) {
                divList.add(values);
            }
        }
        int[] resultArray=new int[divList.size()];
        for (int i=0;i<divList.size();i++) {
            resultArray[i]=divList.get(i);
        }
        return resultArray;
    }
}
