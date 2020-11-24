package com.ss.ita.menu;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Menu {
    HashMap<Integer, List<String>> myHashMap = new HashMap<>();
    List<String> kata8 = new ArrayList<>();
    List<String> kata7 = new ArrayList<>();
    List<String> kata6 = new ArrayList<>();
    List<String> kata5 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public HashMap<Integer, List<String>> getMyHashMap() {
        return myHashMap;
    }

    public List<String> getKata8() {
        return kata8;
    }

    public List<String> getKata7() {
        return kata7;
    }

    public List<String> getKata6() {
        return kata6;
    }

    ToDo choose = ToDo.Find;

    public List<String> getKata5() {
        return kata5;
    }

    public void mainMenu() {
        System.out.println("Hi user!");
        while (true) {
            switch (choose) {
                case Find: {
                    printKata();
                    choose = tasksKata(scanner);
                    break;
                }
                case Exit: {
                    return;
                }
                case Back: {
                    choose = showIntro(scanner);
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
        return ToDo.valueOf((choose));
    }

    public ToDo showIntro(Scanner sc) {
        System.out.println("\nWhat are you going to do?");
        System.out.println("1.Find tasks by kata.");
        System.out.println("2.Exit.");

        ToDo choose;
        do {
            choose = getUserChoose(sc.next());
        } while (!(choose == choose.Find || choose == choose.Exit || choose == choose.Intro));
        return choose;
    }

    public void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
    }

    public ToDo tasksKata(Scanner sc) {
        System.out.println("Please enter a number of kata:");
        int kata = sc.nextInt();
        printList(myHashMap.get(kata));
        System.out.println("\nPlease enter a number of method to run:");
        int method = sc.nextInt();
        System.out.println("\nPlease enter a name:");
        String name = sc.nextLine();

        switch (name) {
            case "Khrystyna": {

                switch (kata) {
                    case 5: {
                        switch (method) {

                        }
                    }
                }
            }
            case "Vlad": {
                break;
            }
        }

        System.out.println("\nWhat you will do next?");
        System.out.println("1.Find task by user.");
        System.out.println("2.Exit.");
        System.out.println("3.Back.");
        ToDo choose;
        do {
            choose = getUserChoose(sc.next());
        } while (!(choose == choose.Find || choose == choose.Exit || choose == choose.Back));

        return choose;
    }

    public void printKata() {
        for (int number : myHashMap.keySet()) {
            System.out.println(number);
        }
    }

    public void initMap() {
        myHashMap.put(5, getKata5());
        myHashMap.put(6, getKata6());
        myHashMap.put(7, getKata7());
        myHashMap.put(8, getKata8());
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
        kata6.add("Floating-point Approximation (I)");
        kata6.add("Help the bookseller!");
        kata5.add("Artificial Rain");
        kata5.add("Gap in Primes");
        kata5.add("Trailing zeros in factorial");
        kata5.add("Perimeter of squares in a rectangle");
        kata5.add("Which x for that sum?");
        kata5.add("Find the smallest");
    }


}
