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
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
