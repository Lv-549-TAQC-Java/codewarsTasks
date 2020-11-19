package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

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
        if (n <= 1) {
            return false;
        } else {
            int factorial = 1;
            for (int i = 1; i < n; i++) {
                factorial *= i;
            }
            return (factorial + 1) / (n * n) % 1 == 0;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100d;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                divisibleNumbers.add(number);
            }
        }

        int[] resultArray = new int[divisibleNumbers.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = divisibleNumbers.get(i);
        }
        return resultArray;
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
    public float mpgToKPM(float mpg) {
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
}
