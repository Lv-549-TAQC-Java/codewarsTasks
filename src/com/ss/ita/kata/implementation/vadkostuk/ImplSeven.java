package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Seven;

public class ImplSeven implements Seven {
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
        for (int i = 1; i <=p-bef ; i++) {
            if (i>aft || i==p-bef){
                return i;
            }
        }
        return 0;
    }
}
