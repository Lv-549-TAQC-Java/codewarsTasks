package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Seven;

public class ImplSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double result = 0;
        int divider = 1;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / divider;
            divider += 3;
        }
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
