package com.ss.ita.menu;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;
import com.ss.ita.util.Scanner;
import com.ss.ita.util.implementation.ConsoleScanner;

import java.util.Arrays;

import java.math.BigInteger;

import java.util.Arrays;

public class Runner {
    private Eight impl8;
    private Seven impl7;
    private Six impl6;
    private Five impl5;
    private Scanner scanner;

    public Runner() {
        scanner = new ConsoleScanner();

    }

    public Runner(UserNames whose) {
        scanner = new ConsoleScanner();
        setImpl(whose);
        System.out.println(whose);

    }


    public void setImpl(UserNames whose) {

        switch (whose) {
            case HANNA: {
                this.impl8 = new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.HannaVasiunyk.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.HannaVasiunyk.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl();
                break;
            }
            case KHRYSTYNA: {
                this.impl8 = new com.ss.ita.kata.implementation.Khrystyna.ImplEight();
                this.impl7 = new com.ss.ita.kata.implementation.Khrystyna.ImplSeven();
                this.impl6 = new com.ss.ita.kata.implementation.Khrystyna.ImplSix();
                this.impl5 = new com.ss.ita.kata.implementation.Khrystyna.ImplFive();
                break;
            }
            case VADYM: {
                this.impl8 = new com.ss.ita.kata.implementation.vadkostuk.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.vadkostuk.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.vadkostuk.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.vadkostuk.FiveImpl();
                break;
            }
            case MIKE: {
                this.impl8 = new com.ss.ita.kata.implementation.mike.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.mike.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.mike.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.mike.FiveImpl();
                break;
            }
            case MARIA: {
                this.impl8 = new com.ss.ita.kata.implementation.Maria.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Maria.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Maria.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Maria.FiveImpl();
                break;
            }
            case ANDRII: {
                this.impl8 = new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.AndriiTurianskyi.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl();
                break;
            }
            case NASTIA: {
                this.impl8 = new com.ss.ita.kata.implementation.Nastia3.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Nastia3.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Nastia3.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Nastia3.FiveImpl();
                break;
            }
            case YURII: {
                this.impl8 = new com.ss.ita.kata.implementation.Krynytsky.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Krynytsky.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Krynytsky.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Krynytsky.FiveImpl();
                break;
            }

        }


    }

