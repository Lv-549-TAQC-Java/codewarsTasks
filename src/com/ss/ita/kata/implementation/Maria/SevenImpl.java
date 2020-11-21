package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        for (int i = 1; i < n*3; i+=3) {
            sum += 1.0/i;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int position = 0;
        int x = p - bef;

        while (position <= aft && position < x) {
            ++position;
        }
        return position;
    }
}
