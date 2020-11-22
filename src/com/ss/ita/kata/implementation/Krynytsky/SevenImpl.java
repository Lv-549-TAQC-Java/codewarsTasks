package com.ss.ita.kata.implementation.Krynytsky;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int hisPosition = p - bef;
        for (int i = bef + 1; i < p - aft; i++) {
            hisPosition--;
        }
        return hisPosition;
    }
}
