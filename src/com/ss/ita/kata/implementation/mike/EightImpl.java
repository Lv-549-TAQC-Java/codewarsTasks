package com.ss.ita.kata.implementation.mike;

public class EightImpl implements com.ss.ita.kata.Eight {
    @Override
    public int Liters(double time) {
        return  (int) (time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (double)(length*width*height);
    }

}
