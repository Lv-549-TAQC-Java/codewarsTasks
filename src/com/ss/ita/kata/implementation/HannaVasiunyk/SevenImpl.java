package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        int result = 0;
        for (double anArr : arr) {
            sum += anArr;
            double number = navg * (arr.length + 1) - sum;
            if (number > 0) {
                result = (int) Math.ceil(number);
            } else throw new IllegalArgumentException("--Exception 1--");
        }
        return result;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        double q = 1;
        if (n <= 0){
            sum = 0;
        } else for (int i = 0; i < n; i++) {
            q = 3 * i + 1;
            sum += 1 / q;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
