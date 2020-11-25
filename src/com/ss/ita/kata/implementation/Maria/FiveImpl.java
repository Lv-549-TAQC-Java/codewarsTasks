package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

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
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
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
