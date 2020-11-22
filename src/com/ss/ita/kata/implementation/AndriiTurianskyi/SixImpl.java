package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        BigDecimal value = new BigDecimal(x);
        return value.add(BigDecimal.ONE).sqrt(MathContext.DECIMAL128).subtract(BigDecimal.ONE).doubleValue();
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
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
