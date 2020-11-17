package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Eight;

public class ImplEight implements Eight {
    @Override
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
