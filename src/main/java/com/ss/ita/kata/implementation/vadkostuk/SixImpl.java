package com.ss.ita.kata.implementation.vadkostuk;

import com.ss.ita.kata.Six;
import java.math.BigDecimal;
import java.math.MathContext;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long n = 0;
        long v=  0;
        while (v<m){
            n++;
            v+= n*n*n;
        }
        if (v!=m){
            return -1;
        }
        return n;
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\s]+");
        double originalBalance =  Double.parseDouble(arr[0]);
        double totalSum =0;
        int countForAverage =0;

        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("Original Balance: %.2f",originalBalance));
        for (int i = 1; i < arr.length; i=i+3){
            countForAverage++;
            originalBalance = originalBalance - Double.parseDouble(arr[i+2]);
            totalSum = totalSum+Double.parseDouble(arr[i+2]);
            resultString.append(String.format("\r\n%s %s %s Balance %.2f", arr[i], arr[i+1], arr[i+2], originalBalance));
        }
        resultString.append(String.format("\r\nTotal expense  %.2f\r\nAverage expense  %.2f", totalSum, totalSum / countForAverage)  );
        return resultString.toString();
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        if (!strng.contains(town + ":")) {
            return -1;
        }
        String[] s = strng.split("\\n");
        StringBuilder sb = new StringBuilder();
        int currentArr = 0;
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            if (sb.indexOf(town) != -1) {
                currentArr = i;
                break;
            }
        }
        String[] deleteTownName = s[currentArr].split(":");
        String[] dayAndRain = deleteTownName[1].split(",");
        int count = 0;
        double totalRain = 0;
        for (String value : dayAndRain) {
            String rainValString = value.replaceAll("[a-zA-Z]", "").trim();
            totalRain = totalRain + Double.parseDouble(rainValString);
            count++;
        }
        return totalRain / count;
    }

    @Override
    public double variance(String town, String strng) {
        if (!strng.contains(town + ":")) {
            return -1;
        }
        String[] s = strng.split("\\n");
        StringBuilder sb = new StringBuilder();
        int currentArr = 0;
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            if (sb.indexOf(town) > -1) {
                currentArr = i;
                break;
            }
        }
        String[] deleteTownName = s[currentArr].split(":");
        String[] dayAndRain = deleteTownName[1].split(",");
        int count = 0;
        double totalRain = 0;
        double multiNumb = 0;
        for (String value : dayAndRain) {
            String rainValString = value.replaceAll("[a-zA-Z]", "").trim();
            totalRain = totalRain + Double.parseDouble(rainValString);
            multiNumb = multiNumb + Math.pow(Double.parseDouble(rainValString), 2);
            count++;
        }
        return (multiNumb / count) - Math.pow((totalRain / count), 2);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        int w = 0;
        int d = 0;
        int l = 0;
        int pt = 0;
        int pl = 0;
        int mk = 0;
        if (toFind.equals("")) {return "";}
        boolean found = false;
        String r = resultSheet.replaceAll("([0-9.]) ","$1-");
        r = r.replaceAll(" ([0-9.]*)(-)","_$1$2").replaceAll(" ([0-9.]*)(,)","_$1$2").replaceAll(" ([0-9.]*)$","_$1");
        String[] p = r.split(",");
        for (String s : p) {
            String[] match = s.split("-");
            String[] matchA = match[0].split("_");
            String teamA = matchA[0];
            int pointsA = -1;
            try {
                pointsA = Integer.parseInt(matchA[1]);
            } catch (Exception e) {
                return "Error(float number):" + s.replaceAll("-", " ").replaceAll("_", " ");
            }
            String[] matchB = match[1].split("_");
            String teamB = matchB[0];
            int pointsB = -1;
            try {
                pointsB = Integer.parseInt(matchB[1]);
            } catch (Exception e) {
                return "Error(float number):" + s.replaceAll("-", " ").replaceAll("_", " ");
            }
            if (teamA.equals(toFind)) {
                found = true;
                if (pointsA > pointsB) {
                    w++;
                    mk += 3;
                } else if (pointsA == pointsB) {
                    d++;
                    mk += 1;
                } else {
                    l++;
                }
                pt += pointsA;
                pl += pointsB;
            }
            if (teamB.equals(toFind)) {
                found = true;
                if (pointsB > pointsA) {
                    w++;
                    mk += 3;
                } else if (pointsA == pointsB) {
                    d++;
                    mk += 1;
                } else {
                    l++;
                }
                pt += pointsB;
                pl += pointsA;
            }
        }
        if (!found){
            return toFind +":This team didn't play!";
        }
        return toFind + ":W=" + w +";D="+d+";L="+l+";Scored="+pt+";Conceded="+pl+";Points="+mk;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (String item : lstOf1stLetter) {
            int total = 0;
            for (String value : lstOfArt) {
                if (value.substring(0, 1).equals(item)) {
                    String[] s = value.split("\\s");
                    total = total + Integer.parseInt(s[1]);
                }
            }
            res.append(" - (").append(item).append(" : ").append(total).append(")");
        }
        return res.substring(3);
    }
}
