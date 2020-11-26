package com.ss.ita.util.implementation;

import com.ss.ita.util.Scanner;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
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

        while (true) {
            if (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] str1 = str.trim().split("\\s+");
                int [] arr = new int[str1.length];
                try{
                    for(int i =0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(str1[i]);
                    }
                }
                catch (NumberFormatException error){
                    System.out.println("incorrect input int[]");
                    continue;
                }
                return arr;

            } else {
                System.out.println("incorrect input int[]");
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
        while (true) {
            if (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] str1 = str.trim().split("\\s+");
                double[] arr = new double[str1.length];
                try{
                    for(int i=0; i<arr.length; i++){
                        arr[i] = Double.parseDouble(str1[i]);
                    }
                }
               catch (NumberFormatException error ){
                   System.out.println("Incorrect input, double[]");
                   continue;
               }
                return arr;
            } else {
                System.out.println("Incorrect input, double[]");
            }

        }

    }


    @Override
    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.next();
            } else {
                scanner.next();
                System.out.println("Incorrect format(String). Try again...");
            }
        }
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
