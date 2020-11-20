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
        long[] result = new long[]{n, 0, 0};
        StringBuilder number = new StringBuilder(String.valueOf(n));
        StringBuilder numberBuff = new StringBuilder(number);
        for (int i = 0; i < number.length(); i++) {
            char charToMove = number.charAt(i);
            numberBuff.deleteCharAt(i);
            for (int j = 0; j <= numberBuff.length(); j++) {
                numberBuff.insert(j, charToMove);
                if (Long.parseLong(numberBuff.toString()) == result[0] && result[1] > i) {
                    result = new long[]{Long.parseLong(numberBuff.toString()), i, j};
                }
                if (Long.parseLong(numberBuff.toString()) < result[0]) {
                    result = new long[]{Long.parseLong(numberBuff.toString()), i, j};
                }
                numberBuff.deleteCharAt(j);
            }
            numberBuff.insert(i, charToMove);
        }
        return result;
    }
}
