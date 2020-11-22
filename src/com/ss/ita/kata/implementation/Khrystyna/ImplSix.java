package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Six;
import java.util.HashMap;
import java.util.Map;
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
        return 0;
    }

    @Override
    public double variance(String town, String string) {
        return 0;
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
