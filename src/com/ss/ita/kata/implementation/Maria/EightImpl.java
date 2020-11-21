package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        double letres = time /2;
        int value = (int)letres;
        return value;
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
        if (n <= 1)
            return false;
        int result = 1;
        double p = n - 1;
        for (int i = 1; i <= p; i++) {
            result = result * i;
        }
        if (((result + 1) / (result * result)) % 1 == 0) {
            return true;
        }
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
