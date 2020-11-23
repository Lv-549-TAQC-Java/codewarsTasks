package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long total = 0;
        long n = 0;

        while(total < m) {
            n++;
            total += Math.pow(n, 3);
        }

        return total == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        double coeff =0.5;
        double result=coeff*x;
        int i=1;
        while(i<15){
            coeff*=(0.5-i)/(i+1);
            result+=coeff*Math.pow(x,i+1);
            i++;
        }
        return result;
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
