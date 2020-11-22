package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class ImplFive implements Five {
    @Override
    public int artificialRain(final int[] v) {
        int max = 1;
        for (int i = 0; i < v.length; i++) {
            int current = artificialRainToIndex(v, i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    private int artificialRainToIndex(int[] v, int index) {
        int count = 1;
        if (index > 0) {
            for (int indexReverce = index; indexReverce > 0; indexReverce--) {
                if (v[indexReverce - 1] <= v[indexReverce]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        if (index < v.length - 2) {
            for (int i = index + 1; i < v.length; i++) {
                if (v[i] <= v[i - 1]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
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
