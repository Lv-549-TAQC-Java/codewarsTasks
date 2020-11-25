package com.ss.ita.menu;

import com.ss.ita.kata.Seven;
import com.ss.ita.kata.implementation.HannaVasiunyk.SevenImpl;
import com.ss.ita.kata.implementation.Khrystyna.ImplSeven;

import java.util.HashMap;
import java.util.Map;

public class KataSeven implements Kata {
    private Map<String, Seven> implSeven;


    public KataSeven() {
        implSeven = new HashMap<>();
        addImpls();
    }


    private void addImpls() {
        implSeven.put("Khrystyna", new ImplSeven());
        implSeven.put("Hanna", new SevenImpl());
        implSeven.put("Mike", new com.ss.ita.kata.implementation.mike.SevenImpl());
        implSeven.put("Vadym", new com.ss.ita.kata.implementation.vadkostuk.SevenImpl());
        implSeven.put("Andrii", new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl());
        implSeven.put("Maria", new com.ss.ita.kata.implementation.Maria.SevenImpl());
        implSeven.put("Nastia", new com.ss.ita.kata.implementation.Nastia3.SevenImpl());
        implSeven.put("Yurii", new com.ss.ita.kata.implementation.Krynytsky.SevenImpl());

    }


    @Override
    public Integer getNumber() {
        return 7;
    }

    @Override
    public void runMethod(Integer numberOfMethod, String user) {
        Seven seven = implSeven.get(user);
        switch (numberOfMethod) {
            case 1: {
                System.out.println(seven.newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90));
                break;
            }
            case 2: {
                System.out.println(seven.seriesSum(5));
                break;
            }

            case 3: {
                System.out.println(seven.whereIsHe(3, 1, 1));
                break;
            }

            default:
                throw new IllegalStateException("We haven`t method with this number");
        }



    }
}
