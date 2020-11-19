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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (String item : lstOf1stLetter) {
            int total = 0;
            for (String value : lstOfArt) {
                if (value.substring(0, 1).equals(item)) {
                    String[] s = value.split("\\s");
                    total = total + Integer.parseInt(s[1]);
                }
            }
            res.append(" - (").append(item).append(" : ").append(total).append(")");
        }
        return res.substring(3);
    }
}
