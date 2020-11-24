package com.ss.ita.menu;

import com.ss.ita.kata.Five;
import com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl;
import com.ss.ita.kata.implementation.Khrystyna.ImplFive;

import java.math.BigInteger;
import java.util.Arrays;
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
        implFive.put("Andrii", new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl());
        implFive.put("Maria", new com.ss.ita.kata.implementation.Maria.FiveImpl());
        implFive.put("Nastia", new com.ss.ita.kata.implementation.Nastia3.FiveImpl());
        implFive.put("Yurii", new com.ss.ita.kata.implementation.Krynytsky.FiveImpl());

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
                System.out.println("input: [1, 2, 1, 2, 1]");
                System.out.println("result = " + five.artificialRain(new int[]{1, 2, 1, 2, 1}));
                break;
            }
            case 2: {
                System.out.println("input: (8, 300, 400)");
                System.out.println("result = " + Arrays.toString(five.gap(8,300,400)));
                break;
            }
            case 3: {
                System.out.println("input: 6");
                System.out.println("result = " + five.zeros(6));
                break;
            }
            case 4: {
                System.out.println("input: 7");
                System.out.println("result = " + five.perimeter(BigInteger.valueOf(7)));
                break;
            }
            case 5: {
                System.out.println("input: 2.00");
                System.out.println("result = " + five.solveSum(2.00));
                break;
            }
            case 6: {
                System.out.println("input: 261235");
                System.out.println("result = " + Arrays.toString(five.smallest(261235)));
                break;
            }

//            TODO
            default:
                new IllegalStateException("We haven`t method with this number");
        }
    }
}
