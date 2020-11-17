package com.ss.ita.kata.implementation.Krynytsky;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int Liters(double time) {
        final double REQUIRED_AMOUNT_OF_WATER = 0.5;
        double minLiters = time * REQUIRED_AMOUNT_OF_WATER;
        return (int) minLiters;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }
}
