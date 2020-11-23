package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

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
        ArrayList<Long> primal = new ArrayList<>();
        long[] result = new long[2];
        for (long i = m; i < n; ++i) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                primal.add(i);
        }
        if (primal.isEmpty()) {
            return null;
        }
        boolean status = false;
        for (int i = 1; i < primal.size(); i++) {
            if ((primal.get(i) - primal.get(i - 1)) == g) {
                result[0] = primal.get(i - 1);
                result[1] = primal.get(i);
                status = true;
                break;
            }
        }
        if (status) {
            return result;
        } else {
            return null;
        }
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
