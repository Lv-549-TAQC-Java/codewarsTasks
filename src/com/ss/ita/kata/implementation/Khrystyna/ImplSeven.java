package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Seven;

public class ImplSeven implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (navg < 0) {
            throw new IllegalArgumentException();
        }
        double donation = 0;
        for (double donat : arr) {
            donation += donat;
        }
        if (donation / arr.length > navg) {
            throw new IllegalArgumentException();
        } else {
            donation = navg * (arr.length + 1) - donation;
        }
        return Math.round(donation);
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
