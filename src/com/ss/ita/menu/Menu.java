package com.ss.ita.menu;

import com.ss.ita.util.implementation.ConsoleScanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Menu {
    HashMap<Integer, List<String>> myHashMap = new HashMap<>();
    List<String> kata8 = new ArrayList<>();
    List<String> kata7 = new ArrayList<>();
    List<String> kata6 = new ArrayList<>();
    List<String> kata5 = new ArrayList<>();


    ConsoleScanner scanner;
    Runner runner;
    ToDo choose = ToDo.Intro;

    public Menu() {
        scanner = new ConsoleScanner();
        runner = new Runner();
        initKatas();
        initMap();
    }


    public void mainMenu() {
        System.out.println("Hi user!");
        boolean active = true;
        while (active) {
            switch (choose) {
                case Find: {
                    choose = tasksKata(scanner);
                    break;
                }
                case Exit: {
                    active = false;
                    break;
                }
                case Intro:
                default: {
                    choose = showIntro(scanner);
                    break;
                }
            }
        }
    }

    public ToDo getUserChoose(String choose) {
        try {
            return ToDo.valueOf((choose));
        } catch (IllegalArgumentException error) {
            System.out.println("Please, enter correct choose");
            return null;
        }

    }

    public ToDo showIntro(ConsoleScanner sc) {
        System.out.println("\nWhat are you going to do?");
        System.out.println("Please, type \"Find\" to show katas," +
                " or \"Exit\" to close the program");

        ToDo choose;
        do {
            choose = getUserChoose(sc.readString());
        } while (!(choose == ToDo.Find || choose.equals(ToDo.Exit)));

        return choose;
    }

    public ToDo tasksKata(ConsoleScanner sc) {
        System.out.println("\nWe have such katas:");
        printKata();
        System.out.println("\nPlease enter a number of kata:");
        int kataNumber = sc.readInt();
        printList(myHashMap.get(kataNumber));
        System.out.println("\nPlease enter a number of method to run:");
        int method = sc.readInt();
        System.out.println("\nThere are 8 authors:");
        printAuthoursData();
        System.out.println("\nPlease enter a number of name:");
        long name = sc.readLong();

        if (isNameCorrect(name)) {
            Runner runner = new Runner(UserNames.getById(name));
            kataSelection(kataNumber,method,runner);
        }

        return showIntro(sc);
    }

    public void kataSelection(int kataNumber,int method, Runner runner){
        switch (kataNumber){
            case 5:{

            }
            case 6:{

            }
            case 7:{
                selectMethodFromKataSeven(method,runner);
                break;
            }
            case 8:{

            }
        }
    }

    public void selectMethodFromKataSeven(int method, Runner runner) {
        switch (method) {
            case 1: {
                runner.runTask10();
                break;
            }
            case 2: {
                runner.runTask11();
                break;
            }
            case 3: {
                runner.runTask12();
                break;
            }
        }
    }


    public void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
    }

    public void printKata() {
        for (int number : myHashMap.keySet()) {
            System.out.println(number);
        }
    }

    public boolean isNameCorrect(long name) {
        if (name >= 1 && name <= UserNames.values().length) {
            return true;
        }
        System.out.println("Name was typed incorrect");
        return false;
    }

    public void printAuthoursData() {
        for (UserNames user : UserNames.values()) {
            System.out.println(user.getId() + " " + user.getName());
        }
    }

    public void initMap() {
        myHashMap.put(5, kata5);
        myHashMap.put(6, kata6);
        myHashMap.put(7, kata7);
        myHashMap.put(8, kata8);
    }

    public void initKatas() {
        kata8.add("Keep Hydrated!");
        kata8.add("Volume of a cuboid");
        kata8.add("Miles per gallon to kilometers per liter");
        kata8.add("To square root or no to square");
        kata8.add("Count of positives / sum of negatives");
        kata8.add("Convert a String to a Number!");
        kata8.add("Willson primes");
        kata8.add("Formatting decimal places");
        kata8.add("Find numbers which are divisible by given number");
        kata7.add("Looking for a benefactor");
        kata7.add("Sum of the first nth term of Series");
        kata7.add("Where is Vasya?");
        kata6.add("Build a pile of Cubes");
        kata6.add("Easy balance checking");
        kata6.add("Floating-point Approximation (I)");
        kata6.add("Rainfall");
        kata6.add("Ranking NBA");
        kata6.add("Help the bookseller!");
        kata5.add("Artificial Rain");
        kata5.add("Gap in Primes");
        kata5.add("Trailing zeros in factorial");
        kata5.add("Perimeter of squares in a rectangle");
        kata5.add("Which x for that sum?");
        kata5.add("Find the smallest");
    }
}
