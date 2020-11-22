package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if(v.length == 1) {return 1;}
        int maxSize = 0;
        int[] leftFall = new int[v.length];
        int[] rightFall = new int[v.length];

        for(int i = 1; i < v.length; i++)
            if(v[i-1] <= v[i])
                leftFall[i] = leftFall[i-1] + 1;

        for(int i = v.length-2; i >= 0; i--)
            if(v[i+1] <= v[i])
                rightFall[i] = rightFall[i+1] + 1;


        for(int i = 0; i < v.length; i++)
        {
            int currentSize = leftFall[i] + rightFall[i] + 1;
            if(currentSize > maxSize)
                maxSize = currentSize;
        }
        return maxSize;
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
        return null;
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
