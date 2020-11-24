package com.ss.ita.menu;
import com.ss.ita.kata.Six;
import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;


import java.util.Scanner;

public class ImplementationsOfKata {
    private static Scanner scanner = new Scanner(System.in);
    private Eight eightKatas;
    private Seven sevenKatas;


    public static String returnName(){
        return scanner.nextLine();
    }

    public void chooseKatasByName(String name){
        switch (name){
            case "vadkostuk":
                this.eightKatas = new com.ss.ita.kata.implementation.vadkostuk.EightImpl();
                this.sevenKatas = new com.ss.ita.kata.implementation.vadkostuk.SevenImpl();
            default:
                System.out.println("null");
        }
    }

    public void chooseTask(int task){
        switch (task){
            case 1:
                taskKeepHydrated();
                break;
        }

    }
    public int taskKeepHydrated(){
        System.out.println("Enter double value");
        double litres = scanner.nextInt();
        return eightKatas.liters(litres);
    }
}
