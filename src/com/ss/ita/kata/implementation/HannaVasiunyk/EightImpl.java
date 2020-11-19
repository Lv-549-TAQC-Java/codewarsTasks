package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int Liters(double time) {
        final double WATER = 0.5;
        double count = time * WATER;
        return (int) count;
    }

    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        final double imperial = 4.54609188;
        final double km = 1.61;
        float convert =  (mpg / (float)imperial) * (float)km;
        return Math.round(convert * 100) / 100.f;
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
        boolean result = false;
        int fact = 1;
        if ( n < 2 ){
            result = false;
        } else {
            for (int i = 1; i <n; i ++){
                fact = fact*i;
            }
            double number = (fact + 1)/(Math.pow(n, 2));
            if ( number % 1 == 0){
                result = true;
            }
        }
        return result;
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
