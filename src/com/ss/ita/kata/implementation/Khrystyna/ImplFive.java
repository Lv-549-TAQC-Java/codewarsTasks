package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class ImplFive implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        while (n > 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
