package com.ss.ita.kata.implementation.Nastia3;

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
        BigInteger[] f = new BigInteger[(n.intValue())+2];
        f[0] = BigInteger.ZERO;
        f[1] = BigInteger.ONE;
        BigInteger sum = BigInteger.valueOf(1);

        for (int i = 2; i < (n.intValue())+2; ++i) {
            f[i] = f[i - 1].add(f[i - 2]) ;
            sum = sum.add(f[i]);
        }

        return sum.multiply(BigInteger.valueOf(4));
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
