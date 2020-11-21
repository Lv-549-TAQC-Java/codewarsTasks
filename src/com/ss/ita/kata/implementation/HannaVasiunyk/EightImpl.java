package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;
import java.util.ArrayList;
import java.util.List;

public class EightImpl implements Eight {

    @Override
    public int liters(double time) {
        final double WATER = 0.5;
        double count = time * WATER;
        return (int) count;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public float mpgToKPM(float mpg) {
        final double imperial = 4.54609188;
        final double km = 1.61;
        float convert = (mpg / (float) imperial) * (float) km;
        return Math.round(convert * 100) / 100.f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) sqrt;
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] array = new int[2];
        for (int i : input) {
            if (i > 0) {
                array[0] += 1;
            } else array[1] += i;
        }
        return array;
    }

    @Override
    public int stringToNumber(String str) {
        return (Integer.parseInt(str));
    }

    @Override
    public boolean amIWilson(double n) {
        boolean result = false;
        int fact = 1;
        if (n < 2) {
            result = false;
        } else {
            for (int i = 1; i < n; i++) {
                fact = fact * i;
            }
            double number = (fact + 1) / (Math.pow(n, 2));
            if (number % 1 == 0) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        String result = String.format("%.02f", number);
        return (Double.parseDouble(result));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<>();
        for(int i : numbers){
            if ( i % divider == 0 ){
                list.add(i);
            }
        }
        int[] division = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            division[i] = list.get(i);
        }
        return division;
   }
}