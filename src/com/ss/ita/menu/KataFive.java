package com.ss.ita.menu;

import com.ss.ita.kata.Five;
import com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl;
import com.ss.ita.kata.implementation.Khrystyna.ImplFive;

import java.util.HashMap;
import java.util.Map;

public class KataFive implements Kata {
    private Map<String, Five> implFive;


    public KataFive() {
        implFive = new HashMap<>();
        addImpls();
    }

    private void addImpls() {
        implFive.put("Khrystyna", new ImplFive());
        implFive.put("Hanna", new FiveImpl());
        implFive.put("Mike", new com.ss.ita.kata.implementation.mike.FiveImpl());
        implFive.put("Vadym", new com.ss.ita.kata.implementation.vadkostuk.FiveImpl());
        //TODO
    }

    @Override
    public Integer getNumber() {
        return 5;
    }

    @Override
    public void runMethod(Integer numberOfMethod, String user) {
        Five five = implFive.get(user);
        switch (numberOfMethod) {
            case 1: {
                System.out.println(five.artificialRain(new int[]{1, 2, 1, 2, 1}));
                break;
            }
//            TODO
            default:
                new IllegalStateException("We haven`t method with this number");
        }
    }
}
