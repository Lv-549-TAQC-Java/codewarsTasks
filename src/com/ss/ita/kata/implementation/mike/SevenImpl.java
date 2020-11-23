package com.ss.ita.kata.implementation.mike;

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
        int result = 0;
        for (int i = 1; i <= p; i++) {
            if ((i > bef) && (i >=aft )) {
                result++;
            }
        }
        return result;
    }
}
