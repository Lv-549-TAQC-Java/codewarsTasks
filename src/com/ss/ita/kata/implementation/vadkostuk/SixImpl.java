package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
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
