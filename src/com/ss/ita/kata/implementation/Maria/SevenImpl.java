package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        int count = 0;
        double sum= 0;
        for (double v : arr) {
            sum = sum + v;
            count++;
        }
        long result = (long)Math.ceil((navg*(count+1)-sum));
        if (result<=0) {
            throw new IllegalArgumentException();
        }else {
            return result;
        }
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int position=0;
        int x = p-bef;
        while (position <= aft && position < x) {
            ++position;
        }
        return position;
    }
}
