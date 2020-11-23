package com.ss.ita.kata.implementation.Khrystyna;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class ImplFive implements Five {
    @Override
    public int artificialRain(final int[] v) {
        int max = 1;
        for (int i = 0; i < v.length; i++) {
            int current = artificialRainToIndex(v, i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    private int artificialRainToIndex(int[] v, int index) {
        int count = 1;
        if (index > 0) {
            for (int indexReverce = index; indexReverce > 0; indexReverce--) {
                if (v[indexReverce - 1] <= v[indexReverce]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        if (index < v.length - 2) {
            for (int i = index + 1; i < v.length; i++) {
                if (v[i] <= v[i - 1]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        for (long i = m; i <= n - g; i++) {
            if (isPrime(i) && isPrime((i + g))) {
                boolean hasPrime = false;
                for (long j = i + 1; j < i + g; j++) {
                    if (isPrime(j)) {
                        hasPrime = true;
                        break;
                    }
                }
                if (!hasPrime) {
                    return new long[]{i, i + g};
                }
            }
        }
        return null;
    }

    public boolean isPrime(long number) {
        for (long i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        while (n > 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger previous1 = BigInteger.ZERO;
        BigInteger previous2 = BigInteger.ONE;
        BigInteger perimeter = BigInteger.ONE;
        for (long N = n.longValue(); N > 0; N--) {
            BigInteger next = previous1.add(previous2);
            previous1 = previous2;
            previous2 = next;
            perimeter = perimeter.add(next);
        }
        return perimeter.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double x = Math.sqrt(4 * m + 1);
        return ((2 * m + 1) - x) / (2 * m) > 0 && ((2 * m + 1) - x) / (2 * m) < 1
                ? ((2 * m + 1) - x) / (2 * m)
                : ((2 * m + 1) + x) / (2 * m);
    }

    private static int smallestIndex(String number) {
        char smallestChar = number.charAt(0);
        int index = 0;
        for (int i = 1; i < number.length(); i++) {
            if (smallestChar >= number.charAt(i)) {
                smallestChar = number.charAt(i);
                index = i;
            }
        }
        return index;
    }

    private static int smallestIndexToReplaceFirst(String number) {
        char[] numbers = number.toCharArray();
        int index = 1;
        while (numbers[index] < numbers[0] && index < numbers.length - 1) {
            index++;
        }
        return index;
    }

    @Override
    public long[] smallest(long n) {
        String number = String.valueOf(n);
        int index = 0;
        while (index == smallestIndex(number.substring(index))) {
            index++;
        }
        int indexFrom = smallestIndex(number.substring(index)) + index;
        int indexTo = index;
        if (indexTo == 0 && indexFrom == 1) {
            indexFrom = 0;
            indexTo = 1;
        }
        if (number.charAt(indexFrom) == number.charAt(1)) {
            indexFrom = 0;
            indexTo = smallestIndexToReplaceFirst(number);
        }
        return new long[]{
                replace(number, indexFrom, indexTo),
                indexFrom,
                indexTo
        };
    }

    private long replace(String number, int indexFrom, int indexTo) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (i == indexFrom) {
                continue;
            }
            if (i == indexTo && indexFrom > indexTo) {
                result.append(number.charAt(indexFrom));
            }
            result.append(number.charAt(i));
            if (i == indexTo && indexFrom < indexTo) {
                result.append(number.charAt(indexFrom));
            }
        }
        return Long.parseLong(result.toString());
    }
}

