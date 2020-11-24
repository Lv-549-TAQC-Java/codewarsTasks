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
        while (true) {
            if (scanner.hasNextLong()) {
                return Long.parseLong(scanner.next());
            } else {
                scanner.next();
                System.out.println("Incorrect format(long). Try again...");
            }
        }
    }

    @Override
    public int[] readIntArray() {
        List<Integer> integers = new ArrayList<>();
        while (true) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else if(!scanner.hasNext()) {
                int[] newInt = new int[integers.size()];
                for (int i = 0; i < integers.size(); i++) {
                    newInt[i] = integers.get(i);
                }
                return newInt;
            }
        }
    }

    @Override
    public float readFloat() {
        while (true) {
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            } else {
                scanner.next();
                System.out.println("Incorrect format(float). Try again...");
            }
        }
    }

    @Override
    public double readDouble() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                scanner.next();
                System.out.println("Incorrect format(double). Try again...");
            }
        }
    }

    @Override
    public double[] readDoubleArray() {
        List<Double> doubles = new ArrayList<>();
        while (true) {
            Double number = scanner.nextDouble();
            if (number != null) {
                doubles.add(number);
            } else {
                double[] doubleArray=new double[doubles.size()];
                for (int i=0;i<doubles.size();i++){
                    doubleArray[i]=doubles.get(i);
                }
                return doubleArray;
            }
        }

    }

    @Override
    public String readString() {
        return null;
    }

    @Override
    public String[] readStringArray() {
        List<String> listStr = new ArrayList<>();
        while (true) {
            System.out.println("Enter some string, in case you want to finish press enter");
            String stringToBeAdded = scanner.nextLine();
            if (!stringToBeAdded.isEmpty()) {
                listStr.add(stringToBeAdded);
            } else {
                String[] arrStrResult=new String[listStr.size()];
                for (int i=0;i<listStr.size();i++){
                    arrStrResult[i]=listStr.get(i);
                }
                return arrStrResult;
            }
        }
    }

    @Override
    public BigInteger readBigInt() {
        while (true) {
            if (scanner.hasNextBigInteger()) {
                return new BigInteger(scanner.nextLine());
            } else {
                scanner.next();
                System.out.println("Incorrect format(big integer). Try again...");
            }
        }
    }
}
