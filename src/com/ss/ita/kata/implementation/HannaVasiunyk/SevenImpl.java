package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
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
