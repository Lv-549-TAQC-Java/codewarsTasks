package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Six;
import java.math.BigDecimal;
import java.math.MathContext;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long v=  0;
        while (v<m){
            n++;
            v+= n*n*n;
        }
        if (v!=m){
            return -1;
        }
        return n;
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\s]+");
        double originalBalance =  Double.parseDouble(arr[0]);
        double totalSum =0;
        int countForAverage =0;

        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("Original Balance: %.2f",originalBalance));
        for (int i = 1; i < arr.length; i=i+3){
            countForAverage++;
            originalBalance = originalBalance - Double.parseDouble(arr[i+2]);
            totalSum = totalSum+Double.parseDouble(arr[i+2]);
            resultString.append(String.format("\r\n%s %s %s Balance %.2f", arr[i], arr[i+1], arr[i+2], originalBalance));
        }
        resultString.append(String.format("\r\nTotal expense  %.2f\r\nAverage expense  %.2f", totalSum, totalSum / countForAverage)  );
        return resultString.toString();
    }

    @Override
    public double f(double x) {
        BigDecimal result = new BigDecimal(x).add(BigDecimal.ONE).sqrt(MathContext.DECIMAL128).subtract(BigDecimal.ONE);
        return result.doubleValue();
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
