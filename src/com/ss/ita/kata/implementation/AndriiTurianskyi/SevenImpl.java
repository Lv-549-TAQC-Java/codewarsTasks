package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Seven;

import java.util.ArrayList;

import java.util.List;

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
        if (n > 1) {
            List<Double> series = new ArrayList<>();
            double denominator = 1;
            for (int i = 1; i <= n; i++) {
                series.add(1 / denominator);
                denominator += 3d;
            }
            double sum = 0;
            for (Double aDouble : series) {
                sum += aDouble;
            }
            return "" + Math.round(100d * sum) / 100d;
        } else return "0.00";
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
