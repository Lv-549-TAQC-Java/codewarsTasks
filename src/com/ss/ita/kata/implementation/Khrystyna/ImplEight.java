package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Eight;

public class ImplEight implements Eight {
    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        for (int item : input) {
            if (item > 0) {
                result[0]++;
            } else {
                result[1] += item;
            }
        }
        return result;
    }
}
