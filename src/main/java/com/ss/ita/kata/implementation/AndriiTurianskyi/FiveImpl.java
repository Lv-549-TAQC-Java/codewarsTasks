package com.ss.ita.kata.implementation.AndriiTurianskyi;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        boolean goDown = false;
        int count = 1;
        int maxCountSections = 1;
        for (int i = 0; i < v.length - 1; i++) {
            if (!goDown && v[i] <= v[i + 1]) {
                count++;
            } else if (!goDown && v[i] > v[i + 1]) {
                goDown = true;
                count++;
            } else if (goDown && v[i] >= v[i + 1]) {
                count++;
            } else if (goDown && v[i] < v[i + 1]) {
                goDown = false;
                count = 2;
            }
            if (maxCountSections < count) {
                maxCountSections = count;
            }
        }
        return maxCountSections;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        for (long i=m;i<=n;i++){
            if (isPrime(i)){
                result[0]=i;
                for (long j=i+1;j<=n;j++){
                    if (isPrime(j)){
                        result[1]=j;
                        if (result[1]-result[0]==g){
                            return result;
                        }else {
                            break;
                        }
                    }
                }
            }
        }
        return null;
    }
    private boolean isPrime(long n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }


    @Override
    public int zeros(int n) {
        int countDivNumbOfFive = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                countDivNumbOfFive++;
            }
            if ((i % 5) == 0 && ((i / 5) * 2) % 10 == 0) {
                countDivNumbOfFive++;
            }
        }
        return countDivNumbOfFive;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger lengthN0=BigInteger.ONE;
        BigInteger lengthN1=BigInteger.ONE;
        BigInteger sumOfSides=lengthN0.add(lengthN1);
        for (int i=3;i<=n.intValue()+1;i++){
            BigInteger nextSquare =lengthN0.add(lengthN1);
            sumOfSides=sumOfSides.add(nextSquare);
            lengthN0=lengthN1;
            lengthN1=nextSquare;
        }
        return sumOfSides.multiply(BigInteger.valueOf(4L));
    }

    @Override
    public double solveSum(double m) {
        double m1 = ((2 * m + 1) - Math.sqrt(4 * m + 1)) / (2 * m);
        double m2 = ((2 * m + 1) + Math.sqrt(4 * m + 1)) / (2 * m);
        if (m1 > 0 && m1 < 1) return m1;
        else if (m2 > 0 && m2 < 1) return m2;
        else throw new RuntimeException("couldn't find result for m=" + m);
    }

    @Override
    public long[] smallest(long n) {
        long[] smallestRes = new long[]{n, 0, 0};
        StringBuilder oldDigit = new StringBuilder(String.valueOf(n));
        StringBuilder chDigit = new StringBuilder(oldDigit);
        for (int i = 0; i < oldDigit.length(); i++) {
            char elemForChange = oldDigit.charAt(i);
            chDigit.deleteCharAt(i);
            for (int j = 0; j <= chDigit.length(); j++) {
                chDigit.insert(j, elemForChange);
                if (Long.parseLong(chDigit.toString()) == smallestRes[0] && smallestRes[1] > i) {
                    smallestRes = new long[]{Long.parseLong(chDigit.toString()), i, j};
                }
                if (Long.parseLong(chDigit.toString()) < smallestRes[0]) {
                    smallestRes = new long[]{Long.parseLong(chDigit.toString()), i, j};
                }
                chDigit.deleteCharAt(j);
            }
            chDigit.insert(i, elemForChange);
        }
        return smallestRes;
    }
    }