    public String runTask1() {
        System.out.println("run task Keep Hydrated!");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.liters(input));
        System.out.println(res);
        return res;
    }

    public String runTask2() {
        System.out.println("run task Volume of a cuboid");
        System.out.println("Enter double length");
        double length = scanner.readDouble();
        System.out.println("Enter double width");
        double width = scanner.readDouble();
        System.out.println("Enter double height");
        double height = scanner.readDouble();
        String res = String.valueOf(impl8.getVolumeOfCuboid(length, width, height));
        System.out.println(res);
        return res;
    }

    public String runTask3() {
        System.out.println("run task Miles per gallon to kilometers per liter");
        System.out.println("Enter float Miles per gallon");
        float mpg = scanner.readFloat();
        String res = String.valueOf(impl8.mpgToKPM(mpg));
        System.out.println(res);
        return res;
    }

    public String runTask4() {
        System.out.println("run task To square root or no to square");
        System.out.println("Enter int[] array");
        int[] array = scanner.readIntArray();
        String res = Arrays.toString(impl8.squareOrSquareRoot(array));
        System.out.println(res);
        return res;
    }

    public String runTask5() {
        System.out.println("countPositivesSumNegatives");
        System.out.println("Enter int[]");
        int[] input = scanner.readIntArray();
        String res = Arrays.toString(impl8.countPositivesSumNegatives(input));
        System.out.println(res);
        return res;
    }

    public String runTask6() {
        System.out.println("Convert a String to a Number");
        System.out.println("Enter String");
        String input = scanner.readString();
        String res = String.valueOf(impl8.stringToNumber(input));
        System.out.println(res);
        return res;
    }

    public String runTask7() {
        System.out.println("Wilson primes");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.amIWilson(input));
        System.out.println(res);
        return res;
    }

    public String runTask8(){
        System.out.println("Formatting decimal places\nEnter double variable:");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.twoDecimalPlaces(input));
        System.out.println(res);
        return res;
    }

    public String runTask9(){
        System.out.println("Find numbers which are divisible by given number\nEnter int[] variable:");
        int[] input1 = scanner.readIntArray();
        System.out.println("Enter int variable");
        int input2 = scanner.readInt();
        String res = Arrays.toString(impl8.divisibleBy(input1, input2));
        System.out.println(res);
        return res;
    }
    public String runTask10() {
        System.out.println("Looking for a benefactor\nEnter double[] variable:");
        double[] input1 = scanner.readDoubleArray();
        System.out.println("Enter double variable:");
        double input2 = scanner.readDouble();
        String res = String.valueOf(impl7.newAvg(input1, input2));
        System.out.println(res);
        return res;
    }

    public String runTask11(){
        System.out.println("run task Sum of the first nth term of Series");
        System.out.println("Enter int number");
        int input = scanner.readInt();
        String res = String.valueOf(impl7.seriesSum(input));
        System.out.println(res);
        return res;
    }
    public String runTask12(){
        System.out.println("run task Where is Vasya?");
        System.out.println("Enter 3 int number");
        System.out.println("input1:");
        int input1 = scanner.readInt();
        System.out.println("input2:");
        int input2 = scanner.readInt();
        System.out.println("input3:");
        int input3 = scanner.readInt();
        String res = String.valueOf(impl7.whereIsHe( input1, input2, input3));
        System.out.println(res);
        return res;
    }

    public void runTask13() {
        System.out.println("run task Build a pile of Cubes");
        System.out.println("Enter long:");
        long input = scanner.readLong();
        long res = impl6.findNb(input);
        System.out.println("Result is:\n" + res);
    }

    public void runTask14() {
        System.out.println("run task Easy balance checking");
        String input = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45" +
                "\n128 Book :14.32\n129 Gasoline ::16.10";
        System.out.println("We have such input for run:\n" + input);
        System.out.println("\nDo you want to change it?\n1-Yes\n2-No");
        if (scanner.readInt() == 1) {
            input = scanner.readString();
        }
        String res = impl6.balance(input);
        System.out.println("Result is:\n" + res);
    }

    public void runTask15() {
        System.out.println("run task Floating-point Approximation (I)");
        System.out.println("Enter double:");
        double input = scanner.readDouble();
        double res = impl6.f(input);
        System.out.println("Result is:\n" + res);
    }

    public void runTask16() {
        System.out.println("run task Rainfall");
        String input1 =
                "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" +
                        "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                        "\n" +
                        "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" +
                        "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" +
                        "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" +
                        "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" +
                        "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +
                        "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +
                        "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                        "\n" +
                        "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";
        String input2 = "London";
        System.out.println("We have such data for input:\n" + input1 + "\n and town - London" );
        System.out.println("\nDo you want to change it?\n1-Yes\n2-No");
        if (scanner.readInt() == 1) {
            input1 = scanner.readString();
            input2 = scanner.readString();
        }
        String res1 = Double.toString(impl6.mean(input2, input1));
        String res2 = Double.toString(impl6.variance(input2, input1));
        System.out.println("Result is:\n" +  "Mean: " + res1 + "\nVariance: " + res2);
    }

    public void runTask17() {
        System.out.println("run task Ranking NBA teams");
        String input1 = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
        String input2 = "Boston Celtics";
        System.out.println("We have such data for input:\n" + input1 + "\n and town - London" );
        System.out.println("\nDo you want to change it?\n1-Yes\n2-No");
        if (scanner.readInt() == 1) {
            input1 = scanner.readString();
            input2 = scanner.readString();
        }
        String res = impl6.nbaCup(input1, input2);
        System.out.println("Result is:\n" + res);
    }

    public void runTask18() {
        System.out.println("run task Help the bookseller !");
        String[] input1 = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] input2 =  new String[] {"A", "B"};
        System.out.println("We have such data for input:\n" + "the stocklist: " + input1 + "\n and categories: " + input2 );
        System.out.println("\nDo you want to change it?\n1-Yes\n2-No");
        if (scanner.readInt() == 1) {
            input1 = scanner.readStringArray();
            input2 = scanner.readStringArray();
        }
        String res = impl6.stockSummary(input1, input2);
        System.out.println("Result is:\n" + res);
    }

    public void runTask19() {
        System.out.println("run task Artificial Rain");
        System.out.println("Enter int[] value, for finish array press Enter");
        int[] input = scanner.readIntArray();
        String res = String.valueOf(impl5.artificialRain(input));
        System.out.println("Result: " + res);
    }

    public void runTask20() {
        System.out.println("run task Gap in Primes");
        System.out.println("Enter (int g, long m, long n) where:" +
                "\ng->(integer >= 2) which indicates the gap we are looking for" +
                "\nm->(integer > 2) which gives the start of the search (m inclusive)" +
                "\nn-> (integer >= m) which gives the end of the search (n inclusive)");
        System.out.println("Enter g:");
        int inputG = scanner.readInt();
        System.out.println("Enter m:");
        long inputM = scanner.readLong();
        System.out.println("Enter n:");
        long inputN = scanner.readLong();
        String res = Arrays.toString(impl5.gap(inputG, inputM, inputN));
        System.out.println("Result: " + res);
    }

    public void runTask21() {
        System.out.println("run task Trailing zeros in factorial");
        System.out.println("Enter your number (int)");
        int input = scanner.readInt();
        String res = String.valueOf(impl5.zeros(input));
        System.out.println("Result: " + res);
    }

    public String runTask22() {
        System.out.println("Perimeter of squares in a rectangle");
        System.out.println("Enter Big Integer:");
        BigInteger input = scanner.readBigInt();
        String res = String.valueOf(impl5.perimeter(input));
        System.out.println(res);
        return res;
    }

    public String runTask23() {
        System.out.println("Which x for that sum");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl5.solveSum(input));
        System.out.println(res);
        return res;
    }

    public String runTask24() {
        System.out.println("Find the smallest");
        System.out.println("Enter long");
        long input = scanner.readLong();
        String res = Arrays.toString(impl5.smallest(input));
        System.out.println(res);
        return res;
    }
}
