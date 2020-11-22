package com.ss.ita.kata.implementation.Krynytsky;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double nextDonationContribution;
        double existDonationSum = 0;
        if (navg <= 0) {
            throw new IllegalArgumentException("navg is less or equals 0");
        }
        for (double existDonat : arr) {
            existDonationSum += existDonat;
        }
        if (existDonationSum / (arr.length) > navg) {
            throw new IllegalArgumentException("navg less than previous");
        } else {
            nextDonationContribution = Math.ceil(navg * (arr.length + 1) - existDonationSum);
        }
        return (long) nextDonationContribution;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
