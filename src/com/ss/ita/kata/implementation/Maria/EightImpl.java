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
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers){
            if (number % divider == 0){
                count ++;
            }
        }
        int[] array = new int[count];
        int i = 0;
        for (int number : numbers){
            if (number % divider == 0){
                array[i] = number;
                i++;
            }
        }
        return array;

    }
}
