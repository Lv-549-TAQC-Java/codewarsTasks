package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {

    @Override

    public int Liters(double time)  {

        int amount = (int)time /2;
        return amount;

    }
}
