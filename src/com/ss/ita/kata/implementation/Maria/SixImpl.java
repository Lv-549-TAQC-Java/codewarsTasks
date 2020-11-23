package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Six;
import java.util.ArrayList;
import java.util.List;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long total = 0;
        long n = 0;

        while(total < m) {
            n++;
            total += Math.pow(n, 3);
        }

        return total == m ? n : -1;
    }

    @Override
    public String balance(String book) {
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: ");
        double totalExpense = 0;
        double averageExpense;
        int counter =0;

        String[] lines = book.replaceAll("[^a-zA-Z0-9\n. ]", "").split("\n+");

        double balance = Double.valueOf(lines[0]);
        result.append(String.format("%.2f", balance)).append("\\r\\n");

        for(int i = 1; i<lines.length; i++){
            String[] items = lines[i].split(" ");
            List<String> itemsList = new ArrayList<String>();
            for(String s: items ){
                itemsList.add(s);
            }
            String price = itemsList.get(itemsList.size()-1);
            totalExpense = totalExpense + (Double.valueOf(price));
            counter++;
            itemsList.add("Balance");
            balance = balance - Double.valueOf(price);
            balance =  Math.round(balance*100)/100D;

            itemsList.add(String.format("%.2f", balance));
            String temp = "";
            for(int j =0; j<itemsList.size(); j++){
                temp = temp + itemsList.get(j)+" ";
            }
            temp = temp.substring(0,temp.length()-1)+"\\r\\n";
            result.append(temp);
        }
        averageExpense = totalExpense/counter;

        return  result.append("Total expense  ")
                .append(String.format("%.2f", (Math.round(totalExpense * 100.0) / 100.0))).append("\\r\\n").append("Average expense  ")
                .append(String.format("%.2f", (Math.round(averageExpense * 100.0) / 100.0))).toString();
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
