package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Five;
import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {

        int best_result = 0;
        int temp_result = 0;
        int index_right = v.length - 1;

        int temp_index = 0;
        while(temp_index<v.length){
            temp_result = 0;
            for(int i = 0;i<index_right;i++){
                if(v[temp_index+i]>=v[i+temp_index+1]){
                    temp_result++;
                }
                else{
                    break;
                }
            }
            for(int j = temp_index;j>0;j--){
                if(v[j]>=v[j-1]){
                    temp_result++;
                }
                else{
                    break;
                }

            }

            if(temp_result>best_result){
                best_result = temp_result;
            }
            temp_index++;
            index_right--;
        }
        return best_result + 1;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
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
}
