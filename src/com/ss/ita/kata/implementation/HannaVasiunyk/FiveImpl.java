package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        boolean dropFall = false;
        int countDrop = 1;
        int maxDrop = 1;
        int i = 0;
        while (i < v.length - 1) {
            if (!dropFall && v[i] >= v[i + 1]) {
                countDrop++;
                dropFall = true;
            } else if (dropFall) {
                if(v[i] >= v[i + 1]){
                    countDrop++;
                } else {
                    dropFall = false;
                    countDrop = 2;
                }
            }
            if (maxDrop < countDrop) {
                maxDrop = countDrop;
            }
            i++;
        }
        return maxDrop;
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
