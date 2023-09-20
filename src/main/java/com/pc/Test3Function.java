package com.pc;

import java.util.function.Function;

public class Test3Function {
    public static void main(String[] args) {
        Function<Integer,Integer> fun =f1();
        int i=fun.apply(5);
        System.out.println(i);
    }
    static Function<Integer,Integer>f1(){
        Function<Integer,Integer>ml=x->x*x;
        return ml;

    }
}
