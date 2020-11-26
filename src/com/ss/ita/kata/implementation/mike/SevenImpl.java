package com.ss.ita.kata.implementation.mike;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        double result = (arr.length+ 1) * navg - sum;
        if(result > 0){
            return (long) (Math.ceil(result));
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String seriesSum(int n) {
        float sum = 0f;
        float baseNumber = 1f;

        if(n < 0) {
            sum = 0;
        } else {
            for (int i = 0; i < n; i++) {

                sum += 1.0 / baseNumber;
                baseNumber += 3;
            }
        }
        return String.format("%.2f", sum);
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
