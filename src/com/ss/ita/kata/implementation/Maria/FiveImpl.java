package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import static java.math.BigInteger.*;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int length = v.length;
        int rain = 1;
        int count = 1;
        int start = 0;
        for (int i = 1; i < length; i++) {
            if (v[i] < v[i - 1]) {
                start = i;
            } else if (v[i] > v[i - 1]) {
                rain = rain > count ? rain : count;
                count = i - start;
            }
            count++;

        }
        return rain = rain > count ? rain : count;
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
        BigInteger p0 = ZERO;
        BigInteger p1 = ONE;
        BigInteger sum = p1;
        for (BigInteger i = n; i.compareTo(ZERO) > 0; i = i.subtract(ONE)) {
            final BigInteger temp = p1;
            p1 = p0.add(p1);
            p0 = temp;
            sum = sum.add(p1);
        }
        return sum.shiftLeft(2);
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
