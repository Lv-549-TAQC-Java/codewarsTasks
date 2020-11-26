package com.ss.ita.kata.implementation.mike;

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
        int res = 0;

        for(int i = 1; i <= n.intValue() + 1; i++){
            res += fib(i);
        }
        return BigInteger.valueOf(res * 4);
    }

    public static int fib(int k) {
        if (k <=1 ){
            return k;
        } else {
            return fib(k - 1) + fib(k - 2);
        }
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
