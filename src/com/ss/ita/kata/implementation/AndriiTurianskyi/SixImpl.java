package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SixImpl implements Six {

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

}
