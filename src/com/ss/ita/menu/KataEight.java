package com.ss.ita.menu;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl;
import com.ss.ita.kata.implementation.Khrystyna.ImplEight;

import java.util.HashMap;
import java.util.Map;

public class KataEight implements Kata {
    private Map<String, Eight> implEight;

    public KataEight() {
        implEight = new HashMap<>();
        addImpls();
    }
    private void addImpls() {
        implEight.put("Andrii", new EightImpl());
        implEight.put("Hanna", new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl());
        implEight.put("Khrystyna", new ImplEight());
        implEight.put("Yurii", new com.ss.ita.kata.implementation.Krynytsky.EightImpl());
        implEight.put("Vadym", new com.ss.ita.kata.implementation.vadkostuk.EightImpl());
        implEight.put("Maria", new com.ss.ita.kata.implementation.Maria.EightImpl());
        implEight.put("Nastia", new com.ss.ita.kata.implementation.Nastia3.EightImpl());
        implEight.put("Mike", new com.ss.ita.kata.implementation.mike.EightImpl());
    }

    @Override
    public Integer getNumber() {
        return 8;
    }

    @Override
    public void runMethod(Integer numberOfMethod, String user) {

    }
}
