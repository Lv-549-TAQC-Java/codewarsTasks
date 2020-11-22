package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;

public class ImplSix implements Six {
    @Override
    public long findNb(long m) {
        long count = 1;
        while (m > 0) {
            m -= count * count * count;
            count++;
        }
        return m < 0 ? -1 : count - 1;
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
        return null;
    }
}
