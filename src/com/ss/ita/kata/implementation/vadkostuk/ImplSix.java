package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;

public class ImplSix implements Six {
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
