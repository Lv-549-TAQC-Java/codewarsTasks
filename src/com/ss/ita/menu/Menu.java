package com.ss.ita.menu;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {
    HashMap <Integer, List<String>> myHashMap = new HashMap<>();
    List<String> kata8 = new ArrayList<String>();
    List<String> kata7 = new ArrayList<>();
    List<String> kata6= new ArrayList<>();
    List<String> kata5 = new ArrayList<>();

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

    public void initKatas(){
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

    public void printList(List<String> list){
        for(String kataList: list){
            System.out.println(list);
        }
    }

}
