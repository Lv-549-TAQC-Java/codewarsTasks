package com.ss.ita.util.implementation;

import com.ss.ita.util.Scanner;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ConsoleScanner implements Scanner {
    private final java.util.Scanner scanner;

    public ConsoleScanner() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public int readInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return Integer.parseInt(scanner.next());
            } else {
                scanner.next();
                System.out.println("Incorrect format(int). Try again...");
            }
        }
    }

    @Override
    public long readLong() {
        return 0;
    }

    @Override
    public int[] readIntArray() {
        return new int[0];
    }

    @Override
    public float readFloat() {
        return 0;
    }

    @Override
    public double readDouble() {
        return 0;
    }

    @Override
    public double[] readDoubleArray() {
        return new double[0];
    }

    @Override
    public String readString() {
        return null;
    }

    @Override
    public String[] readStringArray() {
        List<String> result = new ArrayList<>();
        while (true) {
            System.out.println("Enter some string, in case you want to finish press enter");
            String stringToBeAdded = scanner.nextLine();
            if (!stringToBeAdded.isEmpty()) {
                result.add(stringToBeAdded);
            } else {
                return result.toArray(String[]::new);
            }
        }
    }

    @Override
    public BigInteger readBigInt() {
        return null;
    }
}
