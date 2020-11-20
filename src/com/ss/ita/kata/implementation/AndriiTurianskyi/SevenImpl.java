package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sumElem = 0;
        for (double elem : arr) {
            sumElem += elem;
        }
        double donation = Math.ceil((navg * (arr.length + 1)) - sumElem);
        if (donation > 0) {
            return (long) donation;
        } else throw new IllegalArgumentException();

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
