package com.ss.ita.kata;

public interface Eight {
    int Liters(double time);

    default double getVolumeOfCuboid(final double length, final double width, final double height) {
        return 0;
    }
}
