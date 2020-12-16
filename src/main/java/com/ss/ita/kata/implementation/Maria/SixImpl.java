package com.ss.ita.kata.implementation.Maria;

import com.ss.ita.kata.Six;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        double coeff =0.5;
        double result=coeff*x;
        int i=1;
        while(i<15){
            coeff*=(0.5-i)/(i+1);
            result+=coeff*Math.pow(x,i+1);
            i++;
        }
        return result;
    }

    @Override
    public double mean(String town, String strng) {
        double mean = 0;
        String lines[] = strng.split("\\r?\\n");
        String townData = "";
        for(String line : lines){
            String[] data = line.split(":");
            if(data[0].equals(town)){
                townData = data[1];
            }
        }
        if(!townData.equals("")){
            String[] dataByMonth = townData.split(",");
            for(String data : dataByMonth){
                mean += Double.valueOf(data.split(" ")[1]);
            }
            mean/=dataByMonth.length;
        } else {
            mean = -1D;
        }
        return mean;
    }

    @Override
    public double variance(String town, String strng) {
        double variance = 0;
        double mean = mean(town,strng);
        String lines[] = strng.split("\\r?\\n");
        String townData = "";
        for(String line : lines){
            String[] data = line.split(":");
            if(data[0].equals(town)){
                System.out.println(data[0]);
                townData = data[1];
            }
        }
        if(!townData.equals("")){
            String[] dataByMonth = townData.split(",");
            for(String data : dataByMonth){
                double xi = Double.valueOf(data.split(" ")[1]);
                variance += Math.pow(xi - mean,2);
            }
            variance/=dataByMonth.length;
        } else {
            variance = -1D;
        }
        return variance;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        List<String> games = Arrays.stream(resultSheet.split(",")).filter(x -> x.contains(toFind + " ")).collect(Collectors.toList());
        if (toFind.isEmpty()) {
            return "";
        }
        if (games.isEmpty()) {
            return toFind+":This team didn't play!";
        }
        List<String[]> teams = games.stream().map(game -> game.split("\\s\\d+(\\W|$)")).collect(Collectors.toList());
        List<Integer[]> scores = games.stream()
                .map(game -> Arrays.stream(game.split(" "))
                        .filter(x -> x.matches("\\d+"))
                        .map(Integer::valueOf).toArray(Integer[]::new))
                .collect(Collectors.toList());
        int wins = 0, draws = 0, lose = 0, scored = 0, conceded = 0, points = 0;
        for (int i = 0; i < teams.size(); i++) {
            try {
                boolean draw = scores.get(i)[0] == scores.get(i)[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Error(float number):" + games.get(i);
            }
            boolean teamFirst = teams.get(i)[0].equals(toFind);
            if (teamFirst) {
                scored += scores.get(i)[0];
                conceded += scores.get(i)[1];
            } else {
                scored += scores.get(i)[1];
                conceded += scores.get(i)[0];
            }
            if (scores.get(i)[0] == scores.get(i)[1]) {
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
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        String output="";

        for (String letter : lstOf1stLetter){
            int counter=0;
            for (String stock : lstOfArt){
                if (stock.charAt(0) == letter.charAt(0)){
                    String[] parts = stock.split(" ");
                    counter += Integer.parseInt(parts[1]);
                }
            }

            output += "(" + letter.charAt(0) + " : " + counter + ") - ";
        }
        output = output.replaceAll(" - $", "");
        return output;
    }
}
