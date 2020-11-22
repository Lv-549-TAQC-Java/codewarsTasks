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
        if (!strng.contains(town + ":")) {
            return -1;
        }
        String[] s = strng.split("\\n");
        StringBuilder sb = new StringBuilder();
        int currentArr = 0;
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            if (sb.indexOf(town) != -1) {
                currentArr = i;
                break;
            }
        }
        String[] deleteTownName = s[currentArr].split(":");
        String[] dayAndRain = deleteTownName[1].split(",");
        int count = 0;
        double totalRain = 0;
        for (String value : dayAndRain) {
            String rainValString = value.replaceAll("[a-zA-Z]", "").trim();
            totalRain = totalRain + Double.parseDouble(rainValString);
            count++;
        }
        return totalRain / count;
    }

    @Override
    public double variance(String town, String strng) {
        if (!strng.contains(town + ":")) {
            return -1;
        }
        String[] s = strng.split("\\n");
        StringBuilder sb = new StringBuilder();
        int currentArr = 0;
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            if (sb.indexOf(town) > -1) {
                currentArr = i;
                break;
            }
        }
        String[] deleteTownName = s[currentArr].split(":");
        String[] dayAndRain = deleteTownName[1].split(",");
        int count = 0;
        double totalRain = 0;
        double multiNumb = 0;
        for (String value : dayAndRain) {
            String rainValString = value.replaceAll("[a-zA-Z]", "").trim();
            totalRain = totalRain + Double.parseDouble(rainValString);
            multiNumb = multiNumb + Math.pow(Double.parseDouble(rainValString), 2);
            count++;
        }
        return (multiNumb / count) - Math.pow((totalRain / count), 2);
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
