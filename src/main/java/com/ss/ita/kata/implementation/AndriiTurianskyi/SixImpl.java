package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Six;

import java.util.Arrays;

import java.util.ArrayList;

import java.util.List;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import java.util.HashMap;

import java.util.Map;

import java.util.stream.Collectors;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        int nOfCubes = 0;
        while (m > 0) {
            m -= Math.pow(nOfCubes + 1, 3);
            nOfCubes++;
        }
        if (m == 0)
            return nOfCubes;
        else return -1;
    }

    @Override
    public String balance(String book) {
        if (book.length() == 0) {
            throw new IllegalArgumentException("String is empty");
        }
        String modBook = book.replaceAll("\n|\r\n", " ");
        StringBuilder editedStr = new StringBuilder();
        for (int i = 0; i < book.length(); i++) {
            if (Character.isLetterOrDigit(modBook.charAt(i)) || modBook.charAt(i) == '.' || modBook.charAt(i) == ' ') {
                editedStr.append(modBook.charAt(i));
            }
        }
        String[] array = editedStr.toString().split(" ");
        StringBuilder resultStr = new StringBuilder();
        double balance = Double.parseDouble(array[0]);
        int countForAv = 0;
        for (int i = 3; i < array.length; i += 3) {
            balance -= Double.parseDouble(array[i]);
            resultStr.append(String.format("\n%s %s %s Balance %.2f", array[i - 2], array[i - 1], array[i], balance));
            countForAv++;
        }
        double totalSum = Double.parseDouble(array[0]) - balance;
        return String.format("Original_Balance: %s %s\nTotal expense  %.2f\nAverage expense  %.2f", array[0], resultStr.toString(), totalSum, (totalSum / countForAv));
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        List<Double> listRainValue = getInfoAboutTown(town, strng);
        double sumRain = 0;
        for (Double value : listRainValue) {
            sumRain += value;
        }
        return sumRain / listRainValue.size();
    }

    @Override
    public double variance(String town, String strng) {
        List<Double> listRainValue = getInfoAboutTown(town, strng);
        double varianceValue = 0;
        double averageValue = mean(town, strng);
        for (int i = 0; i < listRainValue.size(); i++) {
            varianceValue += Math.pow(listRainValue.get(i) - averageValue, 2);
        }
        return varianceValue / listRainValue.size();
    }

    private List<Double> getInfoAboutTown(String town, String strng) {
        List<Double> listRainValue = new ArrayList<>();
        Pattern patternForGettingTownInfo = Pattern.compile(town + ":([A-Za-z0-9., ]*)");
        Matcher matcherForGettingTownInfo = patternForGettingTownInfo.matcher(strng);
        String infoAboutTownWithoutNameMonths;
        if (matcherForGettingTownInfo.find()) {
            infoAboutTownWithoutNameMonths = matcherForGettingTownInfo.group();
        } else {
            listRainValue.add(-1.0);
            return listRainValue;
        }
        Pattern patternForRainValues = Pattern.compile("(\\d+.\\d+)");
        Matcher matcherForRainValues = patternForRainValues.matcher(infoAboutTownWithoutNameMonths);
        while (matcherForRainValues.find()) {
            listRainValue.add(Double.parseDouble(matcherForRainValues.group()));
        }
        return listRainValue;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        List<String> nbaGames = Arrays.stream(resultSheet.split(",")).filter(x -> x.contains(toFind + " ")).collect(Collectors.toList());
        if (toFind.isEmpty()) {
            return "";
        }
        if (nbaGames.isEmpty()) {
            return toFind + ":This team didn't play!";
        }
        List<String[]> teams = nbaGames.stream().map(game -> game.split("\\s\\d+(\\W|$)")).collect(Collectors.toList());
        List<Integer[]> scores = nbaGames.stream()
                .map(game -> Arrays.stream(game.split(" "))
                        .filter(x -> x.matches("\\d+"))
                        .map(Integer::valueOf).toArray(Integer[]::new))
                .collect(Collectors.toList());
        int wins = 0, draws = 0, lose = 0, scored = 0, conceded = 0, points = 0;
        for (int i = 0; i < teams.size(); i++) {
            try {
                boolean draw = scores.get(i)[0].equals(scores.get(i)[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Error(float number):" + nbaGames.get(i);
            }
            boolean teamFirst = teams.get(i)[0].equals(toFind);
            if (teamFirst) {
                scored += scores.get(i)[0];
                conceded += scores.get(i)[1];
            } else {
                scored += scores.get(i)[1];
                conceded += scores.get(i)[0];
            }
            if (scores.get(i)[0].equals(scores.get(i)[1])) {
                draws++;
                points++;
            } else if (scores.get(i)[0] < scores.get(i)[1]) {
                if (teamFirst) {
                    lose++;
                } else {
                    wins++;
                    points += 3;
                }
            } else {
                if (teamFirst) {
                    wins++;
                    points += 3;
                } else {
                    lose++;
                }
            }
        }
        return String.format(toFind + ":W=%s;D=%s;L=%s;Scored=%s;Conceded=%s;Points=%s",
                wins, draws, lose, scored, conceded, points);

    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> mapResult = new HashMap<>();
        for (String firsLetter : lstOf1stLetter) {
            mapResult.put(firsLetter, 0);
        }
        for (String artElem : lstOfArt) {
            String firstLetter = artElem.charAt(0) + "";
            if (mapResult.containsKey(firstLetter)) {
                int numbOfArt = Integer.parseInt(artElem.substring(artElem.indexOf(" ") + 1));
                mapResult.replace(firstLetter, mapResult.get(firstLetter) + numbOfArt);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry entry : mapResult.entrySet()) {
            result.append(String.format("(%s : %s) - ", entry.getKey(), entry.getValue()));
        }
        result.deleteCharAt(result.lastIndexOf("-"));
        return result.toString().trim();
    }
}
