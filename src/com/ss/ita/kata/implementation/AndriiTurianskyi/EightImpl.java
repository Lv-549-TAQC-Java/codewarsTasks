package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Eight;

import java.util.ArrayList;

import java.util.List;

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
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> divList = new ArrayList<>();
        for (int values : numbers) {
            if (values % divider == 0) {
                divList.add(values);
            }
        }
        int[] resultArray=new int[divList.size()];
        for (int i=0;i<divList.size();i++) {
            resultArray[i]=divList.get(i);
        }
        return resultArray;
    }
}
