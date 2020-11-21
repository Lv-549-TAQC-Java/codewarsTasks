package com.ss.ita.kata.implementation.Krynytsky;

import com.ss.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        final double REQUIRED_AMOUNT_OF_WATER = 0.5;
        double minLiters = time * REQUIRED_AMOUNT_OF_WATER;
        return (int) minLiters;
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
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] arr = new int[2];
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        for (int i = 0; i <= input.length - 1; i++) {
            if (input[i] > 0) {
                arr[0]++;
            }
            if (input[i] < 0) {
                arr[1] += input[i];
            }
        }
        return arr;
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
        int count = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}
