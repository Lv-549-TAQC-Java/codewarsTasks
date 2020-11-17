package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Eight;

public class ImplEight implements Eight {
    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt % 1 == 0) {
                array[i] = (int) sqrt;
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }
}
