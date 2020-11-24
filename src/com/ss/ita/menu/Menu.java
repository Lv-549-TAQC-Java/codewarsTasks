package com.ss.ita.menu;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Menu {
    HashMap<Integer, List<String>> myHashMap = new HashMap<>();
    List<String> kata8 = new ArrayList<String>();
    List<String> kata7 = new ArrayList<>();
    List<String> kata6 = new ArrayList<>();
    List<String> kata5 = new ArrayList<>();
    ToDo choose = ToDo.Find;
    Scanner scanner=new Scanner(System.in);

    public void mainMenu() {
        System.out.println("Hi user! Choose your kata");
        while (true) {
            switch (choose) {
                case Find:
                case Exit:
                case Intro:
                    default:{

                    }
            }
        }
    }

    public void showIntro(Scanner sc) {
        System.out.println("\nWhat are you going to do?");
        System.out.println("1.Find kata");
        System.out.println("2.Exit");
    }

    public void initMap() {
        myHashMap.put(5, getKata5());
        myHashMap.put(6, getKata6());
        myHashMap.put(7, getKata7());
        myHashMap.put(8, getKata8());
    }

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

    public List<String> getKata5() {
        return kata5;
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

    public void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }
    }

}
