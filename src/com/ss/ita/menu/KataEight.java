package com.ss.ita.menu;

import com.ss.ita.kata.Eight;

import java.util.Arrays;
import java.util.Map;

public class KataEight implements Kata {
    private Map<String, Eight> implEight;

    @Override
    public Integer getNumber() {
        return 8;
    }

    @Override
    public void runMethod(Integer numberOfMethod, String user) {
        Eight eight = implEight.get(user);
        switch (numberOfMethod) {
            case 1: {
                System.out.println("Input " + 2);
                System.out.println("Result: " + eight.liters(2));
                break;
            }
            case 2: {
                System.out.println("Input " + "1,2,2");
                System.out.println("Result: " + eight.getVolumeOfCuboid(1, 2, 2));
                break;
            }
            case 3: {
                System.out.println("Input " + 20);
                System.out.println("Result: " + eight.mpgToKPM(20));
                break;
            }
            case 4: {
                System.out.println("Input [4,3,9,7,2,1]");
                System.out.println("Result: " + Arrays.toString(eight.squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1})));
                break;
            }
            case 5: {
                System.out.println("Input: [10,-65]");
                System.out.println("Result: " + Arrays.toString(eight.countPositivesSumNegatives(new int[]{10, -65})));
                break;
            }
            case 6: {
                System.out.println("Input: " + 1234);
                System.out.println("Result: " + eight.stringToNumber("1234"));
                break;
            }
            case 7: {
                System.out.println("Input: " + 5);
                System.out.println("Result: " + eight.amIWilson(5));
                break;
            }
            case 8: {
                System.out.println("Input: 4.659725356");
                System.out.println("Result: " + eight.twoDecimalPlaces(4.659725356));
                break;
            }
            case 9: {
                System.out.println("Input ([1,2,3,4,5,6], 2");
                System.out.println("Result: " + Arrays.toString(eight.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
                break;
            }
            default:
                throw new IllegalStateException("We haven`t method with this number");

        }
    }
}
