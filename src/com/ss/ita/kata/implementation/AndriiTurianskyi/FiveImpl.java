package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        boolean goDown = false;
        int count = 1;
        int maxCountSections = 1;
        for (int i = 0; i < v.length - 1; i++) {
            if (!goDown && v[i] <= v[i + 1]) {
                count++;
            } else if (!goDown && v[i] > v[i + 1]) {
                goDown = true;
                count++;
            } else if (goDown && v[i] >= v[i + 1]) {
                count++;
            } else if (goDown && v[i] < v[i + 1]) {
                goDown = false;
                count = 2;
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
        long[] smallestRes = new long[]{n, 0, 0};
        StringBuilder oldDigit = new StringBuilder(String.valueOf(n));
        StringBuilder chDigit = new StringBuilder(oldDigit);
        for (int i = 0; i < oldDigit.length(); i++) {
            char elemForChange = oldDigit.charAt(i);
            chDigit.deleteCharAt(i);
            for (int j = 0; j <= chDigit.length(); j++) {
                chDigit.insert(j, elemForChange);
                if (Long.parseLong(chDigit.toString()) == smallestRes[0] && smallestRes[1] > i) {
                    smallestRes = new long[]{Long.parseLong(chDigit.toString()), i, j};
                }
                if (Long.parseLong(chDigit.toString()) < smallestRes[0]) {
                    smallestRes = new long[]{Long.parseLong(chDigit.toString()), i, j};
                }
                chDigit.deleteCharAt(j);
            }
            chDigit.insert(i, elemForChange);
        }
        return smallestRes;
    }
    }

