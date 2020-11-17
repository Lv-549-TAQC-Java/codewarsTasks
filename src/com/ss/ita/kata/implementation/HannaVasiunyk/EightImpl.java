package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }
}
