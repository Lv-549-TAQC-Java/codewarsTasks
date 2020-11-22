package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;

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
        return null;
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
        return null;
    }
}
