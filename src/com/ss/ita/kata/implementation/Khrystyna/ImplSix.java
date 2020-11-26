package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        return x / (1 + Math.sqrt(1 + x));
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
        if (toFind.isEmpty()) {
            return "";
        }
        if (!resultSheet.contains(toFind)) {
            return toFind + ":This team didn't play!";
        }
        String[] matches = resultSheet.split(",");
        Map<String, Integer[]> matchesResults = new HashMap<>();
        for (String match : matches) {
            if (match.contains(".")) {
                return "Error(float number):" + match;
            }
            int i = 0;
            String[] tmp = match.split(" ");
            String command1 = "";
            Integer score1 = 0;
            while (score1 == 0) {
                try {
                    score1 = Integer.parseInt(tmp[i]);
                } catch (NumberFormatException e) {
                    if (!command1.isEmpty()) {
                        command1 += " ";
                    }
                    command1 += tmp[i];
                    i++;
                }
            }
            i++;
            String command2 = "";
            Integer score2 = 0;
            while (score2 == 0) {
                try {
                    score2 = Integer.parseInt(tmp[i]);
                } catch (NumberFormatException e) {
                    if (!command2.isEmpty()) {
                        command2 += " ";
                    }
                    command2 += tmp[i];
                    i++;
                }
            }
            if (!matchesResults.containsKey(command1)) {
                matchesResults.put(command1, new Integer[]{0, 0, 0, 0, 0, 0});
            }
            if (!matchesResults.containsKey(command2)) {
                matchesResults.put(command2, new Integer[]{0, 0, 0, 0, 0, 0});
            }
            if (score1 == score2) {
                matchesResults.get(command1)[1] += 1;
                matchesResults.get(command2)[1] += 1;
                matchesResults.get(command2)[5] += 1;
                matchesResults.get(command2)[5] += 1;
            } else if (score1 > score2) {
                matchesResults.get(command1)[0] += 1;
                matchesResults.get(command2)[2] += 1;
                matchesResults.get(command1)[5] += 3;
            } else {

                matchesResults.get(command2)[0] += 1;
                matchesResults.get(command1)[2] += 1;
                matchesResults.get(command2)[5] += 3;
            }
            matchesResults.get(command1)[3] += score1;
            matchesResults.get(command2)[4] += score1;
            matchesResults.get(command1)[4] += score2;
            matchesResults.get(command2)[3] += score2;
        }
        if (!matchesResults.containsKey(toFind)) {
            return toFind + ":This team didn't play!";
        }
        Integer[] result = matchesResults.get(toFind);
        return toFind + ":W=" + result[0]
                + ";D=" + result[1]
                + ";L=" + result[2]
                + ";Scored=" + result[3]
                + ";Conceded=" + result[4]
                + ";Points=" + result[5];
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
