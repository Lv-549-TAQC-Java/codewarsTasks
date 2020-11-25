package com.ss.ita.menu;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;
import com.ss.ita.util.Scanner;
import com.ss.ita.util.implementation.ConsoleScanner;

public class Runner {
    private Eight impl8;
    private Seven impl7;
    private Six impl6;
    private Five impl5;
    private Scanner scanner;

    public void setImpl(UserNames whose) {

        switch(whose){
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

    public Runner() {
        scanner = new ConsoleScanner();

    }

    public Runner(UserNames whose) {
        scanner = new ConsoleScanner();
        setImpl(whose);

    }

    public String runTask1(){
        System.out.println("run task Keep Hydrated!");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.liters(input));
        System.out.println(res);
        return res;
    }

    public String runTask11(){
        System.out.println("run task Sum of the first nth term of Series");
        System.out.println("Enter int number");
        int input = scanner.readInt();
        String res = String.valueOf(impl7.seriesSum(input));
        System.out.println(res);
        return res;
    }
    public String runTask12(){
        System.out.println("run task Where is Vasya?");
        System.out.println("Enter ");
        int input1 = scanner.readInt();
        int input2 = scanner.readInt();
        int input3 = scanner.readInt();
        String res = String.valueOf(impl7.whereIsHe(input1, input2, input3));
        System.out.println(res);
        return res;
    }

    public void runTask13() {
        System.out.println("run task Build a pile of Cubes");
        System.out.println("Enter long:");
        long input = scanner.readLong();
        long res = impl6.findNb(input);
        System.out.println("Result is:\n" + res);
    }

    public String runTask5(){
        System.out.println("countPositivesSumNegatives");
        System.out.println("Enter int[]");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(impl8.countPositivesSumNegatives(input));
        System.out.println(res);
        return res;
    }

    public void runTask14() {
        System.out.println("run task Easy balance checking");
        String input = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45" +
                "\n128 Book :14.32\n129 Gasoline ::16.10";
        System.out.println("We have such input for run:\n" + input);
        System.out.println("\nDo you want to change it?\n1-Yes\n2-No");
        if (scanner.readInt() == 1) {
            input = scanner.readString();
        }
        String res = impl6.balance(input);
        System.out.println("Result is:\n" + res);
    }
    public String runTask6(){
        System.out.println("Convert a String to a Number");
        System.out.println("Enter String");
        String input= scanner.readString();
        String res = String.valueOf(impl8.stringToNumber(input));
        System.out.println(res);
        return res;
    }

    public String runTask7(){
        System.out.println("Wilson primes");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.amIWilson(input));
        System.out.println(res);
        return res;
    }

    public void runTask15() {
        System.out.println("run task Floating-point Approximation (I)");
        System.out.println("Enter double:");
        double input = scanner.readDouble();
        double res = impl6.f(input);
        System.out.println("Result is:\n" + res);
    }
}
