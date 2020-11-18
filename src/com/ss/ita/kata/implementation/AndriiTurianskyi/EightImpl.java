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
        final float mParseKm = 1.609344f;
        final float gParseL = 4.54609188f;
        if (mpg >= 0) {
            float result = mpg * mParseKm / gParseL;
            return Math.round(result * 100f) / 100f;
        } else throw new IllegalArgumentException("values can't be less than 0");
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
