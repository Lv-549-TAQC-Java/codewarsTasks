package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Six;

import java.text.DecimalFormat;

public class SixImpl implements Six {
    @Override

    public long findNb(long m) {
        long n = 0;
        long tempVolume =  0;
        while (tempVolume < m){
            n++;
            tempVolume += n * n * n;

        }
        if (tempVolume!= m){
            return -1;
        }
        return n;
    }


    @Override
    public String balance(String book) {

        String []notes = book.split("[^\\w\\d\\.]+");
        double costsAmount = 0;
        double costsSum = 0;
        double currentSum=Double.parseDouble(notes[0]);
        DecimalFormat df = new DecimalFormat("0.00");
        String s = df.format(currentSum);
        String result = "Original Balance: " + s + "\\r\\n";

        for( int i=1; i< notes.length; i=i+3){
            currentSum = currentSum-Double.parseDouble(notes[i+2]);
            String strDouble = String.format("%s %s %s Balance %.2f\\r\\n", notes[i], notes[i+1], notes[i+2], currentSum);
            result += strDouble;
            costsSum += Double.parseDouble(notes[i+2]);
            costsAmount++;
        }
        String lastLines =String.format("Total expense  %.2f\\r\\nAverage expense  %.2f",costsSum, costsSum/costsAmount);
        result += lastLines;
        return result;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));

    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
