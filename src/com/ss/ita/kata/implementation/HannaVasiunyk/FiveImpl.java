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
        long previousPrime = n;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - previousPrime == g) {
                    return new long[]{previousPrime, i};
                }
                previousPrime = i;
            }
        }
        return null;
    }


    @Override
    public int zeros(int n) {
        int zeroSum = 0;
        while (n > 0) {
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
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }

    private boolean isPrime(long n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}