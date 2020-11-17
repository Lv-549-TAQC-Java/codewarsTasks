package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int Liters(double time) {
        return (int)Math.floor(time/2);
    }
}
