package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        boolean goDown = false;
        int count = 2;
        int maxCountSections = 1;
        for (int i = 0; i < v.length - 1; i++) {
            if (!goDown && v[i] > v[i + 1]) {
                count = count + 1;
            } else if (!goDown && v[i] < v[i + 1]) {
                goDown = true;
                count = count + 1;
            } else if (goDown && v[i] < v[i + 1]) {
                count = count + 1;
            } else if (goDown && v[i] > v[i + 1]) {
                goDown = false;
                count = 1;
            }
            if (maxCountSections < count) {
                maxCountSections = count;
            }
        }
        return maxCountSections;
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
