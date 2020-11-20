package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        int count = 0;
        double sum = 0;
        for (double v : arr) {
            sum = sum + v;
            count++;
        }
        long result = (long) Math.ceil((navg * (count + 1) - sum));
        if (result > 0) {
            return result;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String seriesSum(int n) {
        double result = 1;
        double divider = 1;
        if (n <= 0){
            result = 0;
        } else {
            for (int i = 1; i < n; i++) {
                divider = divider + 3;
                result= result + (1/divider);
            }
        }
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
