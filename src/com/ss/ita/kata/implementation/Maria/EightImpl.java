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
        return length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kpl = 1.609344f / 4.54609188f * mpg;
        float n = (float) Math.round(kpl * 100) / 100;
        return n;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double square = Math.sqrt(array[i]);
            if (square % 1 == 0) {
                array[i] = (int) square;
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int sumPos = 0;
        int sumNeg = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) sumNeg += 1;
            else sumPos += input[i];
        }
        int[] newArray =  {sumNeg, sumPos};

        return  newArray;
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
