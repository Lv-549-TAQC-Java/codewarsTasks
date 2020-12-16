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
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }

        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int result = 0;
        while (n > 1) result += n /= 5;
        return result;
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
        double d = 4*m + 1;
        return ((2*m+1) - Math.sqrt(d))/(2*m);
    }

    @Override
    public long[] smallest(long n) {
        long[] arr = new long[3];
        long min = n;
        String str = n + "";
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                StringBuffer sb = new StringBuffer(str);
                char ch = sb.charAt(i);
                sb.deleteCharAt(i);
                sb.insert(j, ch);
                long num = Long.valueOf(sb.toString());
                if(num < min){
                    min = num;
                    arr[0] = min;
                    arr[1] = i;
                    arr[2] = j;
                }
            }
        }
        return arr;
    }
}
