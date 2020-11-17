package com.ss.ita.kata.implementation.mike;

public class EightImpl implements com.ss.ita.kata.Eight {
    @Override
    public int Liters(double time) {
        return  (int) (time / 2);
    }
}
