package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;

import java.util.List;
import java.util.stream.Collectors;

public class ImplSix implements Six {

    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        List<String> books = book
                .lines()
                .map(line -> line.replaceAll("[^\\s\\w.]", ""))
                .map(line -> line.replaceAll("\\s{1,5}", " "))
                .collect(Collectors.toList());
        StringBuilder retString = new StringBuilder("Original Balance: " + books.get(0));
        double balance = Double.parseDouble(books.get(0));
        books.remove(0);
        double totalSum = 0;
        for (String myBook : books) {
            String[] arr = myBook.split(" ");
            double price = Double.parseDouble(arr[arr.length - 1]);
            totalSum += price;
            balance -= price;
            retString.append("\n").append(myBook).append(" Balance ").append(String.format("%.2f", balance));
        }
        retString.append("\nTotal expense  ").append(String.format("%.2f", totalSum));
        retString.append("\nAverage expense  ").append(String.format("%.2f", totalSum / books.size()));
        return retString.toString();
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
