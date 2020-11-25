package com.ss.ita.menu;

import com.ss.ita.util.implementation.ConsoleScanner;


import java.util.*;

public class Menu {
    HashMap<Integer, List<String>> myHashMap = new HashMap<>();
    List<String> authors = new ArrayList<>();
    List<Kata> katas = new LinkedList<>();
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
        initKatasList();
        initKatas();
        initMap();
        initAuthours();
    }

    private void setUserImpl(){
        System.out.println("select id of user: ");
        UserNames user;
        do {
            printAuthoursName();
            long id = scanner.readLong();
            user = UserNames.getById(id);
        }
        while(user == null);
        runner.setImpl(user);
    }
    private void initKatasList() {
        katas.add(new KataFive());
        katas.add(new KataSix());
        katas.add(new KataSeven());
        katas.add(new KataEight());
    }

    public void mainMenu() {
        System.out.println("Hi user!");
        boolean active = true;
        while (active) {
            switch (choose) {
                case Find: {
                    choose = tasksKata(scanner.);
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

    public ToDo showIntro(Scanner sc) {
        System.out.println("\nWhat are you going to do?");
        System.out.println("Find tasks by kata.");
        System.out.println("Exit.");

        ToDo choose;
        do {
            choose = getUserChoose(sc.next());
        } while (!(choose == ToDo.Find || choose.equals(ToDo.Exit)));

        return choose;
    }

    public ToDo tasksKata(Scanner sc) {
        System.out.println("\nWe have such katas:");
        printKata();
        System.out.println("\nPlease enter a number of kata:");
        int kataNumber = sc.nextInt();
        printList(myHashMap.get(kataNumber));
        System.out.println("\nPlease enter a number of method to run:");
        int method = sc.nextInt();
        System.out.println("\nThere are 8 authors:");
        printAuthoursName();
        System.out.println("\nPlease enter a name:");
        String name = sc.next();

        if (isNameCorrect(name)) {
            Kata kata = getByNumber(kataNumber);
            kata.runMethod(method, name);
        }

        return showIntro(sc);
    }

    private Kata getByNumber(Integer number) {
        for (Kata kata : katas) {
            if (number.equals(kata.getNumber())) {
                return kata;
            }
        }
        return null;
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

    public void initAuthours() {

        authors.add("Khrystyna");
        authors.add("Hanna");
        authors.add("Vadym");
        authors.add("Mike");
        authors.add("Maria");
        authors.add("Andrii");
        authors.add("Nastia");
        authors.add("Yurii");
    }

    public boolean isNameCorrect(String name) {
        for (String author : authors) {
            if (name.equals(author)) {
                return true;
            }
        }
        System.out.println("Name was typed incorrect");
        return false;
    }

    public void printAuthoursName() {
        for (UserNames user : UserNames.values()){
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
