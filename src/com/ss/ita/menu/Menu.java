package com.ss.ita.menu;

import com.ss.ita.util.implementation.ConsoleScanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Menu {
    HashMap<Integer, List<String>> myHashMap = new HashMap<>();
    List<String> kataTaskName = new ArrayList<>();
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
        initMap();
        initKatas();
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
        try{
            return ToDo.valueOf((choose));
        }
        catch (IllegalArgumentException error) {
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
        int kataNumber = sc.readInt();;
        printList(myHashMap.get(kataNumber));
        System.out.println("\nPlease enter a number of method to run:");
        int method = sc.readInt();
        System.out.println("\nThere are 8 authors:");
        printAuthorsData();
        System.out.println("\nPlease enter a id of Author:");
        long id = sc.readInt();

        if (isIdCorrect(id)) {
            runner = new Runner(UserNames.getById(id));
            runTask(method);
        }

        return showIntro(sc);
    }

    private void runTask(int taskId) {
            switch (taskId) {
                case 1:
                    runner.runTask1();
                    break;
                case 2:
                    runner.runTask2();
                    break;
                case 3:
                    runner.runTask3();
                    break;
                case 4:
                    runner.runTask4();
                    break;
                case 5:
                    runner.runTask5();
                    break;
                case 6:
                    runner.runTask6();
                    break;
                case 7:
                    runner.runTask7();
                    break;
                case 8:
                    runner.runTask8();
                    break;
                case 9:
                    runner.runTask9();
                    break;
                case 10:
                    runner.runTask10();
                    break;
                case 11:
                    runner.runTask11();
                    break;
                case 12:
                    runner.runTask12();
                    break;
                case 13:
                    runner.runTask13();
                    break;
                case 14:
                    runner.runTask14();
                    break;
                case 15:
                    runner.runTask15();
                    break;
                case 16:
                    runner.runTask16();
                    break;
                case 17:
                    runner.runTask17();
                    break;
                case 18:
                    runner.runTask18();
                    break;
                case 19:
                    runner.runTask19();
                    break;
                case 20:
                    runner.runTask20();
                    break;
                case 21:
                    runner.runTask21();
                    break;
                case 22:
                    runner.runTask22();
                    break;
                case 23:
                    runner.runTask23();
                    break;
                case 24:
                    runner.runTask24();
                    break;
            }
    }


    public void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void printKata() {
        for (int number : myHashMap.keySet()) {
            System.out.println(number);
        }
    }

    public boolean isIdCorrect(long id) {
        for (UserNames user : UserNames.values()) {
            if (id ==(user.getId())) {
                return true;
            }
        }
        System.out.println("Id was typed incorrect");
        return false;
    }

    public void printAuthorsData() {
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
        kata8.add("1 Keep Hydrated!");
        kata8.add("2 Volume of a cuboid");
        kata8.add("3 Miles per gallon to kilometers per liter");
        kata8.add("4 To square root or no to square");
        kata8.add("5 Count of positives / sum of negatives");
        kata8.add("6 Convert a String to a Number!");
        kata8.add("7 Willson primes");
        kata8.add("8 Formatting decimal places");
        kata8.add("9 Find numbers which are divisible by given number");
        kata7.add("10 Looking for a benefactor");
        kata7.add("11 Sum of the first nth term of Series");
        kata7.add("12 Where is Vasya?");
        kata6.add("13 Build a pile of Cubes");
        kata6.add("14 Easy balance checking");
        kata6.add("15 Floating-point Approximation (I)");
        kata6.add("16 Rainfall");
        kata6.add("17 Ranking NBA");
        kata6.add("18 Help the bookseller!");
        kata5.add("19 Artificial Rain");
        kata5.add("20 Gap in Primes");
        kata5.add("21 Trailing zeros in factorial");
        kata5.add("22 Perimeter of squares in a rectangle");
        kata5.add("23 Which x for that sum?");
        kata5.add("24 Find the smallest");
    }
}
