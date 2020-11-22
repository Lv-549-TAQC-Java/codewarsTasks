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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger previous1 = BigInteger.ZERO;
        BigInteger previous2 = BigInteger.ONE;
        BigInteger perimeter = BigInteger.ONE;
        for (long N = n.longValue(); N > 0; N--) {
            BigInteger next = previous1.add(previous2);
            previous1 = previous2;
            previous2 = next;
            perimeter = perimeter.add(next);
        }
        return perimeter.multiply(BigInteger.valueOf(4));
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
