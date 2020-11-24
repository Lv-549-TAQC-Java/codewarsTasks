package com.ss.ita.menu;

import com.ss.ita.util.Scanner;

public class KataMenu {

    private int kataNumber;


    public void chooseKata(final Scanner scanner) {
        System.out.println("\nChoose kata:");
        System.out.println("5.Five");
        System.out.println("6.Six");
        System.out.println("7.Seven");
        System.out.println("8.Eigth");
        System.out.println("Enter your choose: ");
        this.kataNumber = scanner.readInt();
    }

    public Kata getKataByNumber() {
        switch (this.kataNumber) {
            case 5: {
                return new KataFive();
            }

        }
        return null;

    }


}

