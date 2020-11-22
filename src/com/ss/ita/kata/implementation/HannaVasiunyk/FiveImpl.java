package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.valueOf(1);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger third = BigInteger.valueOf(0);
        BigInteger sum = BigInteger.valueOf(2);
        BigInteger four = BigInteger.valueOf(4);

        for (int i = 3; i <= n.intValue() + 1; i++) {
            third = first.add(second);
            sum = sum.add(third);
            first = second;
            second = third;
        }
        return sum.multiply(four);
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
