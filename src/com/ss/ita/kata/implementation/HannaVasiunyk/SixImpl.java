package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SixImpl implements Six {

    private static final String NEW_LINE_CHARACTER = "\\r\\n";
    private static final String TEAMS = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
            + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
            + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
            + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
            + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
            + "Golden State Warriors,Dallas Mavericks";

    @Override
    public long findNb(long m) {
        int i = 1;
        while ( m > 0){
            m -= Math.pow(i, 3);
            i++;
            if (m < 0) {
                return -1;
            }
        }
        return i-1;
    }

    @Override
    public String balance(String book) {
        book = book.replaceAll("[^a-zA-z0-9.\\s]", "");
        String[] lines = book.split("\\n");
        StringBuilder result = new StringBuilder();
        double totalExpense = 0;
        int expenseCount = 0;

        result.append("Original Balance: ").append(lines[0]).append(NEW_LINE_CHARACTER);
        double balance = Double.parseDouble(lines[0]);

        for (int i = 1; i < lines.length; i++) {
            double localBalance;
            if (!lines[i].isEmpty()) {
                String[] records = lines[i].split(" ");
                localBalance = balance - Double.parseDouble(records[2]);
                balance = localBalance;
                result.append(lines[i]).append(" Balance ").append(String.format("%.2f", localBalance)).append(NEW_LINE_CHARACTER);
                totalExpense += Double.parseDouble(records[2]);
                expenseCount++;
            }
        }
        result.append("Total expense  ").append(String.format("%.2f", totalExpense)).append(NEW_LINE_CHARACTER);
        result.append("Average expense  ").append(String.format("%.2f", totalExpense / expenseCount));
        return result.toString().replaceAll(",", ".");
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
    }

    @Override
    public double mean(String town, String strng) {
        String[] rainfalls = getRainfallsDataByCity(town, strng);
        double rainfallSum = 0;
        int rainfallCounter = 0;

        for (String rainfall : rainfalls) {
            rainfallSum += Double.parseDouble(rainfall.split(" ")[1]);
            rainfallCounter++;
        }
        return rainfallSum / rainfallCounter;
    }

    @Override
    public double variance(String town, String strng) {
        String[] rainfalls = getRainfallsDataByCity(town, strng);
        double avg = mean(town, strng);
        double rainfallSum = 0;
        int rainfallCounter = 0;
        for (String rainfall : rainfalls) {
            rainfallSum += Math.pow(Double.parseDouble(rainfall.split(" ")[1]) - avg, 2);
            rainfallCounter++;
        }
        return rainfallSum / rainfallCounter;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (resultSheet == null || resultSheet.isEmpty() || toFind == null || toFind.isEmpty()) {
            return "";
        }
        String[] games = resultSheet.split(",");
        List<String> gameList = Arrays.stream(games)
                .filter(match -> match.contains(toFind))
                .collect(Collectors.toList());
        return getStatistic(gameList, toFind);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return " ";
        }
        StringBuilder result = new StringBuilder();
        for (String item : lstOf1stLetter) {
            int count = 0;
            for (String value : lstOfArt) {
                if (value.substring(0, 1).equals(item)) {
                    String[] s = value.split("\\s");
                    count += Integer.parseInt(s[1]);
                }
            }
            result.append(" - (").append(item).append(" : ").append(count).append(")");
        }
        return result.substring(3);
    }

    private static String getStatistic(List<String> gameList, String toFind) {
        int winners = 0;
        int draws = 0;
        int losses = 0;
        int scored = 0;
        int conceded = 0;
        int points;
        final List<String> teams = Arrays.asList(SixImpl.TEAMS.split(","));

        if (!teams.contains(toFind)) {
            return String.format("%s:This team didn't play!", toFind);
        }
        for (String gameInfo : gameList) {
            if (gameInfo.contains(".")) {
                return String.format("Error(float number):%s", gameInfo);
            }

            String hostTeam = null;
            String guestTeam = null;
            int hostResult = 0;
            int guestResult = 0;

            for (String team : teams) {
                if (gameInfo.contains(team)) {
                    if (hostTeam == null) {
                        hostTeam = team;
                        String number = gameInfo.substring(gameInfo.indexOf(hostTeam) + hostTeam.length() + 1).split(" ")[0];
                        hostResult = Integer.parseInt(number);
                    } else if (!team.equals(hostTeam)) {
                        guestTeam = team;
                        String number = gameInfo.substring(gameInfo.indexOf(guestTeam) + guestTeam.length() + 1).split(" ")[0];
                        guestResult = Integer.parseInt(number);
                        break;
                    }
                }
            }

            if ((hostResult > guestResult) && toFind.equals(hostTeam)) {
                winners++;
                scored += hostResult;
                conceded += guestResult;
            } else if ((hostResult < guestResult) && toFind.equals(hostTeam)) {
                losses++;
                scored += hostResult;
                conceded += guestResult;
            } else if ((hostResult > guestResult) && toFind.equals(guestTeam)) {
                losses++;
                scored += guestResult;
                conceded += hostResult;
            } else if ((hostResult < guestResult) && toFind.equals(guestTeam)) {
                winners++;
                scored += guestResult;
                conceded += hostResult;
            } else {
                draws++;
                scored += hostResult;
                conceded += hostResult;
            }
        }
        points = winners * 3 + draws;
        return String.format("%s:W=%s;D=%s;L=%s;Scored=%s;Conceded=%s;Points=%s", toFind, winners, draws,
                losses, scored, conceded, points);
    }

    private String[] getRainfallsDataByCity(String town, String data) {
        String[] citiesData = data.split("\\n");

        for (String cityData : citiesData) {
            String[] city = cityData.split(":");

            if (town.equals(city[0])) {
                return city[1].split(",");
            }
        }

        return new String[]{};
    }
}
