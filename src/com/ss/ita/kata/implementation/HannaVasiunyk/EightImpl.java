package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public float mpgToKPM(float mpg) {
        final double imperial = 4.54609188;
        final double km = 1.61;
        float convert =  (mpg / (float)imperial) * (float)km;
        return (Math.round(convert * 100) / 100.f);
    }
}

