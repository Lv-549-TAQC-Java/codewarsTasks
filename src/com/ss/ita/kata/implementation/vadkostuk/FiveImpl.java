package com.ss.ita.kata.implementation.vadkostuk;

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
        int res = 0;
        while (n > 0) {
            n = n / 5;
            res = res + n;
        }
        return res;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        BigInteger res = BigInteger.TWO;

        for (int i = 3; i <= n.intValue() + 1; i++) {
            c = a.add(b);
            res = res.add(c);
            a = b;
            b = c;
        }
        return res.multiply(new BigInteger("4"));
    }

    @Override
    public double solveSum(double m) {
        double x1= (2*m+1-Math.sqrt(-1*(-4*m-1)))/(2*m);
        double x2= (2*m+1+Math.sqrt(-1*(-4*m-1)))/(2*m);
        if (x1 > 0 && x1 < 1){
            return x1;
        }
        else {
            return x2;
        }
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
