package com.pc;

import java.util.function.Function;

public class Functionarray1 {
    public static void main(String[] args) {
    int arr[] = {10, 20, 15, 40};
    Integer r1 = sum(arr, (x) -> x);
        System.out.println(r1);
        Function<Integer, Boolean> isPrime = (x) -> {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            return count == 2;
        };

        boolean b = isPrime.apply(2);
        System.out.println(b);

    }

    public static int sum(int arr[], Function<Integer, Integer> fun) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + fun.apply(arr[i]);

        }
        return sum;
    }
}



