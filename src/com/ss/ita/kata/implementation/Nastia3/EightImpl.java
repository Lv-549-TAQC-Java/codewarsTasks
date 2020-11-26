package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Eight;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        int amount = (int)time /2;
        return amount;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        DecimalFormat df = new DecimalFormat("0.00");
        String s = (df.format(mpg * 1.609344f / 4.54609188f));
        float f = Float.parseFloat(s);
        return f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int size = array.length;
        int[] myArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            double sr = Math.sqrt(array[i]);

            if ((sr - Math.floor(sr)) == 0) {
                myArray[i] = (int) sr;

            } else {
                myArray[i] = array[i] * array[i];
            }

        }

        return myArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int positiveCount = 0;
        int negativeSum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) positiveCount += 1;
            else negativeSum += input[i];
        }

        return new int[]{positiveCount, negativeSum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n <= 1) {
            return false;
        }
        else {
            int factorial = 1;
            for (int i = 1; i < n; i++) {
                factorial *= i;
            }
            if((factorial + 1 ) / (n * n) % 1 == 0)  {
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        String s = df.format(number);
        return Double.parseDouble(s);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                al.add(numbers[i]);
            }
        }
        Integer[] arr = new Integer[al.size()];
        int[] array = al.stream().mapToInt(i->i).toArray();
        return array;
    }
}
