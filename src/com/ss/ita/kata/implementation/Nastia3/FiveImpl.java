package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Five;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        List<Long> primes = new ArrayList<Long>();
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        Long[] arr = new Long[primes.size()];
        arr = primes.toArray(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] == g){
                return new long[] {arr[i], arr[i+1]};
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int zeros = 0;
        double k = 1;
        while(k <= (Math.log(n)/Math.log(5))){
            zeros += n / Math.pow(5,k);
            k++;
        }
        return zeros;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger[] f = new BigInteger[(n.intValue())+2];
        f[0] = BigInteger.ZERO;
        f[1] = BigInteger.ONE;
        BigInteger sum = BigInteger.valueOf(1);

        for (int i = 2; i < (n.intValue())+2; ++i) {
            f[i] = f[i - 1].add(f[i - 2]) ;
            sum = sum.add(f[i]);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }


    static boolean isPrime(long  n)
    {
        if (n <= 1)
            return false;

        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
