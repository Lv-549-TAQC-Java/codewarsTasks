package com.ss.ita.menu;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;
import com.ss.ita.util.Scanner;
import com.ss.ita.util.implementation.ConsoleScanner;

import java.util.Arrays;

public class Runner {
    private Eight impl8;
    private Seven impl7;
    private Six impl6;
    private Five impl5;
    private Scanner scanner;

    public Runner() {
        scanner = new ConsoleScanner();

    }

    public Runner(UserNames whose) {
        scanner = new ConsoleScanner();
        setImpl(whose);

    }

    public void setImpl(UserNames whose) {

        switch (whose) {
            case HANNA: {
                this.impl8 = new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.HannaVasiunyk.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.HannaVasiunyk.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl();
            }
            case KHRYSTYNA: {
                this.impl8 = new com.ss.ita.kata.implementation.Khrystyna.ImplEight();
                this.impl7 = new com.ss.ita.kata.implementation.Khrystyna.ImplSeven();
                this.impl6 = new com.ss.ita.kata.implementation.Khrystyna.ImplSix();
                this.impl5 = new com.ss.ita.kata.implementation.Khrystyna.ImplFive();
            }
            case VADYM: {
                this.impl8 = new com.ss.ita.kata.implementation.vadkostuk.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.vadkostuk.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.vadkostuk.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.vadkostuk.FiveImpl();
            }
            case MIKE: {
                this.impl8 = new com.ss.ita.kata.implementation.mike.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.mike.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.mike.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.mike.FiveImpl();
            }
            case MARIA: {
                this.impl8 = new com.ss.ita.kata.implementation.Maria.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Maria.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Maria.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Maria.FiveImpl();
            }
            case ANDRII: {
                this.impl8 = new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.AndriiTurianskyi.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl();
            }
            case NASTIA: {
                this.impl8 = new com.ss.ita.kata.implementation.Nastia3.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Nastia3.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Nastia3.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Nastia3.FiveImpl();
            }
            case YURII: {
                this.impl8 = new com.ss.ita.kata.implementation.Krynytsky.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Krynytsky.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Krynytsky.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Krynytsky.FiveImpl();
            }

        }


    }

    public String runTask1() {
        System.out.println("run task Keep Hydrated!");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.liters(input));
        System.out.println(res);
        return res;
    }

    public void runTask19() {
        System.out.println("run task Artificial Rain");
        System.out.println("Enter int[] value, for finish array press Enter");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(impl5.artificialRain(input));
        System.out.println("Result: " + res);
    }

    public void runTask20() {
        System.out.println("run task Gap in Primes");
        System.out.println("Enter (int g, long m, long n) where:" +
                "\ng->(integer >= 2) which indicates the gap we are looking for" +
                "\nm->(integer > 2) which gives the start of the search (m inclusive)" +
                "\nn-> (integer >= m) which gives the end of the search (n inclusive)");
        System.out.println("Enter g:");
        int inputG = scanner.readInt();
        System.out.println("Enter m:");
        long inputM = scanner.readLong();
        System.out.println("Enter n:");
        long inputN = scanner.readLong();
        String res = Arrays.toString(impl5.gap(inputG, inputM, inputN));
        System.out.println("Result: " + res);
    }

    public void runTask21() {
        System.out.println("run task Trailing zeros in factorial");
        System.out.println("Enter your number (int)");
        int input = scanner.readInt();
        String res = String.valueOf(impl5.zeros(input));
        System.out.println("Result: " + res);
    }

}
