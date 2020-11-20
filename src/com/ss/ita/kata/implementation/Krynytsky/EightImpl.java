package com.ss.ita.kata.implementation.Krynytsky;

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
        final float MILE_PER_KM = 1.609344f;
        final float GALLON_PER_L = 4.54609188f;
        float mgpConverter = (mpg * MILE_PER_KM) / GALLON_PER_L;
        return Math.round(mgpConverter * 100) / 100f;
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
