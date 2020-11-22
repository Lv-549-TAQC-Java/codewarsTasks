package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;

public class ImplSix implements Six {
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
        BigDecimal bigX = new BigDecimal(x);
        return bigX.add(BigDecimal.ONE).sqrt(MathContext.DECIMAL128).subtract(BigDecimal.ONE).doubleValue();
    }

    @Override
    public double mean(String town, String string) {
        return 0;
    }

    @Override
    public double variance(String town, String string) {
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
