package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Six;

public class SixImp implements Six {
    @Override
    public long findNb(long m) {
        int i = 1;
        while ( m > 0){
            m -= Math.pow(i, 3);
            i++;
            if (m < 0) {
                return -1;
            }
        }
        return i-1;
    }

    @Override
    public String balance(String book) {
        return null;
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
