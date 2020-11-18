package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Eight;

public class ImplEight implements Eight {
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
        double result;
        int factorial = 1;
        if(n<2){
            return false;
        }
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
        }
        result = (factorial + 1) /( Math.pow(n, 2));
        return result % 1 == 0;
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
