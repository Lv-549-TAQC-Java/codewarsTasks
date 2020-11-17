package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override
    public int Liters(double time) {
        if (time >= 0) {
            double literPerHour = 0.5;
            double result = time * literPerHour;
            return (int) result;
        } else {
            throw new IllegalArgumentException("time can't be less than 0");
        }
    }
}
