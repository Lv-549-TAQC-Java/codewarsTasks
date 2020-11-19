package com.ss.ita.kata.implementation.mike;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        return (int)(time/2);
    }

    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (double)(length*width*height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        return (float)(1.609344f / 4.54609188f * mpg);
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