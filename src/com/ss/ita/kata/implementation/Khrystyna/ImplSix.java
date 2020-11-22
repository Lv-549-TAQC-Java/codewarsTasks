package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;

import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.stream.Collectors;

public class ImplSix implements Six {
    @Override
    public long findNb(long m) {
        long count = 1;
        while (m > 0) {
            m -= count * count * count;
            count++;
        }
        return m < 0 ? -1 : count - 1;
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
        BigDecimal bigX = new BigDecimal(x);
        return bigX.add(BigDecimal.ONE).sqrt(MathContext.DECIMAL128).subtract(BigDecimal.ONE).doubleValue();
    }

    @Override
    public double mean(String town, String string) {
        String[] townRecords = string.split("\n");
        double rain = 0;
        int counter = 0;
        for (String record : townRecords) {
            String[] array = record.split(":");
            if (town.equals(array[0])) {
                String[] months = array[1].split(",");
                for (String month : months) {
                    rain += Double.parseDouble(month.split(" ")[1]);
                    counter++;
                }
            }
        }
        return counter == 0 ? -1.0 : rain / counter;
    }

    @Override
    public double variance(String town, String string) {
        String[] townRecords = string.split("\n");
        double variance = 0;
        int counter = 0;
        double average = mean(town, string);
        for (String record : townRecords) {
            String[] array = record.split(":");
            if (town.equals(array[0])) {
                String[] months = array[1].split(",");
                for (String month : months) {
                    double current = Double.parseDouble(month.split(" ")[1]);
                    variance += (current - average) * (current - average);
                    counter++;
                }
            }
        }
        return counter == 0 ? -1.0 : variance / counter;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> hash = new HashMap<>();
        for (String letter : lstOf1stLetter) {
            hash.put(letter, 0);
        }
        for (String art : lstOfArt) {
            if (hash.containsKey(String.valueOf(art.charAt(0)))) {
                int count = Integer.parseInt(art.split(" ")[1]);
                hash.replace(String.valueOf(art.charAt(0)), count + hash.get(String.valueOf(art.charAt(0))));
            }
        }
        String res = "";
        Boolean isFirst = true;
        for (Map.Entry<String, Integer> set : hash.entrySet()) {
            if (isFirst) {
                res += "(" + set.getKey() + " : " + set.getValue() + ")";
                isFirst = false;
            } else {
                res += " - (" + set.getKey() + " : " + set.getValue() + ")";
            }
        }
        return res;
    }
}
