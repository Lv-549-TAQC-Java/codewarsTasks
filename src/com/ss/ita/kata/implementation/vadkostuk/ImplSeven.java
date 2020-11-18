package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Seven;

public class ImplSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
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
