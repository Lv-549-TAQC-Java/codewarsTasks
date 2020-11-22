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
        int zeroSum = 0;
        while(n > 0){
            n = n / 5;
            zeroSum += n;
        }
        return zeroSum;
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
        double discriminant = Math.pow((1 + 2 * m), 2) - 4 * Math.pow(m, 2);
        double argument = ((-1 *(1 + 2 * m)) + Math.sqrt(discriminant)) / (-2 * m);
        return argument;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
