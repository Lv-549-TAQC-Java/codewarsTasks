package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int Liters(double time) {
        final double WATER = 0.5;
        double count = time * WATER;
        return ((int) count);
    }
}
