package com.ss.ita.menu;


import com.ss.ita.util.Scanner;
import com.ss.ita.util.implementation.ConsoleScanner;


public class Menu {


      Scanner scanner = new ConsoleScanner();


    public void mainMenu() {
        System.out.println("Hi user!");
        boolean active = true;
        while (active) {
            showIntro();
            int introChoose = this.scanner.readInt();
            switch (introChoose) {
                case 1: {
                    KataMenu kataMenu = new KataMenu();
                    kataMenu.chooseKata(scanner);
                    Kata kata = kataMenu.getKataByNumber();
                    Users users = new Users();
                    users.chooseUser(scanner);
                    kata.getTasks(scanner);
                    kata.runTask(users.getUserNumber());

                    break;
                }
                case 2: {
                    active = false;
                    break;
                }
                default: {
                    System.out.println("Incorrect input");
                    break;

                }
            }
        }
    }


    public void showIntro() {
        System.out.println("\nWhat are you going to do?");
        System.out.println("1.Find kata");
        System.out.println("2.Exit");
        System.out.println("Enter your chose..");
    }

    public void showKata() {
        System.out.println("\nChoose kata:");
        System.out.println("5.Five");
        System.out.println("6.Six");
        System.out.println("7.Seven");
        System.out.println("8.Eigth");
    }

    public void showKata8() {
        System.out.println("\nChoose task:");
        System.out.println("1.Keep Hydrated!");
        System.out.println("2.Volume of a cuboid");
        System.out.println("3.Miles per gallon to kilometers per liter");
        System.out.println("4.To square root or no to square");
        System.out.println("5.Count of positives / sum of negatives");
        System.out.println("6.Convert a String to a Number!");
        System.out.println("7.Willson primes");
        System.out.println("8.Formatting decimal places");
        System.out.println("9.Find numbers which are divisible by given number");
    }

    public void showKata7() {
        System.out.println("\nChoose task:");
        System.out.println("1.Looking for a benefactor");
        System.out.println("2.Sum of the first nth term of Series");
        System.out.println("3.Where is Vasya?");
    }

    public void showKata6() {
        System.out.println("\nChoose task:");
        System.out.println("1.Build a pile of Cubes");
        System.out.println("2.Floating-point Approximation (I)");
        System.out.println("3.Help the bookseller!");
        System.out.println("4.Rainfall");
        System.out.println("5.Ranking NBA");
        System.out.println("6.Easy balance checking");

    }

    public void showKata5() {
        System.out.println("\nChoose task:");
        System.out.println("1.Artificial Rain");
        System.out.println("2.Gap in Primes");
        System.out.println("3.Trailing zeros in factorial");
        System.out.println("4.Perimeter of squares in a rectangle");
        System.out.println("5.Which x for that sum?");
        System.out.println("6.Find the smallest");
    }




}
