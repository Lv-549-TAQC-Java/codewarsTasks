package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        return 0;
    }

    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
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
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
