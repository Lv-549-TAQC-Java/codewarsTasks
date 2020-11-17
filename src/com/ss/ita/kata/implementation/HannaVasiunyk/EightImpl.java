package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for  (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int)sqrt;
            } else {
                array[i] =(int)Math.pow(array[i], 2);
            }
        }
        return array;
    }
}
