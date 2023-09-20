package com.pc;

import java.util.function.Function;

public class PassingFunctionsEx {
    public static void main(String[] args) {
        Function<String, String> tup = x -> x.toUpperCase();
        Function<Integer, Integer> tup1 = y -> y + y;
        f1(tup, tup1);
    }

    static void f1(Function<String, String> upperFun, Function<Integer, Integer> mulFun) {
        String s = upperFun.apply("king");
        System.out.println(s);
        int i = mulFun.apply(1);
        System.out.println(i);
    }

}
