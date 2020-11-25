package com.ss.ita.menu;

import com.ss.ita.kata.Six;

import java.util.HashMap;
import java.util.Map;

public class KataSix implements Kata {

    private Map<String, Six> implSix;


    public KataSix() {
        implSix = new HashMap<>();
        addImpls();
    }

    private void addImpls() {
        implSix.put("Andrii", new com.ss.ita.kata.implementation.AndriiTurianskyi.SixImpl());
        implSix.put("Hanna", new com.ss.ita.kata.implementation.HannaVasiunyk.SixImpl());
        implSix.put("Khrystyna", new com.ss.ita.kata.implementation.Khrystyna.ImplSix());
        implSix.put("Yurii", new com.ss.ita.kata.implementation.Krynytsky.SixImpl());
        implSix.put("Maria", new com.ss.ita.kata.implementation.Maria.SixImpl());
        implSix.put("Mike", new com.ss.ita.kata.implementation.mike.SixImpl());
        implSix.put("Nastia", new com.ss.ita.kata.implementation.Nastia3.SixImpl());
        implSix.put("Vadym", new com.ss.ita.kata.implementation.vadkostuk.SixImpl());
    }

    @Override
    public Integer getNumber() {
        return 6;
    }

    @Override
    public void runMethod(Integer numberOfMethod, String user) {
        Six six = implSix.get(user);
        switch (numberOfMethod) {
            case 1:
                System.out.println("Result is:"+ six.findNb(12));
                break;
            case 2:
                System.out.println("Result is: " + six.balance("1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10"));
            case 3:
                System.out.println("Result is: " + six.f(12));
                break;
            case 4:
                String rainfall="Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                        "\n" + "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                        "\n" + "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7" +
                        "\n" + "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2" +
                        "\n" + "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5" +
                        "\n" + "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2" +
                        "\n" + "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4" +
                        "\n" +"Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4" +
                        "\n" +"Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7" +
                        "\n" + "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";
                String city = "Rome";
                System.out.println("Result is: For mean:" + six.mean( city,rainfall)+"\nfor variance:"+ six.variance(city,rainfall));
                break;
            case 5:
                System.out.println("Result is: " + six.nbaCup("Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
                        + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
                        + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
                        + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
                        + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
                        + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
                        + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,","Boston Celtics"));
                break;
            case 6:
                System.out.println("Result is: " + six.stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},new String[] {"A", "B"}));
                break;
            default:
                throw new IllegalStateException("We haven`t method with this number");
        }
    }
}
